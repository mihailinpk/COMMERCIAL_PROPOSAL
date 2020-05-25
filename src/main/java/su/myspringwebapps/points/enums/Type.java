package su.myspringwebapps.points.enums;

public enum Type {

    DG(1),
    DN(2),
    DO(3);

    private final int type;

    Type(int type)   {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}