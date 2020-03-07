package su.myspringwebapps.points;

public class DoorPrice {

    private Integer id;                                 //  id списка цен
    private Integer priceLeafReech;				        //	цена за полотно реечного заполнения стандарт
    private Integer priceLeafReechNonStandartHeigth;	//	цена за полотно реечного заполнения н/стандарт по высоте
    private Integer priceLeafReechNonStandartWidth;		//	цена за полотно реечного заполнения н/стандарт по ширине
    private Integer priceLeafReechNonStandartHeigthWidth;	//	цена за полотно реечного заполнения н/стандарт по ширине и высоте
    private Integer priceLeafSot;				        //	цена за полотно сотового заполнения стандарт
    private Integer priceLeafSotNonStandartHeigth;	    //	цена за полотно сотового заполнения н/стандарт по высоте
    private Integer priceLeafSotNonStandartWidth;	    //	цена за полотно сотового заполнения н/стандарт по ширине
    private Integer priceLeafSotNonStandartHeigthWidth;    //	цена за полотно сотового заполнения н/стандарт по ширине и высоте
    private Integer priceDoorFrame;				        //	цена за палку коробки стандарт
    private Integer priceDoorFrameNonStandart;		    //	цена за палку коробки н/стандарт
    private Integer priceAssmbl;				        //	цена за сборку
    private Integer priceHole;					        //	цена за отверстие
    private Integer priceInsert;				        //	цена за врезку фурнитуры
    private Integer priceZch201;				        //	цена за ЗЩ 2-01
    private Integer priceZV4;					        //	цена за ЗВ 4
    private Integer pricePaintGrunt;		            //	цена за окраску грунтовкой
    private Integer pricePaintRAl;			            //	цена за окраску цветом RAL
    private Integer priceDoorTrim60mm;			        //	цена за стандартную палку наличника 60мм
    private Integer priceDoorTrim60mmNonStandart;	    //	цена за н/стандартную палку наличника 60мм
    private Integer priceDoorTrim90mm;			        //	цена за стандартную палку наличника 90мм
    private Integer priceDoorTrim90mmNonStandart;	    //	цена за н/стандартную палку наличника 90мм
    private Integer surchGenNum10;				        //	надбавка за общее количество до 10 шт.
    private Integer surchGenNumFr11to20;		        //	надбавка за общее количетсов от 11 до 20 шт.
    private Integer surchGenNumFr21to50;		        //	надбавка за общее количетсов от 21 до 50 шт.
    private Integer surchGenNumFr51to100;		        //	надбавка за общее количетсов от 51 до 100 шт.
    private Integer surchGenNumFr101to1000;		        //	надбавка за общее количетсов от 101 до 1000 шт.
    private Integer surchGenNum1000;			    //	надбавка за общее количетсов от 1000 шт.

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriceLeafReech() {
        return priceLeafReech;
    }

    public void setPriceLeafReech(Integer priceLeafReech) {
        this.priceLeafReech = priceLeafReech;
    }

    public Integer getPriceLeafReechNonStandartHeigth() {
        return priceLeafReechNonStandartHeigth;
    }

    public void setPriceLeafReechNonStandartHeigth(Integer priceLeafReechNonStandartHeigth) {
        this.priceLeafReechNonStandartHeigth = priceLeafReechNonStandartHeigth;
    }

    public Integer getPriceLeafReechNonStandartWidth() {
        return priceLeafReechNonStandartWidth;
    }

    public void setPriceLeafReechNonStandartWidth(Integer priceLeafReechNonStandartWidth) {
        this.priceLeafReechNonStandartWidth = priceLeafReechNonStandartWidth;
    }

    public Integer getPriceLeafReechNonStandartHeigthWidth() {
        return priceLeafReechNonStandartHeigthWidth;
    }

    public void setPriceLeafReechNonStandartHeigthWidth(Integer priceLeafReechNonStandartHeigthWidth) {
        this.priceLeafReechNonStandartHeigthWidth = priceLeafReechNonStandartHeigthWidth;
    }

    public Integer getPriceLeafSot() {
        return priceLeafSot;
    }

    public void setPriceLeafSot(Integer priceLeafSot) {
        this.priceLeafSot = priceLeafSot;
    }

