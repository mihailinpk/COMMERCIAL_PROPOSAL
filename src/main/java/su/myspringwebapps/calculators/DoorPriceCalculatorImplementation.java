package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;

public class DoorPriceCalculatorImplementation implements DoorPriceCalculator {

    static int number_of_10_pieces = 10;
    static int number_of_20_pieces = 20;
    static int number_of_50_pieces = 50;
    static int number_of_100_pieces = 100;
    static int number_of_1000_pieces = 1000;

    static int size_1000_mm = 1000;
    static int size_2000_mm = 2000;

    static float number_stick_box_0_5 = 0.5f;
    static float number_stick_box_1_0 = 1.0f;
    static float number_stick_box_2_5 = 2.5f;
    static float number_stick_box_3_0 = 3.0f;

    private DoorPosition currentDoorPosition;
    private DoorPrice currentDoorPrice;
    private long totalNumberOfDoors;

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
                (currentDoorPosition.getSizeHeigth() > size_2000_mm) ? currentDoorPrice.getPriceDoorTrim60mmNonStandart() : currentDoorPrice.getPriceDoorTrim60mm(),
                (currentDoorPosition.getSizeHeigth() > size_2000_mm) ? currentDoorPrice.getPriceDoorTrim90mmNonStandart() : currentDoorPrice.getPriceDoorTrim90mm(),
                (float)(currentDoorPosition.getTwoDoorLeafs().equals("нет") ? number_stick_box_2_5 : number_stick_box_3_0));

        finalPrice += calculateTotalNumberOfDoors();

        finalPrice *= currentDoorPosition.getSum();

        return finalPrice;
    }

    private long calculateBySizeLeaf(Short sizeWidth, Short sizeHeigth, Integer priceLeaf, Integer priceLeafNonStandartHeigth,
        Integer priceLeafNonStandartWidth, Integer priceLeafNonStandartHeightWidth)  {

        long intermediatePrice = 0;

        if ((sizeWidth <= size_1000_mm) && (sizeHeigth <= size_2000_mm))
            intermediatePrice += priceLeaf;
        if ((sizeWidth <= size_1000_mm) && (sizeHeigth > size_2000_mm))
            intermediatePrice +=  priceLeafNonStandartHeigth;
        if ((sizeWidth > size_1000_mm) && (sizeHeigth <= size_2000_mm))
            intermediatePrice += priceLeafNonStandartWidth;
        if ((sizeWidth > size_1000_mm) && (sizeHeigth > size_2000_mm))
            intermediatePrice += priceLeafNonStandartHeightWidth;

        return intermediatePrice;

    }

    private long calculateBySumStickBox()   {

        float sumStickBox = 0;

        sumStickBox += (currentDoorPosition.getTwoDoorLeafs().equals("нет")
                        ? number_stick_box_2_5 + (currentDoorPosition.getDoorStep().equals("есть") ? number_stick_box_0_5: 0)
                        : number_stick_box_3_0 + (currentDoorPosition.getDoorStep().equals("есть") ? number_stick_box_1_0: 0));

        return ((currentDoorPosition.getSizeHeigth() > size_2000_mm) ? currentDoorPrice.getPriceDoorFrameNonStandart() :
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

        if (totalNumberOfDoors <= number_of_10_pieces)
            intermediatePrice = currentDoorPrice.getSurchGenNum10();
        if ((totalNumberOfDoors > number_of_10_pieces)&&(totalNumberOfDoors <= number_of_20_pieces))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr11to20();
        if ((totalNumberOfDoors > number_of_20_pieces)&&(totalNumberOfDoors <= number_of_50_pieces))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr21to50();
        if ((totalNumberOfDoors > number_of_50_pieces)&&(totalNumberOfDoors <= number_of_100_pieces))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr51to100();
        if ((totalNumberOfDoors > number_of_100_pieces)&&(totalNumberOfDoors <= number_of_1000_pieces))
            intermediatePrice = currentDoorPrice.getSurchGenNumFr101to1000();
        if (totalNumberOfDoors > number_of_1000_pieces)
            intermediatePrice = currentDoorPrice.getSurchGenNum1000();

        return intermediatePrice;

    }

}