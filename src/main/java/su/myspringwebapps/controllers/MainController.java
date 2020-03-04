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
            @RequestParam(value = "width") String strWidth,
            @RequestParam(value = "height") String strHeight,
            @RequestParam(value = "type") String strType,
            @RequestParam(value = "open") String strOpen,
            @RequestParam(value = "doorstep") String strDoorstep,
            @RequestParam(value = "assembl") String strAssembl,
            @RequestParam(value = "fill") String strFill,
            @RequestParam(value = "hole") String strHole,
            @RequestParam(value = "fitt") String strFitt,
            @RequestParam(value = "paint") String strPaint,
            @RequestParam(value = "doortrim") String strDoorTrim,
            @RequestParam(value = "twodoorleafs") String strTwoDoorLeafs,
            @RequestParam(value = "sumpos") String strSumPosition
    )   {

        Short sizeWidth = Short.parseShort(strWidth);
        Short sizeHeigth = Short.parseShort(strHeight);

        String type = Type.valueOf(strType).getType();

        String open = ((strOpen.equals("opt1")) ? "правое" : "левое");

        String doorStep = ((strDoorstep.equals("opt1")) ? "есть" : "нет");

        String assmbl = ((strAssembl.equals("opt1")) ? "есть" : "нет");

        String fill = ((strFill.equals("opt1")) ? "сотовое" : "реечное");

        String hole = ((strHole.equals("opt1")) ? "нет" : "есть");

        String fitt = Mortise.valueOf(strFitt).getMortise();

        String paint = Paint.valueOf(strPaint).getPaint();

        String doorTrim = DoorTrim.valueOf(strDoorTrim).getDoorTrim();

        String twoDoorLeafs = TwoDoorLeafs.valueOf(strTwoDoorLeafs).getTwoDoorLeafs();

        Integer sum = Integer.parseInt(strSumPosition);

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
        model.addAttribute("priceLeafReechNstHeigth", doorPrice.getPriceLeafReechNstHeigth());
        model.addAttribute("priceLeafReechNstWidth", doorPrice.getPriceLeafReechNstWidth());
        model.addAttribute("priceLeafReechNstHghtWdth", doorPrice.getPriceLeafReechNstHghtWdth());
        model.addAttribute("priceLeafSot", doorPrice.getPriceLeafSot());
        model.addAttribute("priceLeafSotNstHeigth", doorPrice.getPriceLeafSotNstHeigth());
        model.addAttribute("priceLeafSotNstWidth", doorPrice.getPriceLeafSotNstWidth());
        model.addAttribute("priceLeafSotNstHghtWdth", doorPrice.getPriceLeafSotNstHghtWdth());
        model.addAttribute("priceDoorFrame", doorPrice.getPriceDoorFrame());
        model.addAttribute("priceDoorFrameNst", doorPrice.getPriceDoorFrameNst());
        model.addAttribute("priceAssmbl", doorPrice.getPriceAssmbl());
        model.addAttribute("priceHole", doorPrice.getPriceHole());
        model.addAttribute("priceInsert", doorPrice.getPriceInsert());
        model.addAttribute("priceZch201", doorPrice.getPriceZch201());
        model.addAttribute("priceZV4", doorPrice.getPriceZV4());
        model.addAttribute("pricePaintGrunt", doorPrice.getPricePaintGrunt());
        model.addAttribute("pricePaintRAl", doorPrice.getPricePaintRAl());
        model.addAttribute("priceDoorTrim60mm", doorPrice.getPriceDoorTrim60mm());
        model.addAttribute("priceDoorTrim60mmNst", doorPrice.getPriceDoorTrim60mmNst());
        model.addAttribute("priceDoorTrim90mm", doorPrice.getPriceDoorTrim90mm());
        model.addAttribute("priceDoorTrim90mmNst", doorPrice.getPriceDoorTrim90mmNst());
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
            @RequestParam(value = "priceleafreech") String strPriceLeafReech,
            @RequestParam(value = "priceleafreechnstheigth") String strPriceLeafReechNstHeigth,
            @RequestParam(value = "priceleafreechnstwidth") String strPriceLeafReechNstWidth,
            @RequestParam(value = "priceleafreechnsthghtwdth") String strPriceLeafReechNstHghtWdth,
            @RequestParam(value = "priceleafsot") String strPriceLeafSot,
            @RequestParam(value = "priceleafsotnstheigth") String strPriceLeafSotNstHeigth,
            @RequestParam(value = "priceleafsotnstwidth") String strPriceLeafSotNstWidth,
            @RequestParam(value = "priceleafsotnsthghtwdth") String strPriceLeafSotNstHghtWdth,
            @RequestParam(value = "pricedoorframe") String strPriceDoorFrame,
            @RequestParam(value = "pricedoorframenst") String strPriceDoorFrameNst,
            @RequestParam(value = "priceassmbl") String strPriceAssmbl,
            @RequestParam(value = "pricehole") String strPriceHole,
            @RequestParam(value = "priceinsert") String strPriceInsert,
            @RequestParam(value = "pricezch201") String strPriceZch201,
            @RequestParam(value = "pricezv4") String strPriceZV4,
            @RequestParam(value = "pricepaintgrunt") String strPricePaintGrunt,
            @RequestParam(value = "pricepaintral") String strPricePaintRAl,
            @RequestParam(value = "pricedoortrim60mm") String strPriceDoorTrim60mm,
            @RequestParam(value = "pricedoortrim60mmnst") String strPriceDoorTrim60mmNst,
            @RequestParam(value = "pricedoortrim90mm") String strPriceDoorTrim90mm,
            @RequestParam(value = "pricedoortrim90mmnst") String strPriceDoorTrim90mmNst,
            @RequestParam(value = "surchgennum10") String strSurchGenNum10,
            @RequestParam(value = "surchgennumfr11to20") String strSurchGenNumFr11to20,
            @RequestParam(value = "surchgennumfr21to50") String strSurchGenNumFr21to50,
            @RequestParam(value = "surchgennumfr51to100") String strSurchGenNumFr51to100,
            @RequestParam(value = "surchgennumgr101to1000") String strSurchGenNumFr101to1000,
            @RequestParam(value = "surchgennum1000") String strSurchGenNum1000
    ) {
        mainService.setDoorPrice(
                0,
                Integer.parseInt(strPriceLeafReech),
                Integer.parseInt(strPriceLeafReechNstHeigth),
                Integer.parseInt(strPriceLeafReechNstWidth),
                Integer.parseInt(strPriceLeafReechNstHghtWdth),
                Integer.parseInt(strPriceLeafSot),
                Integer.parseInt(strPriceLeafSotNstHeigth),
                Integer.parseInt(strPriceLeafSotNstWidth),
                Integer.parseInt(strPriceLeafSotNstHghtWdth),
                Integer.parseInt(strPriceDoorFrame),
                Integer.parseInt(strPriceDoorFrameNst),
                Integer.parseInt(strPriceAssmbl),
                Integer.parseInt(strPriceHole),
                Integer.parseInt(strPriceInsert),
                Integer.parseInt(strPriceZch201),
                Integer.parseInt(strPriceZV4),
                Integer.parseInt(strPricePaintGrunt),
                Integer.parseInt(strPricePaintRAl),
                Integer.parseInt(strPriceDoorTrim60mm),
                Integer.parseInt(strPriceDoorTrim60mmNst),
                Integer.parseInt(strPriceDoorTrim90mm),
                Integer.parseInt(strPriceDoorTrim90mmNst),
                Integer.parseInt(strSurchGenNum10),
                Integer.parseInt(strSurchGenNumFr11to20),
                Integer.parseInt(strSurchGenNumFr21to50),
                Integer.parseInt(strSurchGenNumFr51to100),
                Integer.parseInt(strSurchGenNumFr101to1000),
                Integer.parseInt(strSurchGenNum1000)
        );
        return "redirect:/settings";
    }

}