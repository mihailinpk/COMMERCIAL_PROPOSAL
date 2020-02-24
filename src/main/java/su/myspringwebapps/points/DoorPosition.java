package su.myspringwebapps.points;

public class DoorPosition {

    private Integer id;                         //  id дверного блока в заказе
    private Short sizeWidth; 				    //	ширина
    private Short sizeHeigth; 				    //	высота
    private String type; 					    //	тип
    private String open; 					    //	открывание
    private String doorStep; 				    //	порог
    private String assmbl; 					    //	сборка
    private String fill; 					    //	заполнение
    private String hole; 					    //	отверстие
    private String fitt; 					    //	фурнитура
    private String paint; 					    //	окраска
    private String doorTrim; 					//	наличник
    private String twoDoorLeafs; 				//	двупольный
    private Integer sum; 						//	количество ДБ в позиции предложения
    private Long totalPrice;                    //  итоговая стоимость по позиции

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(Short sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public Short getSizeHeigth() {
        return sizeHeigth;
    }

    public void setSizeHeigth(Short sizeHeigth) {
        this.sizeHeigth = sizeHeigth;
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

    public String getDoorStep() {
        return doorStep;
    }

    public void setDoorStep(String doorStep) {
        this.doorStep = doorStep;
    }

    public String getAssmbl() {
        return assmbl;
    }

    public void setAssmbl(String assmbl) {
        this.assmbl = assmbl;
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

    public String getDoorTrim() {
        return doorTrim;
    }

    public void setDoorTrim(String doorTrim) {
        this.doorTrim = doorTrim;
    }

    public String getTwoDoorLeafs() {
        return twoDoorLeafs;
    }

    public void setTwoDoorLeafs(String twoDoorLeafs) {
        this.twoDoorLeafs = twoDoorLeafs;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = (prime*result) + ((id == null) ? 0 : id.hashCode());
        result = (prime*result) + ((sizeWidth == null) ? 0 : sizeWidth.hashCode());
        result = (prime*result) + ((sizeHeigth == null) ? 0 : sizeHeigth.hashCode());
        result = (prime*result) + ((type == null) ? 0 : type.hashCode());
        result = (prime*result) + ((open == null) ? 0 : open.hashCode());
        result = (prime*result) + ((doorStep == null) ? 0 : doorStep.hashCode());
        result = (prime*result) + ((assmbl == null) ? 0 : assmbl.hashCode());
        result = (prime*result) + ((fill == null) ? 0 : fill.hashCode());
        result = (prime*result) + ((hole == null) ? 0 : hole.hashCode());
        result = (prime*result) + ((fitt == null) ? 0 : fitt.hashCode());
        result = (prime*result) + ((paint == null) ? 0 : paint.hashCode());
        result = (prime*result) + ((doorTrim == null) ? 0 : doorTrim.hashCode());
        result = (prime*result) + ((twoDoorLeafs == null) ? 0 : twoDoorLeafs.hashCode());
        result = (prime*result) + ((sum == null) ? 0 : sum.hashCode());
        result = (prime*result) + ((totalPrice == null) ? 0 : totalPrice.hashCode());
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DoorPosition other = (DoorPosition) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (sizeWidth == null) {
            if (other.sizeWidth != null)
                return false;
        }
        else if (!sizeWidth.equals(other.sizeWidth))
            return false;
        if (sizeHeigth == null) {
            if (other.sizeHeigth != null)
                return false;
        }
        else if (!sizeHeigth.equals(other.sizeHeigth))
            return false;

        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (open == null) {
            if (other.open != null)
                return false;
        }
        else if (!open.equals(other.open))
            return false;
        if (doorStep == null) {
            if (other.doorStep != null)
                return false;
        }
        else if (!doorStep.equals(other.doorStep))
            return false;

        if (assmbl == null) {
            if (other.assmbl != null)
                return false;
        }
        else if (!assmbl.equals(other.assmbl))
            return false;

        if (fill == null) {
            if (other.fill != null)
                return false;
        }
        else if (!fill.equals(other.fill))
            return false;

        if (hole == null) {
            if (other.hole != null)
                return false;
        }
        else if (!hole.equals(other.hole))
            return false;

        if (fitt == null) {
            if (other.fitt != null)
                return false;
        }
        else if (!fitt.equals(other.fitt))
            return false;

        if (paint == null) {
            if (other.paint != null)
                return false;
        }
        else if (!paint.equals(other.paint))
            return false;

        if (doorTrim == null) {
            if (other.doorTrim != null)
                return false;
        }
        else if (!doorTrim.equals(other.doorTrim))
            return false;

        if (twoDoorLeafs == null) {
            if (other.twoDoorLeafs != null)
                return false;
        }
        else if (!twoDoorLeafs.equals(other.twoDoorLeafs))
            return false;

        if (sum == null) {
            if (other.sum != null)
                return false;
        }
        else if (!sum.equals(other.sum))
            return false;
        if (totalPrice == null) {
            if (other.totalPrice != null)
                return false;
        }
        else if (!totalPrice.equals(other.totalPrice))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DoorPosition{" +
                "id=" + id +
                ", sizeWidth=" + sizeWidth +
                ", sizeHeigth=" + sizeHeigth +
                ", type=" + type +
                ", open=" + open +
                ", doorStep=" + doorStep +
                ", assmbl=" + assmbl +
                ", fill=" + fill +
                ", hole=" + hole +
                ", fitt=" + fitt +
                ", paint=" + paint +
                ", doorTrim=" + doorTrim +
                ", twoDoorLeafs=" + twoDoorLeafs +
                ", sum=" + sum +
                ", totalPrice=" + totalPrice +
                "}";

    }
}