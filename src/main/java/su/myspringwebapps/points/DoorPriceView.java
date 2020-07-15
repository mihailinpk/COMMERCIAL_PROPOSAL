package su.myspringwebapps.points;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DoorPriceView extends DoorPrice {

    @JsonCreator
    public DoorPriceView(
        @JsonProperty("id") String idFromModel,
        @JsonProperty("priceLeafReech") String priceLeafReechFromModel,
        @JsonProperty("priceLeafReechNonStandartHeigth") String priceLeafReechNonStandartHeigthFromModel,
        @JsonProperty("priceLeafReechNonStandartWidth") String priceLeafReechNonStandartWidthFromModel,
        @JsonProperty("priceLeafReechNonStandartHeigthWidth") String priceLeafReechNonStandartHeigthWidthFromModel,
        @JsonProperty("priceLeafSot") String priceLeafSotFromModel,
        @JsonProperty("priceLeafSotNonStandartHeigth") String priceLeafSotNonStandartHeigthFromModel,
        @JsonProperty("priceLeafSotNonStandartWidth") String priceLeafSotNonStandartWidthFromModel,
        @JsonProperty("priceLeafSotNonStandartHeigthWidth") String priceLeafSotNonStandartHeigthWidthFromModel,
        @JsonProperty("priceDoorFrame") String priceDoorFrameFromModel,
        @JsonProperty("priceDoorFrameNonStandart") String priceDoorFrameNonStandartFromModel,
        @JsonProperty("priceAssmbl") String priceAssmblFromModel,
        @JsonProperty("priceHole") String priceHoleFromModel,
        @JsonProperty("priceInsert") String priceInsertFromModel,
        @JsonProperty("priceZch201") String priceZch201FromModel,
        @JsonProperty("priceZV4") String priceZV4FromModel,
        @JsonProperty("pricePaintGrunt") String pricePaintGruntFromModel,
        @JsonProperty("pricePaintRAl") String pricePaintRAlFromModel,
        @JsonProperty("priceDoorTrim60mm") String priceDoorTrim60mmFromModel,
        @JsonProperty("priceDoorTrim60mmNonStandart") String priceDoorTrim60mmNonStandartFromModel,
        @JsonProperty("priceDoorTrim90mm") String priceDoorTrim90mmFromModel,
        @JsonProperty("priceDoorTrim90mmNonStandart") String priceDoorTrim90mmNonStandartFromModel,
        @JsonProperty("surchGenNum10") String surchGenNum10FromModel,
        @JsonProperty("surchGenNumFr11to20") String surchGenNumFr11to20FromModel,
        @JsonProperty("surchGenNumFr21to50") String surchGenNumFr21to50FromModel,
        @JsonProperty("surchGenNumFr51to100") String surchGenNumFr51to100FromModel,
        @JsonProperty("surchGenNumFr101to1000") String surchGenNumFr101to1000FromModel,
        @JsonProperty("surchGenNum1000") String surchGenNum1000FromModel

    )    {
        super.setId(Integer.parseInt(idFromModel));
        super.setPriceLeafReech(Integer.parseInt(priceLeafReechFromModel));
        super.setPriceLeafReechNonStandartHeigth(Integer.parseInt(priceLeafReechNonStandartHeigthFromModel));
        super.setPriceLeafReechNonStandartWidth(Integer.parseInt(priceLeafReechNonStandartWidthFromModel));
        super.setPriceLeafReechNonStandartHeigthWidth(Integer.parseInt(priceLeafReechNonStandartHeigthWidthFromModel));
        super.setPriceLeafSot(Integer.parseInt(priceLeafSotFromModel));
        super.setPriceLeafSotNonStandartHeigth(Integer.parseInt(priceLeafSotNonStandartHeigthFromModel));
        super.setPriceLeafSotNonStandartWidth(Integer.parseInt(priceLeafSotNonStandartWidthFromModel));
        super.setPriceLeafSotNonStandartHeigthWidth(Integer.parseInt(priceLeafSotNonStandartHeigthWidthFromModel));
        super.setPriceDoorFrame(Integer.parseInt(priceDoorFrameFromModel));
        super.setPriceDoorFrameNonStandart(Integer.parseInt(priceDoorFrameNonStandartFromModel));
        super.setPriceAssmbl(Integer.parseInt(priceAssmblFromModel));
        super.setPriceHole(Integer.parseInt(priceHoleFromModel));
        super.setPriceInsert(Integer.parseInt(priceInsertFromModel));
        super.setPriceZch201(Integer.parseInt(priceZch201FromModel));
        super.setPriceZV4(Integer.parseInt(priceZV4FromModel));
        super.setPricePaintGrunt(Integer.parseInt(pricePaintGruntFromModel));
        super.setPricePaintRAl(Integer.parseInt(pricePaintRAlFromModel));
        super.setPriceDoorTrim60mm(Integer.parseInt(priceDoorTrim60mmFromModel));
        super.setPriceDoorTrim60mmNonStandart(Integer.parseInt(priceDoorTrim60mmNonStandartFromModel));
        super.setPriceDoorTrim90mm(Integer.parseInt(priceDoorTrim90mmFromModel));
        super.setPriceDoorTrim90mmNonStandart(Integer.parseInt(priceDoorTrim90mmNonStandartFromModel));
        super.setSurchGenNum10(Integer.parseInt(surchGenNum10FromModel));
        super.setSurchGenNumFr11to20(Integer.parseInt(surchGenNumFr11to20FromModel));
        super.setSurchGenNumFr21to50(Integer.parseInt(surchGenNumFr21to50FromModel));
        super.setSurchGenNumFr51to100(Integer.parseInt(surchGenNumFr51to100FromModel));
        super.setSurchGenNumFr101to1000(Integer.parseInt(surchGenNumFr101to1000FromModel));
        super.setSurchGenNum1000(Integer.parseInt(surchGenNum1000FromModel));
    }

}