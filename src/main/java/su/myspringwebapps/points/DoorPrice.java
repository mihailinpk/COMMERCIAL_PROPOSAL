package su.myspringwebapps.points;

public class DoorPrice {

    private Integer id;                         //  id списка цен
    private Integer priceLeafReech;				//	цена за полотно реечного заполнения стандарт
    private Integer priceLeafReechNstHeigth;	//	цена за полотно реечного заполнения н/стандарт по высоте
    private Integer priceLeafReechNstWidth;		//	цена за полотно реечного заполнения н/стандарт по ширине
    private Integer priceLeafReechNstHghtWdth;	//	цена за полотно реечного заполнения н/стандарт по ширине и высоте
    private Integer priceLeafSot;				//	цена за полотно сотового заполнения стандарт
    private Integer priceLeafSotNstHeigth;		//	цена за полотно сотового заполнения н/стандарт по высоте
    private Integer priceLeafSotNstWidth;		//	цена за полотно сотового заполнения н/стандарт по ширине
    private Integer priceLeafSotNstHghtWdth;	//	цена за полотно сотового заполнения н/стандарт по ширине и высоте
    private Integer priceDoorFrame;				//	цена за палку коробки стандарт
    private Integer priceDoorFrameNst;			//	цена за палку коробки н/стандарт
    private Integer priceAssmbl;				//	цена за сборку
    private Integer priceHole;					//	цена за отверстие
    private Integer priceInsert;				//	цена за врезку фурнитуры
    private Integer priceZch201;				//	цена за ЗЩ 2-01
    private Integer priceZV4;					//	цена за ЗВ 4
    private Integer pricePaintGrunt;		    //	цена за окраску грунтовкой
    private Integer pricePaintRAl;			    //	цена за окраску цветом RAL
    private Integer priceDoorTrim60mm;			//	цена за стандартную палку наличника 60мм
    private Integer priceDoorTrim60mmNst;		//	цена за н/стандартную палку наличника 60мм
    private Integer priceDoorTrim90mm;			//	цена за стандартную палку наличника 90мм
    private Integer priceDoorTrim90mmNst;		//	цена за н/стандартную палку наличника 90мм
    private Integer surchGenNum10;				//	надбавка за общее количество до 10 шт.
    private Integer surchGenNumFr11to20;		//	надбавка за общее количетсов от 11 до 20 шт.
    private Integer surchGenNumFr21to50;		//	надбавка за общее количетсов от 21 до 50 шт.
    private Integer surchGenNumFr51to100;		//	надбавка за общее количетсов от 51 до 100 шт.
    private Integer surchGenNumFr101to1000;		//	надбавка за общее количетсов от 101 до 1000 шт.
    private Integer surchGenNum1000;			//	надбавка за общее количетсов от 1000 шт.

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

    public Integer getPriceLeafReechNstHeigth() {
        return priceLeafReechNstHeigth;
    }

    public void setPriceLeafReechNstHeigth(Integer priceLeafReechNstHeigth) {
        this.priceLeafReechNstHeigth = priceLeafReechNstHeigth;
    }

    public Integer getPriceLeafReechNstWidth() {
        return priceLeafReechNstWidth;
    }

    public void setPriceLeafReechNstWidth(Integer priceLeafReechNstWidth) {
        this.priceLeafReechNstWidth = priceLeafReechNstWidth;
    }

    public Integer getPriceLeafReechNstHghtWdth() {
        return priceLeafReechNstHghtWdth;
    }

    public void setPriceLeafReechNstHghtWdth(Integer priceLeafReechNstHghtWdth) {
        this.priceLeafReechNstHghtWdth = priceLeafReechNstHghtWdth;
    }

    public Integer getPriceLeafSot() {
        return priceLeafSot;
    }

    public void setPriceLeafSot(Integer priceLeafSot) {
        this.priceLeafSot = priceLeafSot;
    }

    public Integer getPriceLeafSotNstHeigth() {
        return priceLeafSotNstHeigth;
    }

    public void setPriceLeafSotNstHeigth(Integer priceLeafSotNstHeigth) {
        this.priceLeafSotNstHeigth = priceLeafSotNstHeigth;
    }

    public Integer getPriceLeafSotNstWidth() {
        return priceLeafSotNstWidth;
    }

