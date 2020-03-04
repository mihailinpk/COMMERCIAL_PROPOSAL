package su.myspringwebapps.controllers.enums;

public enum DoorTrim {

    opt1("нет"),
    opt2("60мм"),
    opt3("90мм");

    private final String doorTrim;

    DoorTrim(String type)   {
        this.doorTrim = type;
    }

    public String getDoorTrim() {
        return doorTrim;
    }

}