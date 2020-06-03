package su.myspringwebapps.sevices;

import su.myspringwebapps.calculators.GeneralDoorPriceCalculatorImplementation;
import su.myspringwebapps.calculators.TotalNumberOfDoorsCalculatorImplementation;
import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;
import su.myspringwebapps.repositories.DoorPricesInteractionWithDatabaseImplementation;

import java.util.ArrayList;
import java.util.List;

public class MainService implements MainServiceInterface {

    private GeneralDoorPriceCalculatorImplementation generalDoorPriceCalculatorImplementation;
    private TotalNumberOfDoorsCalculatorImplementation totalNumberOfDoorsCalculatorImplementation;
    private DoorPricesInteractionWithDatabaseImplementation doorPricesInteractionWithDatabaseImplementation;

    private static List<DoorPosition> listCurrentCommencialProposal = new ArrayList<>();

    public MainService(
        GeneralDoorPriceCalculatorImplementation calculatorGeneralDoorPrice,
        TotalNumberOfDoorsCalculatorImplementation calculatorTotalNumberOfDoors,
        DoorPricesInteractionWithDatabaseImplementation doorPricesInteractionWithDatabaseImplementation
    ) {
        this.generalDoorPriceCalculatorImplementation = calculatorGeneralDoorPrice;
        this.totalNumberOfDoorsCalculatorImplementation = calculatorTotalNumberOfDoors;
        this.doorPricesInteractionWithDatabaseImplementation = doorPricesInteractionWithDatabaseImplementation;
    }

    public void setAllDoors(List<DoorPosition> listCurrentCommencialProposal) {
        this.listCurrentCommencialProposal = listCurrentCommencialProposal;
    }

    public void saveNewDoorPosition(DoorPosition newDoorPosition) {
        List<DoorPosition> listDoors = listCurrentCommencialProposal;
        DoorPosition doorPosition;
        if (!listDoors.isEmpty())   {
            doorPosition = listDoors.get(listDoors.size() - 1);
            newDoorPosition.setId(doorPosition.getId() + 1);
            listCurrentCommencialProposal.add(newDoorPosition);
        }
        else    {
            newDoorPosition.setId(0);
            listCurrentCommencialProposal.add(newDoorPosition);
        }
    }

    public void deleteDoorPosition(DoorPosition doorPosition) {
        if (doorPosition != null) {
            listCurrentCommencialProposal.remove(doorPosition);
            DoorPosition bufDoorPos;
            for (int i = 0; i < listCurrentCommencialProposal.size(); i++) {
                bufDoorPos = listCurrentCommencialProposal.get(i);
                bufDoorPos.setId(i);
                listCurrentCommencialProposal.set(i, bufDoorPos);
            }
        }
    }

    public DoorPosition getDoorPositionById(Integer id) {
        if (id != null) {
            return listCurrentCommencialProposal.get(id);
        }
        return null;
    }

    public List<DoorPosition> getAllDoors() {
        return listCurrentCommencialProposal;
    }

    public void setDoorPrice(
        Integer id,
        Integer priceLeafReech,
        Integer priceLeafReechNonStandartHeigth,
        Integer priceLeafReechNonStandartWidth,
        Integer priceLeafReechNonStandartHeigthWidth,
        Integer priceLeafSot,
        Integer priceLeafSotNonStandartHeigth,
        Integer priceLeafSotNonStandartWidth,
        Integer priceLeafSotNonStandartHeigthWidth,
        Integer priceDoorFrame,
        Integer priceDoorFrameNonStandart,
        Integer priceAssmbl,
        Integer priceHole,
        Integer priceInsert,
        Integer priceZch201,
        Integer priceZV4,
        Integer pricePaintGrunt,
        Integer pricePaintRAl,
        Integer priceDoorTrim60mm,
        Integer priceDoorTrim60mmNonStandart,
        Integer priceDoorTrim90mm,
        Integer priceDoorTrim90mmNonStandart,
        Integer surchGenNum10,
        Integer surchGenNumFr11to20,
        Integer surchGenNumFr21to50,
        Integer surchGenNumFr51to100,
        Integer surchGenNumFr101to1000,
        Integer surchGenNum1000
    )   {
        DoorPrice doorPrice = new DoorPrice();
        doorPrice.setId(id);
        doorPrice.setPriceLeafReech(priceLeafReech);
        doorPrice.setPriceLeafReechNonStandartHeigth(priceLeafReechNonStandartHeigth);
        doorPrice.setPriceLeafReechNonStandartWidth(priceLeafReechNonStandartWidth);
        doorPrice.setPriceLeafReechNonStandartHeigthWidth(priceLeafReechNonStandartHeigthWidth);
        doorPrice.setPriceLeafSot(priceLeafSot);
        doorPrice.setPriceLeafSotNonStandartHeigth(priceLeafSotNonStandartHeigth);
        doorPrice.setPriceLeafSotNonStandartWidth(priceLeafSotNonStandartWidth);
        doorPrice.setPriceLeafSotNonStandartHeigthWidth(priceLeafSotNonStandartHeigthWidth);
        doorPrice.setPriceDoorFrame(priceDoorFrame);
        doorPrice.setPriceDoorFrameNonStandart(priceDoorFrameNonStandart);
        doorPrice.setPriceAssmbl(priceAssmbl);
        doorPrice.setPriceHole(priceHole);
        doorPrice.setPriceInsert(priceInsert);
        doorPrice.setPriceZch201(priceZch201);
        doorPrice.setPriceZV4(priceZV4);
        doorPrice.setPricePaintGrunt(pricePaintGrunt);
        doorPrice.setPricePaintRAl(pricePaintRAl);
        doorPrice.setPriceDoorTrim60mm(priceDoorTrim60mm);
        doorPrice.setPriceDoorTrim60mmNonStandart(priceDoorTrim60mmNonStandart);
        doorPrice.setPriceDoorTrim90mm(priceDoorTrim90mm);
        doorPrice.setPriceDoorTrim90mmNonStandart(priceDoorTrim90mmNonStandart);
        doorPrice.setSurchGenNum10(surchGenNum10);
        doorPrice.setSurchGenNumFr11to20(surchGenNumFr11to20);
        doorPrice.setSurchGenNumFr21to50(surchGenNumFr21to50);
        doorPrice.setSurchGenNumFr51to100(surchGenNumFr51to100);
        doorPrice.setSurchGenNumFr101to1000(surchGenNumFr101to1000);
        doorPrice.setSurchGenNum1000(surchGenNum1000);
        doorPricesInteractionWithDatabaseImplementation.setDoorPrice(id, doorPrice);
    }

    public DoorPrice getDefaultDoorPrice()  {
        return doorPricesInteractionWithDatabaseImplementation.getDoorPriceById(0);
    }

    public DoorPrice getDoorPriceById(Integer id)   {
        if (id != null) {
            return doorPricesInteractionWithDatabaseImplementation.getDoorPriceById(id);
        }
        return null;
    }

    public long getTotalNumberOfDoors() {
        return totalNumberOfDoorsCalculatorImplementation.calculateTotalNumberOfDoors(this.getAllDoors());
    }

    public long getGeneralDoorPrice() {
        return generalDoorPriceCalculatorImplementation.calculateTotalPriceOfDoors(this.getAllDoors());
    }
}