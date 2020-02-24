package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;

public class DoorPriceCalculator implements DoorPriceCalculatorInterface {

    public long calculatePrice(DoorPosition currentDoorPosition, DoorPrice currentDoorPrice, Long totalNumberOfDoors) {

        long finalPrice = 0;

        if (currentDoorPosition.getFill().equals("реечное"))	{
            if ((currentDoorPosition.getSizeWidth() <= 1000) && (currentDoorPosition.getSizeHeigth() <= 2000))
                finalPrice += currentDoorPrice.getPriceLeafReech();
            if ((currentDoorPosition.getSizeWidth() <= 1000) && (currentDoorPosition.getSizeHeigth() > 2000))
                finalPrice +=  currentDoorPrice.getPriceLeafReechNstHeigth();
            if ((currentDoorPosition.getSizeWidth() > 1000) && (currentDoorPosition.getSizeHeigth() <= 2000))
                finalPrice += currentDoorPrice.getPriceLeafReechNstWidth();
            if ((currentDoorPosition.getSizeWidth() > 1000) && (currentDoorPosition.getSizeHeigth() > 2000))
                finalPrice += currentDoorPrice.getPriceLeafReechNstHghtWdth();
        }

        if (currentDoorPosition.getFill().equals("сотовое"))	{
            if ((currentDoorPosition.getSizeWidth() <= 1000) && (currentDoorPosition.getSizeHeigth() <= 2000))
                finalPrice += currentDoorPrice.getPriceLeafSot();
            if ((currentDoorPosition.getSizeWidth() <= 1000) && (currentDoorPosition.getSizeHeigth() > 2000))
                finalPrice += currentDoorPrice.getPriceLeafSotNstHeigth();
            if ((currentDoorPosition.getSizeWidth() > 1000) && (currentDoorPosition.getSizeHeigth() <= 2000))
                finalPrice += currentDoorPrice.getPriceLeafSotNstWidth();
            if ((currentDoorPosition.getSizeWidth() > 1000) && (currentDoorPosition.getSizeHeigth() > 2000))
                finalPrice += currentDoorPrice.getPriceLeafSotNstHghtWdth();
        }

        boolean stickBoxNst = false;
        float sumStickBox = 0;
        if (currentDoorPosition.getTwoDoorLeafs().equals("нет"))	{
            sumStickBox += 2.5;
            if (currentDoorPosition.getDoorStep().equals("есть"))
                sumStickBox += 0.5;
        }
        else
        {
            sumStickBox += 3;
            if (currentDoorPosition.getDoorStep().equals("есть"))
                sumStickBox += 1;
        }
        if (currentDoorPosition.getSizeHeigth() > 2000)
            stickBoxNst = true;
        else
            stickBoxNst = false;
        if (stickBoxNst)
            finalPrice += (currentDoorPrice.getPriceDoorFrameNst() * sumStickBox);
        else
            finalPrice += (currentDoorPrice.getPriceDoorFrame() * (int)sumStickBox);

        if (currentDoorPosition.getAssmbl().equals("есть"))
            finalPrice += currentDoorPrice.getPriceAssmbl();

        if (currentDoorPosition.getHole().equals("есть"))
            finalPrice += currentDoorPrice.getPriceHole();

        if (currentDoorPosition.getFitt().equals("ЗВ 4"))
            finalPrice += (currentDoorPrice.getPriceInsert() + currentDoorPrice.getPriceZV4());
        if (currentDoorPosition.getFitt().equals("ЗЩ 2-01"))
            finalPrice += (currentDoorPrice.getPriceInsert() + currentDoorPrice.getPriceZch201());

        if (currentDoorPosition.getPaint().equals("грунтовка"))
            finalPrice += currentDoorPrice.getPricePaintGrunt();
        if (currentDoorPosition.getPaint().equals("НЭ цвет RAL"))
            finalPrice += currentDoorPrice.getPricePaintRAl();

        float sumStickNal = 0;
        if (currentDoorPosition.getTwoDoorLeafs().equals("нет"))
            sumStickNal += 2.5;
        else
            sumStickNal += 3;
        if (currentDoorPosition.getSizeHeigth() > 2000)	{
            if (currentDoorPosition.getDoorTrim().equals("60мм"))
                finalPrice += (currentDoorPrice.getPriceDoorTrim60mmNst() * (int)sumStickNal);
            if (currentDoorPosition.getDoorTrim().equals("90мм"))
                finalPrice += (currentDoorPrice.getPriceDoorTrim90mmNst() * (int)sumStickNal);
        }
        else	{
            if (currentDoorPosition.getDoorTrim().equals("60мм"))
                finalPrice += (currentDoorPrice.getPriceDoorTrim60mm() * (int)sumStickNal);
            if (currentDoorPosition.getDoorTrim().equals("90мм"))
                finalPrice += (currentDoorPrice.getPriceDoorTrim90mm() * (int)sumStickNal);
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