package su.myspringwebapps.controllers.enums;

public enum Mortise {

    opt1("нет"),
    opt2("ЗЩ 2-01"),
    opt3("ЗВ 4");

    private final String mortise;

    Mortise(String mortise)   {
        this.mortise = mortise;
    }

    public String getMortise() {
        return mortise;
    }

}
