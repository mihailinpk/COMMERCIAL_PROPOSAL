package su.myspringwebapps.points;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import su.myspringwebapps.points.enums.*;

public class DoorPositionView extends DoorPosition {

    @JsonCreator
    public DoorPositionView(
        @JsonProperty("width") String widthFromModel,
        @JsonProperty("height") String heightFromModel,
        @JsonProperty("type") String typeFromModel,
        @JsonProperty("open") String openFromModel,
        @JsonProperty("doorstep") String doorstepFromModel,
        @JsonProperty("assembl") String assemblFromModel,
        @JsonProperty("fill") String fillFromModel,
        @JsonProperty("hole") String holeFromModel,
        @JsonProperty("fitt") String fittFromModel,
        @JsonProperty("paint") String paintFromModel,
        @JsonProperty("doortrim") String doortrimFromModel,
        @JsonProperty("twodoorleafs") String twodoorleafsFromModel,
        @JsonProperty("sumpos") String sumposFromModel
    )   {
        switch (Type.valueOf(typeFromModel).getType())    {
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

        switch (Mortise.valueOf(fittFromModel).getMortise())    {
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

        switch (Paint.valueOf(paintFromModel).getPaint())   {
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

        switch (DoorTrim.valueOf(doortrimFromModel).getDoorTrim())    {
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

        switch (TwoDoorLeafs.valueOf(twodoorleafsFromModel).getTwoDoorLeafs())    {
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

        super.setSizeWidth(Short.parseShort(widthFromModel));
        super.setSizeHeigth(Short.parseShort(heightFromModel));
        super.setOpen(((openFromModel.equals("RIGHT")) ? "правое" : "левое"));
        super.setDoorStep(((doorstepFromModel.equals("YES")) ? "есть" : "нет"));
        super.setAssmbl(((assemblFromModel.equals("YES")) ? "есть" : "нет"));
        super.setFill(((fillFromModel.equals("CELL")) ? "сотовое" : "реечное"));
        super.setHole(((holeFromModel.equals("NO")) ? "нет" : "есть"));
        super.setSum(Integer.parseInt(sumposFromModel));
    }

}