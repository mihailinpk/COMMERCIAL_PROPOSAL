package su.myspringwebapps.points.enums;

public enum DoorTrim {

    NO(1),
    d60_MM(2),
    d90_MM(3);

    private final int doorTrim;

    DoorTrim(int type)   {
        this.doorTrim = type;
    }

    public int getDoorTrim() {
        return doorTrim;
    }

}