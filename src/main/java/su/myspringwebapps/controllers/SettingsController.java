package su.myspringwebapps.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import su.myspringwebapps.sevices.DoorsService;

@Controller
public class SettingsController {

    @Autowired
    private DoorsService doorsService;

    @RequestMapping("/settings")
    public String getSettings(Model model) throws JsonProcessingException {
        model.addAttribute("jsonDoorPriceFromServer" , doorsService.getDefaultDoorPriceJson());
        return "settings";
    }

    @RequestMapping(value = "setsettings", method = RequestMethod.POST)
    public String setSettings(@RequestParam(value = "jsondoorpricetoserver") String jsonDoorPriceFromModel) throws JsonProcessingException {
        doorsService.setDoorPrice(0, jsonDoorPriceFromModel);
        return "redirect:/settings";
    }

}