    public void setPriceLeafSotNstWidth(Integer priceLeafSotNstWidth) {
        this.priceLeafSotNstWidth = priceLeafSotNstWidth;
    }

    public Integer getPriceLeafSotNstHghtWdth() {
        return priceLeafSotNstHghtWdth;
    }

    public void setPriceLeafSotNstHghtWdth(Integer priceLeafSotNstHghtWdth) {
        this.priceLeafSotNstHghtWdth = priceLeafSotNstHghtWdth;
    }

    public Integer getPriceDoorFrame() {
        return priceDoorFrame;
    }

    public void setPriceDoorFrame(Integer priceKor) {
        this.priceDoorFrame = priceKor;
    }

    public Integer getPriceDoorFrameNst() {
        return priceDoorFrameNst;
    }

    public void setPriceDoorFrameNst(Integer priceKorNst) {
        this.priceDoorFrameNst = priceKorNst;
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

    public Integer getPriceDoorTrim60mmNst() {
        return priceDoorTrim60mmNst;
    }

    public void setPriceDoorTrim60mmNst(Integer priceDoorTrim60mmNst) {
        this.priceDoorTrim60mmNst = priceDoorTrim60mmNst;
    }

    public Integer getPriceDoorTrim90mm() {
        return priceDoorTrim90mm;
    }

    public void setPriceDoorTrim90mm(Integer priceDoorTrim90mm) {
        this.priceDoorTrim90mm = priceDoorTrim90mm;
    }

    public Integer getPriceDoorTrim90mmNst() {
        return priceDoorTrim90mmNst;
    }

    public void setPriceDoorTrim90mmNst(Integer priceDoorTrim90mmNst) {
        this.priceDoorTrim90mmNst = priceDoorTrim90mmNst;
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
        result = prime * result + ((priceLeafReechNstHeigth == null) ? 0 : priceLeafReechNstHeigth.hashCode());
        result = prime * result + ((priceLeafReechNstWidth == null) ? 0 : priceLeafReechNstWidth.hashCode());
        result = prime * result + ((priceLeafReechNstHghtWdth == null) ? 0 : priceLeafReechNstHghtWdth.hashCode());
        result = prime * result + ((priceLeafSot == null) ? 0 : priceLeafSot.hashCode());
        result = prime * result + ((priceLeafSotNstHeigth == null) ? 0 : priceLeafSotNstHeigth.hashCode());
        result = prime * result + ((priceLeafSotNstWidth == null) ? 0 : priceLeafSotNstWidth.hashCode());
        result = prime * result + ((priceLeafSotNstHghtWdth == null) ? 0 : priceLeafSotNstHghtWdth.hashCode());
        result = prime * result + ((priceDoorFrame == null) ? 0 : priceDoorFrame.hashCode());
        result = prime * result + ((priceDoorFrameNst == null) ? 0 : priceDoorFrameNst.hashCode());
        result = prime * result + ((priceAssmbl == null) ? 0 : priceAssmbl.hashCode());
        result = prime * result + ((priceHole == null) ? 0 : priceHole.hashCode());
        result = prime * result + ((priceInsert == null) ? 0 : priceInsert.hashCode());
        result = prime * result + ((priceZch201 == null) ? 0 : priceZch201.hashCode());
        result = prime * result + ((priceZV4 == null) ? 0 : priceZV4.hashCode());
        result = prime * result + ((pricePaintGrunt == null) ? 0 : pricePaintGrunt.hashCode());
        result = prime * result + ((pricePaintRAl == null) ? 0 : pricePaintRAl.hashCode());
        result = prime * result + ((priceDoorTrim60mm == null) ? 0 : priceDoorTrim60mm.hashCode());
        result = prime * result + ((priceDoorTrim60mmNst == null) ? 0 : priceDoorTrim60mmNst.hashCode());
        result = prime * result + ((priceDoorTrim90mm == null) ? 0 : priceDoorTrim90mm.hashCode());
        result = prime * result + ((priceDoorTrim90mmNst == null) ? 0 : priceDoorTrim90mmNst.hashCode());
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

        if (priceLeafReechNstHeigth == null) {
            if (other.priceLeafReechNstHeigth != null)
                return false;
        }
        else if (!priceLeafReechNstHeigth.equals(other.priceLeafReechNstHeigth))
            return false;

        if (priceLeafReechNstWidth == null) {
            if (other.priceLeafReechNstWidth != null)
                return false;
        }
        else if (!priceLeafReechNstWidth.equals(other.priceLeafReechNstWidth))
            return false;

        if (priceLeafReechNstHghtWdth == null) {
            if (other.priceLeafReechNstHghtWdth != null)
                return false;
        }
        else if (!priceLeafReechNstHghtWdth.equals(other.priceLeafReechNstHghtWdth))
            return false;

        if (priceLeafSot == null) {
            if (other.priceLeafSot != null)
                return false;
        }
        else if (!priceLeafSot.equals(other.priceLeafSot))
            return false;

        if (priceLeafSotNstHeigth == null) {
            if (other.priceLeafSotNstHeigth != null)
                return false;
        }
        else if (!priceLeafSotNstHeigth.equals(other.priceLeafSotNstHeigth))
            return false;

        if (priceLeafSotNstWidth == null) {
            if (other.priceLeafSotNstWidth != null)
                return false;
        }
        else if (!priceLeafSotNstWidth.equals(other.priceLeafSotNstWidth))
            return false;

        if (priceLeafSotNstHghtWdth == null) {
            if (other.priceLeafSotNstHghtWdth != null)
                return false;
        }
        else if (!priceLeafSotNstHghtWdth.equals(other.priceLeafSotNstHghtWdth))
            return false;

        if (priceDoorFrame == null) {
            if (other.priceDoorFrame != null)
                return false;
        }
        else if (!priceDoorFrame.equals(other.priceDoorFrame))
            return false;

        if (priceDoorFrameNst == null) {
            if (other.priceDoorFrameNst != null)
                return false;
        }
        else if (!priceDoorFrameNst.equals(other.priceDoorFrameNst))
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

        if (priceDoorTrim60mmNst == null) {
            if (other.priceDoorTrim60mmNst != null)
                return false;
        }
        else if (!priceDoorTrim60mmNst.equals(other.priceDoorTrim60mmNst))
            return false;

        if (priceDoorTrim90mm == null) {
            if (other.priceDoorTrim90mm != null)
                return false;
        }
        else if (!priceDoorTrim90mm.equals(other.priceDoorTrim90mm))
            return false;

        if (priceDoorTrim90mmNst == null) {
            if (other.priceDoorTrim90mmNst != null)
                return false;
        }
        else if (!priceDoorTrim90mmNst.equals(other.priceDoorTrim90mmNst))
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
                ", priceLeafReechNstHeigth=" + priceLeafReechNstHeigth +
                ", priceLeafReechNstWidth=" + priceLeafReechNstWidth +
                ", priceLeafReechNstHghtWdth=" + priceLeafReechNstHghtWdth +
                ", priceLeafSot=" + priceLeafSot +
                ", priceLeafSotNstHeigth=" + priceLeafSotNstHeigth +
                ", priceLeafSotNstWidth=" + priceLeafSotNstWidth +
                ", priceLeafSotNstHghtWdth=" + priceLeafSotNstHghtWdth +
                ", priceKor=" + priceDoorFrame +
                ", priceKorNst=" + priceDoorFrameNst +
                ", priceAssmbl=" + priceAssmbl +
                ", priceHole=" + priceHole +
                ", priceInsert=" + priceInsert +
                ", priceZch201=" + priceZch201 +
                ", priceZV4=" + priceZV4 +
                ", pricePaintGrunt=" + pricePaintGrunt +
                ", pricePaintRAl=" + pricePaintRAl +
                ", priceDoorTrim60mm=" + priceDoorTrim60mm +
                ", priceDoorTrim60mmNst=" + priceDoorTrim60mmNst +
                ", priceDoorTrim90mm=" + priceDoorTrim90mm +
                ", priceDoorTrim90mmNst=" + priceDoorTrim90mmNst +
                ", surchGenNum10=" + surchGenNum10 +
                ", surchGenNumFr11to20=" + surchGenNumFr11to20 +
                ", surchGenNumFr21to50=" + surchGenNumFr21to50 +
                ", surchGenNumFr51to100=" + surchGenNumFr51to100 +
                ", surchGenNumFr101to1000=" + surchGenNumFr101to1000 +
                ", surchGenNum1000=" + surchGenNum1000 +
                "}";

    }

}