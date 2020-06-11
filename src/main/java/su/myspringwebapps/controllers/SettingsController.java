package su.myspringwebapps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import su.myspringwebapps.sevices.MainService;
import su.myspringwebapps.points.DoorPrice;

@Controller
public class SettingsController {

    @Autowired
    private MainService mainService;

    @RequestMapping("/settings")
    public String getSettings(Model model) {
        DoorPrice doorPrice = mainService.getDefaultDoorPrice();
        model.addAttribute("priceLeafReech", doorPrice.getPriceLeafReech());
        model.addAttribute("priceLeafReechNonStandartHeigth", doorPrice.getPriceLeafReechNonStandartHeigth());
        model.addAttribute("priceLeafReechNonStandartWidth", doorPrice.getPriceLeafReechNonStandartWidth());
        model.addAttribute("priceLeafReechNonStandartHeigthWidth", doorPrice.getPriceLeafReechNonStandartHeigthWidth());
        model.addAttribute("priceLeafSot", doorPrice.getPriceLeafSot());
        model.addAttribute("priceLeafSotNonStandartHeigth", doorPrice.getPriceLeafSotNonStandartHeigth());
        model.addAttribute("priceLeafSotNonStandartWidth", doorPrice.getPriceLeafSotNonStandartWidth());
        model.addAttribute("priceLeafSotNonStandartHeigthWidth", doorPrice.getPriceLeafSotNonStandartHeigthWidth());
        model.addAttribute("priceDoorFrame", doorPrice.getPriceDoorFrame());
        model.addAttribute("priceDoorFrameNonStandart", doorPrice.getPriceDoorFrameNonStandart());
        model.addAttribute("priceAssmbl", doorPrice.getPriceAssmbl());
        model.addAttribute("priceHole", doorPrice.getPriceHole());
        model.addAttribute("priceInsert", doorPrice.getPriceInsert());
        model.addAttribute("priceZch201", doorPrice.getPriceZch201());
        model.addAttribute("priceZV4", doorPrice.getPriceZV4());
        model.addAttribute("pricePaintGrunt", doorPrice.getPricePaintGrunt());
        model.addAttribute("pricePaintRAl", doorPrice.getPricePaintRAl());
        model.addAttribute("priceDoorTrim60mm", doorPrice.getPriceDoorTrim60mm());
        model.addAttribute("priceDoorTrim60mmNonStandart", doorPrice.getPriceDoorTrim60mmNonStandart());
        model.addAttribute("priceDoorTrim90mm", doorPrice.getPriceDoorTrim90mm());
        model.addAttribute("priceDoorTrim90mmNonStandart", doorPrice.getPriceDoorTrim90mmNonStandart());
        model.addAttribute("surchGenNum10", doorPrice.getSurchGenNum10());
        model.addAttribute("surchGenNumFr11to20", doorPrice.getSurchGenNumFr11to20());
        model.addAttribute("surchGenNumFr21to50", doorPrice.getSurchGenNumFr21to50());
        model.addAttribute("surchGenNumFr51to100", doorPrice.getSurchGenNumFr51to100());
        model.addAttribute("surchGenNumFr101to1000", doorPrice.getSurchGenNumFr101to1000());
        model.addAttribute("surchGenNum1000", doorPrice.getSurchGenNum1000());
        return "settings";
    }