    public Integer getPriceLeafSotNonStandartHeigth() {
        return priceLeafSotNonStandartHeigth;
    }

    public void setPriceLeafSotNonStandartHeigth(Integer priceLeafSotNonStandartHeigth) {
        this.priceLeafSotNonStandartHeigth = priceLeafSotNonStandartHeigth;
    }

    public Integer getPriceLeafSotNonStandartWidth() {
        return priceLeafSotNonStandartWidth;
    }

    public void setPriceLeafSotNonStandartWidth(Integer priceLeafSotNonStandartWidth) {
        this.priceLeafSotNonStandartWidth = priceLeafSotNonStandartWidth;
    }

    public Integer getPriceLeafSotNonStandartHeigthWidth() {
        return priceLeafSotNonStandartHeigthWidth;
    }

    public void setPriceLeafSotNonStandartHeigthWidth(Integer priceLeafSotNonStandartHeigthWidth) {
        this.priceLeafSotNonStandartHeigthWidth = priceLeafSotNonStandartHeigthWidth;
    }

    public Integer getPriceDoorFrame() {
        return priceDoorFrame;
    }

    public void setPriceDoorFrame(Integer priceKor) {
        this.priceDoorFrame = priceKor;
    }

    public Integer getPriceDoorFrameNonStandart() {
        return priceDoorFrameNonStandart;
    }

    public void setPriceDoorFrameNonStandart(Integer priceKorNonStandart) {
        this.priceDoorFrameNonStandart = priceKorNonStandart;
    }

    public Integer getPriceAssmbl() {
        return priceAssmbl;
    }

    public void setPriceAssmbl(Integer priceAssmbl) {
        this.priceAssmbl = priceAssmbl;
    }

    public Integer getPriceHole() {
        return priceHole;
    }

    public void setPriceHole(Integer priceHole) {
        this.priceHole = priceHole;
    }

    public Integer getPriceInsert() {
        return priceInsert;
    }

    public void setPriceInsert(Integer priceInsert) {
        this.priceInsert = priceInsert;
    }

    public Integer getPriceZch201() {
        return priceZch201;
    }

    public void setPriceZch201(Integer priceZch201) {
        this.priceZch201 = priceZch201;
    }

    public Integer getPriceZV4() {
        return priceZV4;
    }

    public void setPriceZV4(Integer priceZV4) {
        this.priceZV4 = priceZV4;
    }

    public Integer getPricePaintGrunt() {
        return pricePaintGrunt;
    }

    public void setPricePaintGrunt(Integer pricePaIntegerGrunt) {
        this.pricePaintGrunt = pricePaIntegerGrunt;
    }

    public Integer getPricePaintRAl() {
        return pricePaintRAl;
    }

    public void setPricePaintRAl(Integer pricePaintRAl) {
        this.pricePaintRAl = pricePaintRAl;
    }

    public Integer getPriceDoorTrim60mm() {
        return priceDoorTrim60mm;
    }

    public void setPriceDoorTrim60mm(Integer priceDoorTrim60mm) {
        this.priceDoorTrim60mm = priceDoorTrim60mm;
    }

    public Integer getPriceDoorTrim60mmNonStandart() {
        return priceDoorTrim60mmNonStandart;
    }

    public void setPriceDoorTrim60mmNonStandart(Integer priceDoorTrim60mmNonStandart) {
        this.priceDoorTrim60mmNonStandart = priceDoorTrim60mmNonStandart;
    }

    public Integer getPriceDoorTrim90mm() {
        return priceDoorTrim90mm;
    }

    public void setPriceDoorTrim90mm(Integer priceDoorTrim90mm) {
        this.priceDoorTrim90mm = priceDoorTrim90mm;
    }

    public Integer getPriceDoorTrim90mmNonStandart() {
        return priceDoorTrim90mmNonStandart;
    }

    public void setPriceDoorTrim90mmNonStandart(Integer priceDoorTrim90mmNonStandart) {
        this.priceDoorTrim90mmNonStandart = priceDoorTrim90mmNonStandart;
    }

    public Integer getSurchGenNum10() {
        return surchGenNum10;
    }

    public void setSurchGenNum10(Integer surchGenNum10) {
        this.surchGenNum10 = surchGenNum10;
    }

