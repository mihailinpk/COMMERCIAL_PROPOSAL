package su.myspringwebapps.controllers.enums;

public enum TwoDoorLeafs {

    opt1("нет"),
    opt2("полуторный"),
    opt3("равнопольный");

    private final String twoDoorLeafs;

    TwoDoorLeafs(String twoDoorLeafs)   {
        this.twoDoorLeafs = twoDoorLeafs;
    }

    public String getTwoDoorLeafs() {
        return twoDoorLeafs;
    }

}