    @RequestMapping(value = "setsettings", method = RequestMethod.POST)
    public String setSettings(
            @RequestParam(value = "priceleafreech") String valuePriceLeafReechFromView,
            @RequestParam(value = "priceleafreechnonstandartheigth") String valuePriceLeafReechNonStandartHeigthFromView,
            @RequestParam(value = "priceleafreechnonstandartwidth") String valuePriceLeafReechNonStandartWidthFromView,
            @RequestParam(value = "priceleafreechnonstandartheigthwidth") String valuePriceLeafReechNonStandartHeigthWidthFromView,
            @RequestParam(value = "priceleafsot") String valuePriceLeafSotFromView,
            @RequestParam(value = "priceleafsotnonstandartheigth") String valuePriceLeafSotNonStandartHeigthFromView,
            @RequestParam(value = "priceleafsotnonstandartwidth") String valuePriceLeafSotNonStandartWidthFromView,
            @RequestParam(value = "priceleafsotnonstandartheigthwidth") String valuePriceLeafSotNonStandartHeigthWidthFromView,
            @RequestParam(value = "pricedoorframe") String valuePriceDoorFrameFromView,
            @RequestParam(value = "pricedoorframenonstandart") String valuePriceDoorFrameNonStandartFromView,
            @RequestParam(value = "priceassmbl") String valuePriceAssmblFromView,
            @RequestParam(value = "pricehole") String valuePriceHoleFromView,
            @RequestParam(value = "priceinsert") String valuePriceInsertFromView,
            @RequestParam(value = "pricezch201") String valuePriceZch201FromView,
            @RequestParam(value = "pricezv4") String valuePriceZV4FromView,
            @RequestParam(value = "pricepaintgrunt") String valuePricePaintGruntFromView,
            @RequestParam(value = "pricepaintral") String valuePricePaintRAlfromView,
            @RequestParam(value = "pricedoortrim60mm") String valuePriceDoorTrim60mmFromView,
            @RequestParam(value = "pricedoortrim60mmnonstandart") String valuePriceDoorTrim60mmNonStandartFromView,
            @RequestParam(value = "pricedoortrim90mm") String valuePriceDoorTrim90mmFromView,
            @RequestParam(value = "pricedoortrim90mmnonstandart") String valuePriceDoorTrim90mmNonStandartFromView,
            @RequestParam(value = "surchgennum10") String valueSurchGenNum10fromView,
            @RequestParam(value = "surchgennumfr11to20") String valueSurchGenNumFr11to20fromView,
            @RequestParam(value = "surchgennumfr21to50") String valueSurchGenNumFr21to50fromView,
            @RequestParam(value = "surchgennumfr51to100") String valueSurchGenNumFr51to100fromView,
            @RequestParam(value = "surchgennumgr101to1000") String valueSurchGenNumFr101to1000fromView,
            @RequestParam(value = "surchgennum1000") String valueSurchGenNum1000fromView
    ) {
        mainService.setDoorPrice(
                0,
                Integer.parseInt(valuePriceLeafReechFromView),
                Integer.parseInt(valuePriceLeafReechNonStandartHeigthFromView),
                Integer.parseInt(valuePriceLeafReechNonStandartWidthFromView),
                Integer.parseInt(valuePriceLeafReechNonStandartHeigthWidthFromView),
                Integer.parseInt(valuePriceLeafSotFromView),
                Integer.parseInt(valuePriceLeafSotNonStandartHeigthFromView),
                Integer.parseInt(valuePriceLeafSotNonStandartWidthFromView),
                Integer.parseInt(valuePriceLeafSotNonStandartHeigthWidthFromView),
                Integer.parseInt(valuePriceDoorFrameFromView),
                Integer.parseInt(valuePriceDoorFrameNonStandartFromView),
                Integer.parseInt(valuePriceAssmblFromView),
                Integer.parseInt(valuePriceHoleFromView),
                Integer.parseInt(valuePriceInsertFromView),
                Integer.parseInt(valuePriceZch201FromView),
                Integer.parseInt(valuePriceZV4FromView),
                Integer.parseInt(valuePricePaintGruntFromView),
                Integer.parseInt(valuePricePaintRAlfromView),
                Integer.parseInt(valuePriceDoorTrim60mmFromView),
                Integer.parseInt(valuePriceDoorTrim60mmNonStandartFromView),
                Integer.parseInt(valuePriceDoorTrim90mmFromView),
                Integer.parseInt(valuePriceDoorTrim90mmNonStandartFromView),
                Integer.parseInt(valueSurchGenNum10fromView),
                Integer.parseInt(valueSurchGenNumFr11to20fromView),
                Integer.parseInt(valueSurchGenNumFr21to50fromView),
                Integer.parseInt(valueSurchGenNumFr51to100fromView),
                Integer.parseInt(valueSurchGenNumFr101to1000fromView),
                Integer.parseInt(valueSurchGenNum1000fromView)
        );
        return "redirect:/settings";
    }

}