    public Integer getSurchGenNumFr11to20() {
        return surchGenNumFr11to20;
    }

    public void setSurchGenNumFr11to20(Integer surchGenNumFr11to20) {
        this.surchGenNumFr11to20 = surchGenNumFr11to20;
    }

    public Integer getSurchGenNumFr21to50() {
        return surchGenNumFr21to50;
    }

    public void setSurchGenNumFr21to50(Integer surchGenNumFr21to50) {
        this.surchGenNumFr21to50 = surchGenNumFr21to50;
    }

    public Integer getSurchGenNumFr51to100() {
        return surchGenNumFr51to100;
    }

    public void setSurchGenNumFr51to100(Integer surchGenNumFr51to100) {
        this.surchGenNumFr51to100 = surchGenNumFr51to100;
    }

    public Integer getSurchGenNumFr101to1000() {
        return surchGenNumFr101to1000;
    }

    public void setSurchGenNumFr101to1000(Integer surchGenNumFr101to1000) {
        this.surchGenNumFr101to1000 = surchGenNumFr101to1000;
    }

    public Integer getSurchGenNum1000() {
        return surchGenNum1000;
    }

    public void setSurchGenNum1000(Integer surchGenNum1000) {
        this.surchGenNum1000 = surchGenNum1000;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((priceLeafReech == null) ? 0 : priceLeafReech.hashCode());
        result = prime * result + ((priceLeafReechNonStandartHeigth == null) ? 0 : priceLeafReechNonStandartHeigth.hashCode());
        result = prime * result + ((priceLeafReechNonStandartWidth == null) ? 0 : priceLeafReechNonStandartWidth.hashCode());
        result = prime * result + ((priceLeafReechNonStandartHeigthWidth == null) ? 0 : priceLeafReechNonStandartHeigthWidth.hashCode());
        result = prime * result + ((priceLeafSot == null) ? 0 : priceLeafSot.hashCode());
        result = prime * result + ((priceLeafSotNonStandartHeigth == null) ? 0 : priceLeafSotNonStandartHeigth.hashCode());
        result = prime * result + ((priceLeafSotNonStandartWidth == null) ? 0 : priceLeafSotNonStandartWidth.hashCode());
        result = prime * result + ((priceLeafSotNonStandartHeigthWidth == null) ? 0 : priceLeafSotNonStandartHeigthWidth.hashCode());
        result = prime * result + ((priceDoorFrame == null) ? 0 : priceDoorFrame.hashCode());
        result = prime * result + ((priceDoorFrameNonStandart == null) ? 0 : priceDoorFrameNonStandart.hashCode());
        result = prime * result + ((priceAssmbl == null) ? 0 : priceAssmbl.hashCode());
        result = prime * result + ((priceHole == null) ? 0 : priceHole.hashCode());
        result = prime * result + ((priceInsert == null) ? 0 : priceInsert.hashCode());
        result = prime * result + ((priceZch201 == null) ? 0 : priceZch201.hashCode());
        result = prime * result + ((priceZV4 == null) ? 0 : priceZV4.hashCode());
        result = prime * result + ((pricePaintGrunt == null) ? 0 : pricePaintGrunt.hashCode());
        result = prime * result + ((pricePaintRAl == null) ? 0 : pricePaintRAl.hashCode());
        result = prime * result + ((priceDoorTrim60mm == null) ? 0 : priceDoorTrim60mm.hashCode());
        result = prime * result + ((priceDoorTrim60mmNonStandart == null) ? 0 : priceDoorTrim60mmNonStandart.hashCode());
        result = prime * result + ((priceDoorTrim90mm == null) ? 0 : priceDoorTrim90mm.hashCode());
        result = prime * result + ((priceDoorTrim90mmNonStandart == null) ? 0 : priceDoorTrim90mmNonStandart.hashCode());
        result = prime * result + ((surchGenNum10 == null) ? 0 : surchGenNum10.hashCode());
        result = prime * result + ((surchGenNumFr11to20 == null) ? 0 : surchGenNumFr11to20.hashCode());
        result = prime * result + ((surchGenNumFr21to50 == null) ? 0 : surchGenNumFr21to50.hashCode());
        result = prime * result + ((surchGenNumFr51to100 == null) ? 0 : surchGenNumFr51to100.hashCode());
        result = prime * result + ((surchGenNumFr101to1000 == null) ? 0 : surchGenNumFr101to1000.hashCode());
        result = prime * result + ((surchGenNum1000 == null) ? 0 : surchGenNum1000.hashCode());
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
        DoorPrice other = (DoorPrice) obj;

        if (priceLeafReech == null) {
            if (other.priceLeafReech != null)
                return false;
        }
        else if (!priceLeafReech.equals(other.priceLeafReech))
            return false;

        if (priceLeafReechNonStandartHeigth == null) {
            if (other.priceLeafReechNonStandartHeigth != null)
                return false;
        }
        else if (!priceLeafReechNonStandartHeigth.equals(other.priceLeafReechNonStandartHeigth))
            return false;

        if (priceLeafReechNonStandartWidth == null) {
            if (other.priceLeafReechNonStandartWidth != null)
                return false;
        }
        else if (!priceLeafReechNonStandartWidth.equals(other.priceLeafReechNonStandartWidth))
            return false;

        if (priceLeafReechNonStandartHeigthWidth == null) {
            if (other.priceLeafReechNonStandartHeigthWidth != null)
                return false;
        }
        else if (!priceLeafReechNonStandartHeigthWidth.equals(other.priceLeafReechNonStandartHeigthWidth))
            return false;

        if (priceLeafSot == null) {
            if (other.priceLeafSot != null)
                return false;
        }
        else if (!priceLeafSot.equals(other.priceLeafSot))
            return false;

        if (priceLeafSotNonStandartHeigth == null) {
            if (other.priceLeafSotNonStandartHeigth != null)
                return false;
        }
        else if (!priceLeafSotNonStandartHeigth.equals(other.priceLeafSotNonStandartHeigth))
            return false;

        if (priceLeafSotNonStandartWidth == null) {
            if (other.priceLeafSotNonStandartWidth != null)
                return false;
        }
        else if (!priceLeafSotNonStandartWidth.equals(other.priceLeafSotNonStandartWidth))
            return false;

        if (priceLeafSotNonStandartHeigthWidth == null) {
            if (other.priceLeafSotNonStandartHeigthWidth != null)
                return false;
        }
        else if (!priceLeafSotNonStandartHeigthWidth.equals(other.priceLeafSotNonStandartHeigthWidth))
            return false;

        if (priceDoorFrame == null) {
            if (other.priceDoorFrame != null)
                return false;
        }
        else if (!priceDoorFrame.equals(other.priceDoorFrame))
            return false;

        if (priceDoorFrameNonStandart == null) {
            if (other.priceDoorFrameNonStandart != null)
                return false;
        }
        else if (!priceDoorFrameNonStandart.equals(other.priceDoorFrameNonStandart))
            return false;

        if (priceAssmbl == null) {
            if (other.priceAssmbl != null)
                return false;
        }
        else if (!priceAssmbl.equals(other.priceAssmbl))
            return false;

        if (priceHole == null) {
            if (other.priceHole != null)
                return false;
        }
        else if (!priceHole.equals(other.priceHole))
            return false;

        if (priceInsert == null) {
            if (other.priceInsert != null)
                return false;
        }
        else if (!priceInsert.equals(other.priceInsert))
            return false;

        if (priceZch201 == null) {
            if (other.priceZch201 != null)
                return false;
        }
        else if (!priceZch201.equals(other.priceZch201))
            return false;

        if (priceZV4 == null) {
            if (other.priceZV4 != null)
                return false;
        }
        else if (!priceZV4.equals(other.priceZV4))
            return false;

        if (pricePaintGrunt == null) {
            if (other.pricePaintGrunt != null)
                return false;
        }
        else if (!pricePaintGrunt.equals(other.pricePaintGrunt))
            return false;

        if (pricePaintRAl == null) {
            if (other.pricePaintRAl != null)
                return false;
        }
        else if (!pricePaintRAl.equals(other.pricePaintRAl))
            return false;

        if (priceDoorTrim60mm == null) {
            if (other.priceDoorTrim60mm != null)
                return false;
        }
        else if (!priceDoorTrim60mm.equals(other.priceDoorTrim60mm))
            return false;

        if (priceDoorTrim60mmNonStandart == null) {
            if (other.priceDoorTrim60mmNonStandart != null)
                return false;
        }
        else if (!priceDoorTrim60mmNonStandart.equals(other.priceDoorTrim60mmNonStandart))
            return false;

        if (priceDoorTrim90mm == null) {
            if (other.priceDoorTrim90mm != null)
                return false;
        }
        else if (!priceDoorTrim90mm.equals(other.priceDoorTrim90mm))
            return false;

        if (priceDoorTrim90mmNonStandart == null) {
            if (other.priceDoorTrim90mmNonStandart != null)
                return false;
        }
        else if (!priceDoorTrim90mmNonStandart.equals(other.priceDoorTrim90mmNonStandart))
            return false;

        if (surchGenNum10 == null) {
            if (other.surchGenNum10 != null)
                return false;
        }
        else if (!surchGenNum10.equals(other.surchGenNum10))
            return false;

        if (surchGenNumFr11to20 == null) {
            if (other.surchGenNumFr11to20 != null)
                return false;
        }
        else if (!surchGenNumFr11to20.equals(other.surchGenNumFr11to20))
            return false;

        if (surchGenNumFr21to50 == null) {
            if (other.surchGenNumFr21to50 != null)
                return false;
        }
        else if (!surchGenNumFr21to50.equals(other.surchGenNumFr21to50))
            return false;

        if (surchGenNumFr51to100 == null) {
            if (other.surchGenNumFr51to100 != null)
                return false;
        }
        else if (!surchGenNumFr51to100.equals(other.surchGenNumFr51to100))
            return false;

        if (surchGenNumFr101to1000 == null) {
            if (other.surchGenNumFr101to1000 != null)
                return false;
        }
        else if (!surchGenNumFr101to1000.equals(other.surchGenNumFr101to1000))
            return false;

        if (surchGenNum1000 == null) {
            if (other.surchGenNum1000 != null)
                return false;
        }
        else if (!surchGenNum1000.equals(other.surchGenNum1000))
            return false;

        return true;

    }

