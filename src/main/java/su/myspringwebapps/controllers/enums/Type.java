package su.myspringwebapps.controllers.enums;

public enum Type {

    opt1("ДГ"),
    opt2("ДН"),
    opt3("ДО");

    private final String type;

    Type(String type)   {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
