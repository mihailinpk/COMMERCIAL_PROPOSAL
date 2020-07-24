package su.myspringwebapps.controllers;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import su.myspringwebapps.sevices.DoorsService;
import su.myspringwebapps.points.DoorPosition;

@Controller
@SessionAttributes(types = ArrayList.class)
public class DoorsController {

    @Autowired
    private DoorsService doorsService;

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model)    {
        model.addAttribute(new ArrayList<DoorPosition>());
        return "redirect:/";
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String getIndex(Model model, @ModelAttribute ArrayList<DoorPosition> doors)    {
        model.addAttribute("totalNumberOfDoors", doorsService.getTotalNumberOfDoors(doors));
        model.addAttribute("generalDoorPrice", doorsService.getGeneralDoorPrice(doors));
        return "index";
    }

    @ModelAttribute
    public List<DoorPosition> createDoorPositionList()  {
        return new ArrayList<>();
    }

    @RequestMapping("/addposition")
    public String getAddPosition()  {
        return "addposition";
    }

    @RequestMapping(value = "/adding", method = RequestMethod.POST)
    public String addingPosition(
            @RequestParam(value = "jsondoorposition") String jsonDoorPosition,
            Model model,
            @ModelAttribute ArrayList<DoorPosition> doors
    ) throws JsonProcessingException {

        model.addAttribute("listCurrentCommercialProposal", doorsService.saveNewDoorPosition(jsonDoorPosition, doors));

        return "redirect:/";

    }

    @RequestMapping(value = "delete/", method = RequestMethod.POST)
    public String deleteDoor(
            @RequestParam(value = "id") String stringID,
            Model model,
            @ModelAttribute ArrayList<DoorPosition> doors
    )  {

        model.addAttribute("listCurrentCommercialProposal", doorsService.deleteDoorPosition(Integer.parseInt(stringID), doors));

        return "redirect:/index";

    }

}