package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;

public class DoorPriceCalculatorImplementation implements DoorPriceCalculator {

    private long calculateBySizeLeaf(Short sizeWidth, Short sizeHeigth, Integer priceLeaf, Integer priceLeafNstHeigth,
        Integer priceLeafNstWidth, Integer priceLeafNstHghtWdth)  {

        long returnedPrice = 0;

        if ((sizeWidth <= 1000) && (sizeHeigth <= 2000))
            returnedPrice += priceLeaf;
        if ((sizeWidth <= 1000) && (sizeHeigth > 2000))
            returnedPrice +=  priceLeafNstHeigth;
        if ((sizeWidth > 1000) && (sizeHeigth <= 2000))
            returnedPrice += priceLeafNstWidth;
        if ((sizeWidth > 1000) && (sizeHeigth > 2000))
            returnedPrice += priceLeafNstHghtWdth;

        return returnedPrice;

    }

    private long calculateByDoorTrim(String strDoorTrim, Integer priceDoorTrim60mm, Integer priceDoorTrim90mm,
        float sumStickDoorTrim, long currentPrice) {

        long returnedPrice = currentPrice;

        int priceDoorTrim = 0;

        switch (strDoorTrim) {
            case "60мм":
                priceDoorTrim = priceDoorTrim60mm;
                break;
            case "90мм":
                priceDoorTrim = priceDoorTrim90mm;
                break;
        }

        return returnedPrice += priceDoorTrim * (int)sumStickDoorTrim;

    }

    public long calculatePrice(DoorPosition currentDoorPosition, DoorPrice currentDoorPrice, Long totalNumberOfDoors) {

        long finalPrice = 0;

        if (currentDoorPosition.getFill().equals("реечное"))
            finalPrice = calculateBySizeLeaf(currentDoorPosition.getSizeWidth(), currentDoorPosition.getSizeHeigth(),
                    currentDoorPrice.getPriceLeafReech(), currentDoorPrice.getPriceLeafReechNstHeigth(),
                        currentDoorPrice.getPriceLeafReechNstWidth(), currentDoorPrice.getPriceLeafReechNstHghtWdth());

        if (currentDoorPosition.getFill().equals("сотовое"))
            finalPrice = calculateBySizeLeaf(currentDoorPosition.getSizeWidth(), currentDoorPosition.getSizeHeigth(),
                    currentDoorPrice.getPriceLeafSot(), currentDoorPrice.getPriceLeafSotNstHeigth(),
                        currentDoorPrice.getPriceLeafSotNstWidth(), currentDoorPrice.getPriceLeafSotNstHghtWdth());


        float sumStickBox = 0;
        if (currentDoorPosition.getTwoDoorLeafs().equals("нет"))	{
            sumStickBox += 2.5;
            if (currentDoorPosition.getDoorStep().equals("есть"))
                sumStickBox += 0.5;
        }
        else {
            sumStickBox += 3;
            if (currentDoorPosition.getDoorStep().equals("есть"))
                sumStickBox += 1;
        }

        if (currentDoorPosition.getSizeHeigth() > 2000)
            finalPrice += (currentDoorPrice.getPriceDoorFrameNst() * (int)sumStickBox);
        else
            finalPrice += (currentDoorPrice.getPriceDoorFrame() * (int)sumStickBox);

        if (currentDoorPosition.getAssmbl().equals("есть"))
            finalPrice += currentDoorPrice.getPriceAssmbl();

        if (currentDoorPosition.getHole().equals("есть"))
            finalPrice += currentDoorPrice.getPriceHole();

        String strFitt = currentDoorPosition.getFitt();
        switch (strFitt)   {
            case "ЗВ 4":
                finalPrice += (currentDoorPrice.getPriceInsert() + currentDoorPrice.getPriceZV4());
                break;
            case "ЗЩ 2-01":
                finalPrice += (currentDoorPrice.getPriceInsert() + currentDoorPrice.getPriceZch201());
                break;
        }

        String strPaint = currentDoorPosition.getPaint();
        switch (strPaint)   {
            case "грунтовка":
                finalPrice += currentDoorPrice.getPricePaintGrunt();
                break;
            case "НЭ цвет RAL":
                finalPrice += currentDoorPrice.getPricePaintRAl();
                break;
        }

        float sumStickDoorTrim = 0;
        if (currentDoorPosition.getTwoDoorLeafs().equals("нет"))
            sumStickDoorTrim += 2.5;
        else
            sumStickDoorTrim += 3;
        String strDoorTrim = currentDoorPosition.getDoorTrim();
        if (currentDoorPosition.getSizeHeigth() > 2000)	{
            finalPrice = calculateByDoorTrim(strDoorTrim, currentDoorPrice.getPriceDoorTrim60mmNst(), currentDoorPrice.getPriceDoorTrim90mmNst(),
                sumStickDoorTrim, finalPrice);
        }
        else	{
            finalPrice = calculateByDoorTrim(strDoorTrim, currentDoorPrice.getPriceDoorTrim60mm(), currentDoorPrice.getPriceDoorTrim90mm(),
                sumStickDoorTrim, finalPrice);
        }

        if (totalNumberOfDoors <= 10)
            finalPrice += currentDoorPrice.getSurchGenNum10();
        if ((totalNumberOfDoors > 10)&&(totalNumberOfDoors <= 20))
            finalPrice += currentDoorPrice.getSurchGenNumFr11to20();
        if ((totalNumberOfDoors > 20)&&(totalNumberOfDoors <= 50))
            finalPrice += currentDoorPrice.getSurchGenNumFr21to50();
        if ((totalNumberOfDoors > 50)&&(totalNumberOfDoors <= 100))
            finalPrice += currentDoorPrice.getSurchGenNumFr51to100();
        if ((totalNumberOfDoors > 100)&&(totalNumberOfDoors <= 1000))
            finalPrice += currentDoorPrice.getSurchGenNumFr101to1000();
        if (totalNumberOfDoors > 1000)
            finalPrice += currentDoorPrice.getSurchGenNum1000();

        finalPrice *= currentDoorPosition.getSum();

        return finalPrice;
    }

}