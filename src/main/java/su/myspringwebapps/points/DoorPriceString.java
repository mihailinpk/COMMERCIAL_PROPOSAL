package su.myspringwebapps.points;

public class DoorPriceString {

    private String id;                                     //  id списка цен
    private String priceLeafReech;				            //	цена за полотно реечного заполнения стандарт
    private String priceLeafReechNonStandartHeigth;	    //	цена за полотно реечного заполнения н/стандарт по высоте
    private String priceLeafReechNonStandartWidth;		    //	цена за полотно реечного заполнения н/стандарт по ширине
    private String priceLeafReechNonStandartHeigthWidth;	//	цена за полотно реечного заполнения н/стандарт по ширине и высоте
    private String priceLeafSot;				            //	цена за полотно сотового заполнения стандарт
    private String priceLeafSotNonStandartHeigth;	        //	цена за полотно сотового заполнения н/стандарт по высоте
    private String priceLeafSotNonStandartWidth;	        //	цена за полотно сотового заполнения н/стандарт по ширине
    private String priceLeafSotNonStandartHeigthWidth;     //	цена за полотно сотового заполнения н/стандарт по ширине и высоте
    private String priceDoorFrame;				            //	цена за палку коробки стандарт
    private String priceDoorFrameNonStandart;		        //	цена за палку коробки н/стандарт
    private String priceAssmbl;				            //	цена за сборку
    private String priceHole;					            //	цена за отверстие
    private String priceInsert;				            //	цена за врезку фурнитуры
    private String priceZch201;				            //	цена за ЗЩ 2-01
    private String priceZV4;					            //	цена за ЗВ 4
    private String pricePaintGrunt;		                //	цена за окраску грунтовкой
    private String pricePaintRAl;			                //	цена за окраску цветом RAL
    private String priceDoorTrim60mm;			            //	цена за стандартную палку наличника 60мм
    private String priceDoorTrim60mmNonStandart;	        //	цена за н/стандартную палку наличника 60мм
    private String priceDoorTrim90mm;			            //	цена за стандартную палку наличника 90мм
    private String priceDoorTrim90mmNonStandart;	        //	цена за н/стандартную палку наличника 90мм
    private String surchGenNum10;				            //	надбавка за общее количество до 10 шт.
    private String surchGenNumFr11to20;		            //	надбавка за общее количетсов от 11 до 20 шт.
    private String surchGenNumFr21to50;		            //	надбавка за общее количетсов от 21 до 50 шт.
    private String surchGenNumFr51to100;		            //	надбавка за общее количетсов от 51 до 100 шт.
    private String surchGenNumFr101to1000;		            //	надбавка за общее количетсов от 101 до 1000 шт.
    private String surchGenNum1000;			            //	надбавка за общее количетсов от 1000 шт.

    public DoorPriceString()    {
        System.out.println("DoorPriceString()");
        this.id = "0";
        this.priceLeafReech = "0";
        this.priceLeafReechNonStandartHeigth = "0";
        this.priceLeafReechNonStandartWidth = "0";
        this.priceLeafReechNonStandartHeigthWidth = "0";
        this.priceLeafSot = "0";
        this.priceLeafSotNonStandartHeigth = "0";
        this.priceLeafSotNonStandartWidth = "0";
        this.priceLeafSotNonStandartHeigthWidth = "0";
        this.priceDoorFrame = "0";
        this.priceDoorFrameNonStandart = "0";
        this.priceAssmbl = "0";
        this.priceHole = "0";
        this.priceInsert = "0";
        this.priceZch201 = "0";
        this.priceZV4 = "0";
        this.pricePaintGrunt = "0";
        this.pricePaintRAl = "0";
        this.priceDoorTrim60mm = "0";
        this.priceDoorTrim60mmNonStandart = "0";
        this.priceDoorTrim90mm = "0";
        this.priceDoorTrim90mmNonStandart = "0";
        this.surchGenNum10 = "0";
        this.surchGenNumFr11to20 = "0";
        this.surchGenNumFr21to50 = "0";
        this.surchGenNumFr51to100 = "0";
        this.surchGenNumFr101to1000 = "0";
        this.surchGenNum1000 = "0";
    }

