package su.myspringwebapps.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import su.myspringwebapps.points.DoorPriceView;
import su.myspringwebapps.sevices.DoorsService;

@Controller
public class SettingsController {

    @Autowired
    private DoorsService doorsService;

    @RequestMapping(value = "/settings", method = RequestMethod.GET)
    public String getSettings(Model model) throws JsonProcessingException {
        model.addAttribute("jsonDoorPriceFromServer" , doorsService.getDefaultDoorPriceJson());
        return "settings";
    }

    @RequestMapping(value = "/setsettings", method = RequestMethod.POST)
    public String setSettings(@RequestBody DoorPriceView jsonDoorPrice) throws JsonProcessingException {
        doorsService.setDoorPrice(0, jsonDoorPrice);
        return "redirect:/settings";
    }

}