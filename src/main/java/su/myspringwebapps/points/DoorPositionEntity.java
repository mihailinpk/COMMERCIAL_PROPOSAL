package su.myspringwebapps.points;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import su.myspringwebapps.points.enums.*;

public class DoorPositionEntity extends DoorPosition {

    public DoorPositionEntity fromModel(String jsonDoorPosition) throws JsonProcessingException {

        DoorPositionFromModel doorPositionFromModel = new ObjectMapper().readValue(jsonDoorPosition, DoorPositionFromModel.class);

        switch (Type.valueOf(doorPositionFromModel.getType()).getType())    {
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

        switch (Mortise.valueOf(doorPositionFromModel.getFitt()).getMortise())    {
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

        switch (Paint.valueOf(doorPositionFromModel.getPaint()).getPaint())   {
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

        switch (DoorTrim.valueOf(doorPositionFromModel.getDoortrim()).getDoorTrim())    {
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

        switch (TwoDoorLeafs.valueOf(doorPositionFromModel.getTwodoorleafs()).getTwoDoorLeafs())    {
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

        super.setSizeWidth(Short.parseShort(doorPositionFromModel.getWidth()));
        super.setSizeHeigth(Short.parseShort(doorPositionFromModel.getHeight()));
        super.setOpen(((doorPositionFromModel.getOpen().equals("RIGHT")) ? "правое" : "левое"));
        super.setDoorStep(((doorPositionFromModel.getDoorstep().equals("YES")) ? "есть" : "нет"));
        super.setAssmbl(((doorPositionFromModel.getAssembl().equals("YES")) ? "есть" : "нет"));
        super.setFill(((doorPositionFromModel.getFill().equals("CELL")) ? "сотовое" : "реечное"));
        super.setHole(((doorPositionFromModel.getHole().equals("NO")) ? "нет" : "есть"));
        super.setSum(Integer.parseInt(doorPositionFromModel.getSumpos()));

        return this;

    }

}