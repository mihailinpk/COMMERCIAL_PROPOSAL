package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;

public class DoorPriceCalculatorImplementation implements DoorPriceCalculator {

    private DoorPosition currentDoorPosition;
    private DoorPrice currentDoorPrice;
    private long totalNumberOfDoors;

    private long calculateBySizeLeaf(Short sizeWidth, Short sizeHeigth, Integer priceLeaf, Integer priceLeafNonStandartHeigth,
        Integer priceLeafNonStandartWidth, Integer priceLeafNonStandartHeightWidth)  {

        long intermediatePrice = 0;

        if ((sizeWidth <= 1000) && (sizeHeigth <= 2000))
            intermediatePrice += priceLeaf;
        if ((sizeWidth <= 1000) && (sizeHeigth > 2000))
            intermediatePrice +=  priceLeafNonStandartHeigth;
        if ((sizeWidth > 1000) && (sizeHeigth <= 2000))
            intermediatePrice += priceLeafNonStandartWidth;
        if ((sizeWidth > 1000) && (sizeHeigth > 2000))
            intermediatePrice += priceLeafNonStandartHeightWidth;

        return intermediatePrice;

    }

    private long calculateBySumStickBox()   {

        float sumStickBox = 0;

        sumStickBox += (currentDoorPosition.getTwoDoorLeafs().equals("нет")
                        ? 2.5 + (currentDoorPosition.getDoorStep().equals("есть") ? 0.5: 0)
                        : 3 + (currentDoorPosition.getDoorStep().equals("есть") ? 1: 0));

        return ((currentDoorPosition.getSizeHeigth() > 2000) ? currentDoorPrice.getPriceDoorFrameNonStandart() :
                currentDoorPrice.getPriceDoorFrame()) * (int)sumStickBox;

    }

    private long calculateByFitt()  {

        long intermediatePrice = 0;

        switch (currentDoorPosition.getFitt())   {
            case "ЗВ 4":
                intermediatePrice = (currentDoorPrice.getPriceInsert() + currentDoorPrice.getPriceZV4());
                break;
            case "ЗЩ 2-01":
                intermediatePrice = (currentDoorPrice.getPriceInsert() + currentDoorPrice.getPriceZch201());
                break;
        }

        return intermediatePrice;

    }

    private long calculateByPaint() {

        long intermediatePrice = 0;

        switch (currentDoorPosition.getPaint())   {
            case "грунтовка":
                intermediatePrice = currentDoorPrice.getPricePaintGrunt();
                break;
            case "НЭ цвет RAL":
                intermediatePrice = currentDoorPrice.getPricePaintRAl();
                break;
        }

        return intermediatePrice;

    }

    private long calculateByDoorTrim(String sizeDoorTrim, Integer priceDoorTrim60mm, Integer priceDoorTrim90mm,
        float sumStickDoorTrim) {

        long intermediatePrice = 0;

        int priceDoorTrim = 0;

        switch (sizeDoorTrim) {
            case "60мм":
                priceDoorTrim = priceDoorTrim60mm;
                break;
            case "90мм":
                priceDoorTrim = priceDoorTrim90mm;
                break;
        }

        intermediatePrice += priceDoorTrim * (int)sumStickDoorTrim;

        return intermediatePrice;

    }

    private long calculateTotalNumberOfDoors()  {

        long intermediatePrice = 0;

        if (totalNumberOfDoors <= 10)
            intermediatePrice = currentDoorPrice.getSurchGenNum10();
        if ((totalNumberOfDoors > 10)&&(totalNumberOfDoors <= 20))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr11to20();
        if ((totalNumberOfDoors > 20)&&(totalNumberOfDoors <= 50))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr21to50();
        if ((totalNumberOfDoors > 50)&&(totalNumberOfDoors <= 100))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr51to100();
        if ((totalNumberOfDoors > 100)&&(totalNumberOfDoors <= 1000))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr101to1000();
        if (totalNumberOfDoors > 1000)
            intermediatePrice = currentDoorPrice.getSurchGenNum1000();

        return intermediatePrice;

    }

    public long calculatePrice(DoorPosition currentDoorPosition, DoorPrice currentDoorPrice, Long totalNumberOfDoors) {

        this.currentDoorPosition = currentDoorPosition;
        this.currentDoorPrice = currentDoorPrice;
        this.totalNumberOfDoors = totalNumberOfDoors;

        long finalPrice = calculateBySizeLeaf(currentDoorPosition.getSizeWidth(), currentDoorPosition.getSizeHeigth(),
            currentDoorPosition.getFill().equals("реечное") ? currentDoorPrice.getPriceLeafReech() : currentDoorPrice.getPriceLeafSot(),
                currentDoorPosition.getFill().equals("реечное") ? currentDoorPrice.getPriceLeafReechNonStandartHeigth() : currentDoorPrice.getPriceLeafSotNonStandartHeigth(),
                    currentDoorPosition.getFill().equals("реечное") ? currentDoorPrice.getPriceLeafReechNonStandartWidth() : currentDoorPrice.getPriceLeafSotNonStandartWidth(),
                        currentDoorPosition.getFill().equals("реечное") ? currentDoorPrice.getPriceLeafReechNonStandartHeigthWidth() : currentDoorPrice.getPriceLeafSotNonStandartHeigthWidth());

        finalPrice += calculateBySumStickBox();

        finalPrice += (currentDoorPosition.getAssmbl().equals("есть") ? currentDoorPrice.getPriceAssmbl() : 0);

        finalPrice += (currentDoorPosition.getHole().equals("есть") ? currentDoorPrice.getPriceHole() : 0);

        finalPrice += calculateByFitt();

        finalPrice += calculateByPaint();

        finalPrice += calculateByDoorTrim(
                        currentDoorPosition.getDoorTrim(),
                        (currentDoorPosition.getSizeHeigth() > 2000) ? currentDoorPrice.getPriceDoorTrim60mmNonStandart() : currentDoorPrice.getPriceDoorTrim60mm(),
                        (currentDoorPosition.getSizeHeigth() > 2000) ? currentDoorPrice.getPriceDoorTrim90mmNonStandart() : currentDoorPrice.getPriceDoorTrim90mm(),
                        (float)(currentDoorPosition.getTwoDoorLeafs().equals("нет") ? 2.5 : 3));

        finalPrice += calculateTotalNumberOfDoors();

        finalPrice *= currentDoorPosition.getSum();

        return finalPrice;
    }

}