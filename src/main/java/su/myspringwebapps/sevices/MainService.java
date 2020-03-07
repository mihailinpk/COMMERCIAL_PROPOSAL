package su.myspringwebapps.sevices;

import su.myspringwebapps.calculators.DoorPriceCalculatorImplementation;
import su.myspringwebapps.calculators.GeneralDoorPriceCalculatorImplementation;
import su.myspringwebapps.calculators.TotalNumberOfDoorsCalculatorImplementation;
import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;
import su.myspringwebapps.repositories.CurrentCommercialProposalInteractionWithDatabase;
import su.myspringwebapps.repositories.DoorPricesInteractionWithDatabase;

import java.util.List;

public class MainService implements MainServiceInterface {

    private DoorPriceCalculatorImplementation doorPriceCalculatorImplementation;
    private GeneralDoorPriceCalculatorImplementation generalDoorPriceCalculatorImplementation;
    private TotalNumberOfDoorsCalculatorImplementation totalNumberOfDoorsCalculatorImplementation;
    private DoorPricesInteractionWithDatabase doorPricesInteractionWithDatabase;
    private CurrentCommercialProposalInteractionWithDatabase currentCommercialProposalInteractionWithDatabase;

    public MainService(
        DoorPriceCalculatorImplementation calculatorDoorPrice,
        GeneralDoorPriceCalculatorImplementation calculatorGeneralDoorPrice,
        TotalNumberOfDoorsCalculatorImplementation calculatorTotalNumberOfDoors,
        DoorPricesInteractionWithDatabase doorPricesInteractionWithDatabase,
        CurrentCommercialProposalInteractionWithDatabase currentCommercialProposalInteractionWithDatabase
    ) {
        this.doorPriceCalculatorImplementation = calculatorDoorPrice;
        this.generalDoorPriceCalculatorImplementation = calculatorGeneralDoorPrice;
        this.totalNumberOfDoorsCalculatorImplementation = calculatorTotalNumberOfDoors;
        this.doorPricesInteractionWithDatabase = doorPricesInteractionWithDatabase;
        this.currentCommercialProposalInteractionWithDatabase = currentCommercialProposalInteractionWithDatabase;
    }

    public void saveNewDoorPosition(
        Short sizeWidth,
        Short sizeHeigth,
        String type,
        String open,
        String doorStep,
        String assmbl,
        String fill,
        String hole,
        String fitt,
        String paint,
        String doorTrim,
        String twoDoorLeafs,
        Integer sum
    ) {
        DoorPosition newDoorPosition = new DoorPosition();
        newDoorPosition.setSizeWidth(sizeWidth);
        newDoorPosition.setSizeHeigth(sizeHeigth);
        newDoorPosition.setType(type);
        newDoorPosition.setOpen(open);
        newDoorPosition.setDoorStep(doorStep);
        newDoorPosition.setAssmbl(assmbl);
        newDoorPosition.setFill(fill);
        newDoorPosition.setHole(hole);
        newDoorPosition.setFitt(fitt);
        newDoorPosition.setPaint(paint);
        newDoorPosition.setDoorTrim(doorTrim);
        newDoorPosition.setTwoDoorLeafs(twoDoorLeafs);
        newDoorPosition.setSum(sum);
        newDoorPosition.setTotalPrice(
            doorPriceCalculatorImplementation.calculatePrice(newDoorPosition, doorPricesInteractionWithDatabase.getDoorPriceById(0), this.getTotalNumberOfDoors())
        );
        List<DoorPosition> listDoors = currentCommercialProposalInteractionWithDatabase.getAllPositions();
        DoorPosition doorPosition;
        if (!listDoors.isEmpty())   {
            doorPosition = listDoors.get(listDoors.size() - 1);
            newDoorPosition.setId(doorPosition.getId() + 1);
            currentCommercialProposalInteractionWithDatabase.savePosition(newDoorPosition);
        }
        else    {
            newDoorPosition.setId(0);
            currentCommercialProposalInteractionWithDatabase.savePosition(newDoorPosition);
        }
    }

    public void deleteDoorPosition(DoorPosition doorPosition) {
        if (doorPosition != null)
            currentCommercialProposalInteractionWithDatabase.deletePosition(doorPosition);
    }

    public DoorPosition getDoorPositionById(Integer id) {
        if (id != null) {
            return  currentCommercialProposalInteractionWithDatabase.getPositionById(id);
        }
        return null;
    }

    public List<DoorPosition> getAllDoors() {
        return currentCommercialProposalInteractionWithDatabase.getAllPositions();
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
        doorPricesInteractionWithDatabase.setDoorPrice(id, doorPrice);
    }

    public DoorPrice getDoorPriceById(Integer id)   {
        if (id != null) {
            return doorPricesInteractionWithDatabase.getDoorPriceById(id);
        }
        return null;
    }

    public long getTotalNumberOfDoors() {
        return totalNumberOfDoorsCalculatorImplementation.calculateTotalNumberOfDoors(currentCommercialProposalInteractionWithDatabase.getAllPositions());
    }

    public long getGeneralDoorPrice() {
        return generalDoorPriceCalculatorImplementation.calculateTotalPriceOfDoors(currentCommercialProposalInteractionWithDatabase.getAllPositions());
    }
}