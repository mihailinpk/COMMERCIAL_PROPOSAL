package su.myspringwebapps.points;

public class DoorPositionEntity extends DoorPosition {

    public void fromModel(
        Short sizeWidth,
        Short sizeHeigth,
        int typeInteger,
        String open,
        String doorStep,
        String assmbl,
        String fill,
        String hole,
        int fittInteger,
        int paintInteger,
        int doorTrimInteger,
        int twoDoorLeafsInteger,
        Integer sum)    {

        switch (typeInteger)    {
            case 1:
                super.setType("ДГ");
                break;
            case 2:
                super.setType("ДН");
                break;
            case 3:
                super.setType("ДО");
                break;
        }

        switch (fittInteger)    {
            case 1:
                super.setFitt("нет");
                break;
            case 2:
                super.setFitt("ЗЩ 2-01");
                break;
            case 3:
                super.setFitt("ЗВ 4");
                break;
        }

        switch (paintInteger)   {
            case 1:
                super.setPaint("нет");
                break;
            case 2:
                super.setPaint("грунтовка");
                break;
            case 3:
                super.setPaint("НЭ цвет RAL");
                break;
        }

        switch (doorTrimInteger)    {
            case 1:
                super.setDoorTrim("нет");
                break;
            case 2:
                super.setDoorTrim("60мм");
                break;
            case 3:
                super.setDoorTrim("90мм");
                break;
        }

        switch (twoDoorLeafsInteger)    {
            case 1:
                super.setTwoDoorLeafs("нет");
                break;
            case 2:
                super.setTwoDoorLeafs("полуторный");
                break;
            case 3:
                super.setTwoDoorLeafs("равнопольный");
                break;
        }

        super.setSizeWidth(sizeWidth);
        super.setSizeHeigth(sizeHeigth);
        super.setOpen(open);
        super.setDoorStep(doorStep);
        super.setAssmbl(assmbl);
        super.setFill(fill);
        super.setHole(hole);
        super.setSum(sum);

    }

}