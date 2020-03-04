package su.myspringwebapps.controllers.enums;

public enum Paint {

    opt1("нет"),
    opt2("грунтовка"),
    opt3("НЭ цвет RAL");

    private final String paint;

    Paint(String paint)   {
        this.paint = paint;
    }

    public String getPaint() {
        return paint;
    }

}