    public DoorPriceString(String id, String priceLeafReech, String priceLeafReechNonStandartHeigth, String priceLeafReechNonStandartWidth, String priceLeafReechNonStandartHeigthWidth, String priceLeafSot, String priceLeafSotNonStandartHeigth, String priceLeafSotNonStandartWidth, String priceLeafSotNonStandartHeigthWidth, String priceDoorFrame, String priceDoorFrameNonStandart, String priceAssmbl, String priceHole, String priceInsert, String priceZch201, String priceZV4, String pricePaintGrunt, String pricePaintRAl, String priceDoorTrim60mm, String priceDoorTrim60mmNonStandart, String priceDoorTrim90mm, String priceDoorTrim90mmNonStandart, String surchGenNum10, String surchGenNumFr11to20, String surchGenNumFr21to50, String surchGenNumFr51to100, String surchGenNumFr101to1000, String surchGenNum1000) {
        System.out.println("DoorPriceString(params)");
        this.id = id;
        this.priceLeafReech = priceLeafReech;
        this.priceLeafReechNonStandartHeigth = priceLeafReechNonStandartHeigth;
        this.priceLeafReechNonStandartWidth = priceLeafReechNonStandartWidth;
        this.priceLeafReechNonStandartHeigthWidth = priceLeafReechNonStandartHeigthWidth;
        this.priceLeafSot = priceLeafSot;
        this.priceLeafSotNonStandartHeigth = priceLeafSotNonStandartHeigth;
        this.priceLeafSotNonStandartWidth = priceLeafSotNonStandartWidth;
        this.priceLeafSotNonStandartHeigthWidth = priceLeafSotNonStandartHeigthWidth;
        this.priceDoorFrame = priceDoorFrame;
        this.priceDoorFrameNonStandart = priceDoorFrameNonStandart;
        this.priceAssmbl = priceAssmbl;
        this.priceHole = priceHole;
        this.priceInsert = priceInsert;
        this.priceZch201 = priceZch201;
        this.priceZV4 = priceZV4;
        this.pricePaintGrunt = pricePaintGrunt;
        this.pricePaintRAl = pricePaintRAl;
        this.priceDoorTrim60mm = priceDoorTrim60mm;
        this.priceDoorTrim60mmNonStandart = priceDoorTrim60mmNonStandart;
        this.priceDoorTrim90mm = priceDoorTrim90mm;
        this.priceDoorTrim90mmNonStandart = priceDoorTrim90mmNonStandart;
        this.surchGenNum10 = surchGenNum10;
        this.surchGenNumFr11to20 = surchGenNumFr11to20;
        this.surchGenNumFr21to50 = surchGenNumFr21to50;
        this.surchGenNumFr51to100 = surchGenNumFr51to100;
        this.surchGenNumFr101to1000 = surchGenNumFr101to1000;
        this.surchGenNum1000 = surchGenNum1000;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPriceLeafReech() {
        return priceLeafReech;
    }

    public void setPriceLeafReech(String priceLeafReech) {
        this.priceLeafReech = priceLeafReech;
    }

    public String getPriceLeafReechNonStandartHeigth() {
        return priceLeafReechNonStandartHeigth;
    }

    public void setPriceLeafReechNonStandartHeigth(String priceLeafReechNonStandartHeigth) {
        this.priceLeafReechNonStandartHeigth = priceLeafReechNonStandartHeigth;
    }

    public String getPriceLeafReechNonStandartWidth() {
        return priceLeafReechNonStandartWidth;
    }

    public void setPriceLeafReechNonStandartWidth(String priceLeafReechNonStandartWidth) {
        this.priceLeafReechNonStandartWidth = priceLeafReechNonStandartWidth;
    }

    public String getPriceLeafReechNonStandartHeigthWidth() {
        return priceLeafReechNonStandartHeigthWidth;
    }

    public void setPriceLeafReechNonStandartHeigthWidth(String priceLeafReechNonStandartHeigthWidth) {
        this.priceLeafReechNonStandartHeigthWidth = priceLeafReechNonStandartHeigthWidth;
    }

    public String getPriceLeafSot() {
        return priceLeafSot;
    }

    public void setPriceLeafSot(String priceLeafSot) {
        this.priceLeafSot = priceLeafSot;
    }

    public String getPriceLeafSotNonStandartHeigth() {
        return priceLeafSotNonStandartHeigth;
    }

    public void setPriceLeafSotNonStandartHeigth(String priceLeafSotNonStandartHeigth) {
        this.priceLeafSotNonStandartHeigth = priceLeafSotNonStandartHeigth;
    }

    public String getPriceLeafSotNonStandartWidth() {
        return priceLeafSotNonStandartWidth;
    }

    public void setPriceLeafSotNonStandartWidth(String priceLeafSotNonStandartWidth) {
        this.priceLeafSotNonStandartWidth = priceLeafSotNonStandartWidth;
    }

    public String getPriceLeafSotNonStandartHeigthWidth() {
        return priceLeafSotNonStandartHeigthWidth;
    }

    public void setPriceLeafSotNonStandartHeigthWidth(String priceLeafSotNonStandartHeigthWidth) {
        this.priceLeafSotNonStandartHeigthWidth = priceLeafSotNonStandartHeigthWidth;
    }

    public String getPriceDoorFrame() {
        return priceDoorFrame;
    }

    public void setPriceDoorFrame(String priceDoorFrame) {
        this.priceDoorFrame = priceDoorFrame;
    }

    public String getPriceDoorFrameNonStandart() {
        return priceDoorFrameNonStandart;
    }

    public void setPriceDoorFrameNonStandart(String priceDoorFrameNonStandart) {
        this.priceDoorFrameNonStandart = priceDoorFrameNonStandart;
    }

    public String getPriceAssmbl() {
        return priceAssmbl;
    }

    public void setPriceAssmbl(String priceAssmbl) {
        this.priceAssmbl = priceAssmbl;
    }

    public String getPriceHole() {
        return priceHole;
    }

    public void setPriceHole(String priceHole) {
        this.priceHole = priceHole;
    }

    public String getPriceInsert() {
        return priceInsert;
    }

    public void setPriceInsert(String priceInsert) {
        this.priceInsert = priceInsert;
    }

    public String getPriceZch201() {
        return priceZch201;
    }

    public void setPriceZch201(String priceZch201) {
        this.priceZch201 = priceZch201;
    }

    public String getPriceZV4() {
        return priceZV4;
    }

    public void setPriceZV4(String priceZV4) {
        this.priceZV4 = priceZV4;
    }

    public String getPricePaintGrunt() {
        return pricePaintGrunt;
    }

    public void setPricePaintGrunt(String pricePaintGrunt) {
        this.pricePaintGrunt = pricePaintGrunt;
    }

    public String getPricePaintRAl() {
        return pricePaintRAl;
    }

    public void setPricePaintRAl(String pricePaintRAl) {
        this.pricePaintRAl = pricePaintRAl;
    }

    public String getPriceDoorTrim60mm() {
        return priceDoorTrim60mm;
    }

    public void setPriceDoorTrim60mm(String priceDoorTrim60mm) {
        this.priceDoorTrim60mm = priceDoorTrim60mm;
    }

    public String getPriceDoorTrim60mmNonStandart() {
        return priceDoorTrim60mmNonStandart;
    }

    public void setPriceDoorTrim60mmNonStandart(String priceDoorTrim60mmNonStandart) {
        this.priceDoorTrim60mmNonStandart = priceDoorTrim60mmNonStandart;
    }

    public String getPriceDoorTrim90mm() {
        return priceDoorTrim90mm;
    }

    public void setPriceDoorTrim90mm(String priceDoorTrim90mm) {
        this.priceDoorTrim90mm = priceDoorTrim90mm;
    }

    public String getPriceDoorTrim90mmNonStandart() {
        return priceDoorTrim90mmNonStandart;
    }

    public void setPriceDoorTrim90mmNonStandart(String priceDoorTrim90mmNonStandart) {
        this.priceDoorTrim90mmNonStandart = priceDoorTrim90mmNonStandart;
    }

    public String getSurchGenNum10() {
        return surchGenNum10;
    }

    public void setSurchGenNum10(String surchGenNum10) {
        this.surchGenNum10 = surchGenNum10;
    }

    public String getSurchGenNumFr11to20() {
        return surchGenNumFr11to20;
    }

    public void setSurchGenNumFr11to20(String surchGenNumFr11to20) {
        this.surchGenNumFr11to20 = surchGenNumFr11to20;
    }

    public String getSurchGenNumFr21to50() {
        return surchGenNumFr21to50;
    }

    public void setSurchGenNumFr21to50(String surchGenNumFr21to50) {
        this.surchGenNumFr21to50 = surchGenNumFr21to50;
    }

    public String getSurchGenNumFr51to100() {
        return surchGenNumFr51to100;
    }

    public void setSurchGenNumFr51to100(String surchGenNumFr51to100) {
        this.surchGenNumFr51to100 = surchGenNumFr51to100;
    }

    public String getSurchGenNumFr101to1000() {
        return surchGenNumFr101to1000;
    }

    public void setSurchGenNumFr101to1000(String surchGenNumFr101to1000) {
        this.surchGenNumFr101to1000 = surchGenNumFr101to1000;
    }

    public String getSurchGenNum1000() {
        return surchGenNum1000;
    }

    public void setSurchGenNum1000(String surchGenNum1000) {
        this.surchGenNum1000 = surchGenNum1000;
    }

    @Override
    public String toString() {
        return "DoorPriceString{" +
                "id='" + id + '\'' +
                ", priceLeafReech='" + priceLeafReech + '\'' +
                ", priceLeafReechNonStandartHeigth='" + priceLeafReechNonStandartHeigth + '\'' +
                ", priceLeafReechNonStandartWidth='" + priceLeafReechNonStandartWidth + '\'' +
                ", priceLeafReechNonStandartHeigthWidth='" + priceLeafReechNonStandartHeigthWidth + '\'' +
                ", priceLeafSot='" + priceLeafSot + '\'' +
                ", priceLeafSotNonStandartHeigth='" + priceLeafSotNonStandartHeigth + '\'' +
                ", priceLeafSotNonStandartWidth='" + priceLeafSotNonStandartWidth + '\'' +
                ", priceLeafSotNonStandartHeigthWidth='" + priceLeafSotNonStandartHeigthWidth + '\'' +
                ", priceDoorFrame='" + priceDoorFrame + '\'' +
                ", priceDoorFrameNonStandart='" + priceDoorFrameNonStandart + '\'' +
                ", priceAssmbl='" + priceAssmbl + '\'' +
                ", priceHole='" + priceHole + '\'' +
                ", priceInsert='" + priceInsert + '\'' +
                ", priceZch201='" + priceZch201 + '\'' +
                ", priceZV4='" + priceZV4 + '\'' +
                ", pricePaintGrunt='" + pricePaintGrunt + '\'' +
                ", pricePaintRAl='" + pricePaintRAl + '\'' +
                ", priceDoorTrim60mm='" + priceDoorTrim60mm + '\'' +
                ", priceDoorTrim60mmNonStandart='" + priceDoorTrim60mmNonStandart + '\'' +
                ", priceDoorTrim90mm='" + priceDoorTrim90mm + '\'' +
                ", priceDoorTrim90mmNonStandart='" + priceDoorTrim90mmNonStandart + '\'' +
                ", surchGenNum10='" + surchGenNum10 + '\'' +
                ", surchGenNumFr11to20='" + surchGenNumFr11to20 + '\'' +
                ", surchGenNumFr21to50='" + surchGenNumFr21to50 + '\'' +
                ", surchGenNumFr51to100='" + surchGenNumFr51to100 + '\'' +
                ", surchGenNumFr101to1000='" + surchGenNumFr101to1000 + '\'' +
                ", surchGenNum1000='" + surchGenNum1000 + '\'' +
                '}';
    }
}