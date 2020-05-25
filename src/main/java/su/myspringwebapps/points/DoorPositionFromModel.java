package su.myspringwebapps.points;

public class DoorPositionFromModel {

    private String width;
    private String height;
    private String type;
    private String open;
    private String doorstep;
    private String assembl;
    private String fill;
    private String hole;
    private String fitt;
    private String paint;
    private String doortrim;
    private String twodoorleafs;
    private String sumpos;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getDoorstep() {
        return doorstep;
    }

    public void setDoorstep(String doorstep) {
        this.doorstep = doorstep;
    }

    public String getAssembl() {
        return assembl;
    }

    public void setAssembl(String assembl) {
        this.assembl = assembl;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getHole() {
        return hole;
    }

    public void setHole(String hole) {
        this.hole = hole;
    }

    public String getFitt() {
        return fitt;
    }

    public void setFitt(String fitt) {
        this.fitt = fitt;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String getDoortrim() {
        return doortrim;
    }

    public void setDoortrim(String doortrim) {
        this.doortrim = doortrim;
    }

    public String getTwodoorleafs() {
        return twodoorleafs;
    }

    public void setTwodoorleafs(String twodoorleafs) {
        this.twodoorleafs = twodoorleafs;
    }

    public String getSumpos() {
        return sumpos;
    }

    public void setSumpos(String sumpos) {
        this.sumpos = sumpos;
    }

    @Override
    public String toString() {
        return "DoorPositionFromModel{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", type='" + type + '\'' +
                ", open='" + open + '\'' +
                ", doorstep='" + doorstep + '\'' +
                ", assembl='" + assembl + '\'' +
                ", fill='" + fill + '\'' +
                ", hole='" + hole + '\'' +
                ", fitt='" + fitt + '\'' +
                ", paint='" + paint + '\'' +
                ", doortrim='" + doortrim + '\'' +
                ", twodoorleafs='" + twodoorleafs + '\'' +
                ", sumpos='" + sumpos + '\'' +
                '}';
    }
}