    @Override
    public String toString() {
        return  "DoorPrice{" +
                "priceLeafReech=" + priceLeafReech +
                ", priceLeafReechNonStandartHeigth=" + priceLeafReechNonStandartHeigth +
                ", priceLeafReechNonStandartWidth=" + priceLeafReechNonStandartWidth +
                ", priceLeafReechNonStandartHeigthWidth=" + priceLeafReechNonStandartHeigthWidth +
                ", priceLeafSot=" + priceLeafSot +
                ", priceLeafSotNonStandartHeigth=" + priceLeafSotNonStandartHeigth +
                ", priceLeafSotNonStandartWidth=" + priceLeafSotNonStandartWidth +
                ", priceLeafSotNonStandartHeigthWidth=" + priceLeafSotNonStandartHeigthWidth +
                ", priceKor=" + priceDoorFrame +
                ", priceKorNonStandart=" + priceDoorFrameNonStandart +
                ", priceAssmbl=" + priceAssmbl +
                ", priceHole=" + priceHole +
                ", priceInsert=" + priceInsert +
                ", priceZch201=" + priceZch201 +
                ", priceZV4=" + priceZV4 +
                ", pricePaintGrunt=" + pricePaintGrunt +
                ", pricePaintRAl=" + pricePaintRAl +
                ", priceDoorTrim60mm=" + priceDoorTrim60mm +
                ", priceDoorTrim60mmNonStandart=" + priceDoorTrim60mmNonStandart +
                ", priceDoorTrim90mm=" + priceDoorTrim90mm +
                ", priceDoorTrim90mmNonStandart=" + priceDoorTrim90mmNonStandart +
                ", surchGenNum10=" + surchGenNum10 +
                ", surchGenNumFr11to20=" + surchGenNumFr11to20 +
                ", surchGenNumFr21to50=" + surchGenNumFr21to50 +
                ", surchGenNumFr51to100=" + surchGenNumFr51to100 +
                ", surchGenNumFr101to1000=" + surchGenNumFr101to1000 +
                ", surchGenNum1000=" + surchGenNum1000 +
                "}";

    }

}