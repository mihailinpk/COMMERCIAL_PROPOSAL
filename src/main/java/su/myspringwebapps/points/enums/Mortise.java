package su.myspringwebapps.points.enums;

public enum Mortise {

    NO(1),
    Z_SH_2_01(2),
    Z_V_4_3_03(3);

    private final int mortise;

    Mortise(int mortise)   {
        this.mortise = mortise;
    }

    public int getMortise() {
        return mortise;
    }

}
