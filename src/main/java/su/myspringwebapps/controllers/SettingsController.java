package su.myspringwebapps.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


import su.myspringwebapps.points.DoorPrice;
import su.myspringwebapps.points.DoorPriceString;
import su.myspringwebapps.points.DoorPriceView;
import su.myspringwebapps.sevices.DoorsService;

import java.beans.PropertyEditorSupport;

@Controller
public class SettingsController {

    @Autowired
    private DoorsService doorsService;

    @RequestMapping("/settings")
    public String getSettings(Model model) throws JsonProcessingException {
        model.addAttribute("jsonDoorPriceFromServer" , doorsService.getDefaultDoorPriceJson());
        return "settings";
    }

//    @RequestMapping(value = "setsettings", method = RequestMethod.POST)
//    public String setSettings(@RequestParam(value = "jsondoorpricetoserver") String jsonDoorPriceFromModel) throws JsonProcessingException {
//        doorsService.setDoorPrice(0, jsonDoorPriceFromModel);
//        return "redirect:/settings";
//    }

    @RequestMapping(value = "/setsettings", method=RequestMethod.POST)
    public String setSettings(@RequestBody DoorPriceView jsonDoorPrice) {
        System.out.println(jsonDoorPrice);
        return "redirect:/settings";
    }

}