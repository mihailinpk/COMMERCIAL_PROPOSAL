package su.myspringwebapps.controllers;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import su.myspringwebapps.controllers.enums.*;
import su.myspringwebapps.sevices.MainService;
import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;


@Controller
public class MainController {

    static ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/servlet-servlet.xml");
    static MainService mainService = (MainService) context.getBean("mainservice");

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String getIndex(Model model)    {
        List<DoorPosition> doors = mainService.getAllDoors();
        model.addAttribute("listCurrentCommercialProposal", doors);
        model.addAttribute("totalNumberOfDoors", mainService.getTotalNumberOfDoors());
        model.addAttribute("generalDoorPrice", mainService.getGeneralDoorPrice());
        return "index";
    }

    @RequestMapping("/addposition")
    public String getAddPosition()  {
        return "addposition";
    }

    @RequestMapping(value = "/adding", method = RequestMethod.GET)
    public String addingPosition(
            @RequestParam(value = "width") String valueWidthFromView,
            @RequestParam(value = "height") String valueHeightFromView,
            @RequestParam(value = "type") String valueTypeFromView,
            @RequestParam(value = "open") String valueOpenFromView,
            @RequestParam(value = "doorstep") String valueDoorstepFromView,
            @RequestParam(value = "assembl") String valueAssemblFromView,
            @RequestParam(value = "fill") String valueFillFromView,
            @RequestParam(value = "hole") String valueHoleFromView,
            @RequestParam(value = "fitt") String valueFittFromView,
            @RequestParam(value = "paint") String valuePaintFromView,
            @RequestParam(value = "doortrim") String valueDoorTrimFromView,
            @RequestParam(value = "twodoorleafs") String valueTwoDoorLeafsFromView,
            @RequestParam(value = "sumpos") String valueSumPositionFromView
    )   {

        Short sizeWidth = Short.parseShort(valueWidthFromView);
        Short sizeHeigth = Short.parseShort(valueHeightFromView);

        String type = Type.valueOf(valueTypeFromView).getType();

        String open = ((valueOpenFromView.equals("opt1")) ? "правое" : "левое");

        String doorStep = ((valueDoorstepFromView.equals("opt1")) ? "есть" : "нет");

        String assmbl = ((valueAssemblFromView.equals("opt1")) ? "есть" : "нет");

        String fill = ((valueFillFromView.equals("opt1")) ? "сотовое" : "реечное");

        String hole = ((valueHoleFromView.equals("opt1")) ? "нет" : "есть");

        String fitt = Mortise.valueOf(valueFittFromView).getMortise();

        String paint = Paint.valueOf(valuePaintFromView).getPaint();

        String doorTrim = DoorTrim.valueOf(valueDoorTrimFromView).getDoorTrim();

        String twoDoorLeafs = TwoDoorLeafs.valueOf(valueTwoDoorLeafsFromView).getTwoDoorLeafs();

        Integer sum = Integer.parseInt(valueSumPositionFromView);

        mainService.saveNewDoorPosition(
            sizeWidth, sizeHeigth, type, open, doorStep,
                assmbl, fill, hole, fitt, paint, doorTrim, twoDoorLeafs, sum
        );

        return "redirect:/";

    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deleteDoor(@PathVariable Integer id)  {
        DoorPosition doorPosition = mainService.getDoorPositionById(id);
        mainService.deleteDoorPosition(doorPosition);
        return "redirect:/index";
    }

    @RequestMapping("/settings")
    public String getSettings(Model model) {
        DoorPrice doorPrice = mainService.getDoorPriceById(0);
        model.addAttribute("priceLeafReech", doorPrice.getPriceLeafReech());
        model.addAttribute("priceLeafReechNonStandartHeigth", doorPrice.getPriceLeafReechNonStandartHeigth());
        model.addAttribute("priceLeafReechNonStandartWidth", doorPrice.getPriceLeafReechNonStandartWidth());
        model.addAttribute("priceLeafReechNonStandartHghtWdth", doorPrice.getPriceLeafReechNonStandartHghtWdth());
        model.addAttribute("priceLeafSot", doorPrice.getPriceLeafSot());
        model.addAttribute("priceLeafSotNonStandartHeigth", doorPrice.getPriceLeafSotNonStandartHeigth());
        model.addAttribute("priceLeafSotNonStandartWidth", doorPrice.getPriceLeafSotNonStandartWidth());
        model.addAttribute("priceLeafSotNonStandartHghtWdth", doorPrice.getPriceLeafSotNonStandartHghtWdth());
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

    @RequestMapping(value = "setsettings", method = RequestMethod.GET)
    public String setSettings(
            @RequestParam(value = "priceleafreech") String valuePriceLeafReechFromView,
            @RequestParam(value = "priceleafreechNonStandartheigth") String valuePriceLeafReechNonStandartHeigthFromView,
            @RequestParam(value = "priceleafreechNonStandartwidth") String valuePriceLeafReechNonStandartWidthFromView,
            @RequestParam(value = "priceleafreechNonStandarthghtwdth") String valuePriceLeafReechNonStandartHghtWdthFromView,
            @RequestParam(value = "priceleafsot") String valuePriceLeafSotFromView,
            @RequestParam(value = "priceleafsotNonStandartheigth") String valuePriceLeafSotNonStandartHeigthFromView,
            @RequestParam(value = "priceleafsotNonStandartwidth") String valuePriceLeafSotNonStandartWidthFromView,
            @RequestParam(value = "priceleafsotNonStandarthghtwdth") String valuePriceLeafSotNonStandartHghtWdthFromView,
            @RequestParam(value = "pricedoorframe") String valuePriceDoorFrameFromView,
            @RequestParam(value = "pricedoorframeNonStandart") String valuePriceDoorFrameNonStandartFromView,
            @RequestParam(value = "priceassmbl") String valuePriceAssmblFromView,
            @RequestParam(value = "pricehole") String valuePriceHoleFromView,
            @RequestParam(value = "priceinsert") String valuePriceInsertFromView,
            @RequestParam(value = "pricezch201") String valuePriceZch201FromView,
            @RequestParam(value = "pricezv4") String valuePriceZV4FromView,
            @RequestParam(value = "pricepaintgrunt") String valuePricePaintGruntFromView,
            @RequestParam(value = "pricepaintral") String valuePricePaintRAlfromView,
            @RequestParam(value = "pricedoortrim60mm") String valuePriceDoorTrim60mmFromView,
            @RequestParam(value = "pricedoortrim60mmNonStandart") String valuePriceDoorTrim60mmNonStandartFromView,
            @RequestParam(value = "pricedoortrim90mm") String valuePriceDoorTrim90mmFromView,
            @RequestParam(value = "pricedoortrim90mmNonStandart") String valuePriceDoorTrim90mmNonStandartFromView,
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
                Integer.parseInt(valuePriceLeafReechNonStandartHghtWdthFromView),
                Integer.parseInt(valuePriceLeafSotFromView),
                Integer.parseInt(valuePriceLeafSotNonStandartHeigthFromView),
                Integer.parseInt(valuePriceLeafSotNonStandartWidthFromView),
                Integer.parseInt(valuePriceLeafSotNonStandartHghtWdthFromView),
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