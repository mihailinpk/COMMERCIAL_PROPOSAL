package su.myspringwebapps.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import su.myspringwebapps.sevices.DoorsService;
import su.myspringwebapps.points.DoorPrice;

@Controller
public class SettingsController {

    @Autowired
    private DoorsService doorsService;

    @RequestMapping("/settings")
    public String getSettings(Model model) {
        DoorPrice doorPrice = doorsService.getDefaultDoorPrice();
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
    public String setSettings(@RequestParam(value = "jsondoorprice") String jsonDoorPrice) throws JsonProcessingException {
        doorsService.setDoorPrice(0, jsonDoorPrice);
        return "redirect:/settings";
    }

}