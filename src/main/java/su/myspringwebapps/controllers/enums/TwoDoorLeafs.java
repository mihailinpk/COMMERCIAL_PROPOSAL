package su.myspringwebapps.controllers.enums;

public enum TwoDoorLeafs {

    NO(1),
    ONE_AND_A_HALF(2),
    EQUALS(3);

    private final int twoDoorLeafs;

    TwoDoorLeafs(int twoDoorLeafs)   {
        this.twoDoorLeafs = twoDoorLeafs;
    }

    public int getTwoDoorLeafs() {
        return twoDoorLeafs;
    }

}