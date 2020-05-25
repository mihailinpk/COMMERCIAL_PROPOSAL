package su.myspringwebapps.points.enums;

public enum Paint {

    NO(1),
    GRUNT(2),
    RAL(3);

    private final int paint;

    Paint(int paint)   {
        this.paint = paint;
    }

    public int getPaint() {
        return paint;
    }

}
