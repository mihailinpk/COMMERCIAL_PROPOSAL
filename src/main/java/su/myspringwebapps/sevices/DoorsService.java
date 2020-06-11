package su.myspringwebapps.sevices;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.myspringwebapps.calculators.DoorPriceCalculator;
import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPositionEntity;
import su.myspringwebapps.points.DoorPrice;
import su.myspringwebapps.repositories.DoorPricesRepository;

import java.util.List;

@Service
public class DoorsService implements IDoorsService {

    @Autowired
    private DoorPricesRepository doorPricesInteractionWithDatabase;
    @Autowired
    private DoorPriceCalculator doorPriceCalculator;

    public List<DoorPosition> saveNewDoorPosition(String jsonDoorPosition, List<DoorPosition> currentListDoors) throws JsonProcessingException {

        DoorPositionEntity newDoorPositionEntity = new DoorPositionEntity().fromModel(jsonDoorPosition);

        newDoorPositionEntity.setTotalPrice(
            doorPriceCalculator.calculatePrice(newDoorPositionEntity,
                getDoorPriceById(0),
                getTotalNumberOfDoors(currentListDoors))
        );

        List<DoorPosition> tempListDoors = currentListDoors;
        DoorPosition doorPosition;
        if (!tempListDoors.isEmpty())   {
            doorPosition = tempListDoors.get(tempListDoors.size() - 1);
            newDoorPositionEntity.setId(doorPosition.getId() + 1);
            currentListDoors.add(newDoorPositionEntity);
        }
        else    {
            newDoorPositionEntity.setId(0);
            currentListDoors.add(newDoorPositionEntity);
        }
        return currentListDoors;
    }

    public List<DoorPosition> deleteDoorPosition(Integer id, List<DoorPosition> currentListDoors) {

        DoorPosition doorPosition = getDoorPositionById(id, currentListDoors);
        if (doorPosition != null) {
            currentListDoors.remove(doorPosition);
            DoorPosition bufDoorPos;
            for (int i = 0; i < currentListDoors.size(); i++) {
                bufDoorPos = currentListDoors.get(i);
                bufDoorPos.setId(i);
                currentListDoors.set(i, bufDoorPos);
            }
        }
        return currentListDoors;
    }

    public DoorPosition getDoorPositionById(Integer id, List<DoorPosition> currentListDoors) {
        if (id != null) {
            return currentListDoors.get(id);
        }
        return null;
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

    public DoorPrice getDefaultDoorPrice()  {
        return doorPricesInteractionWithDatabase.getDoorPriceById(0);
    }

    public DoorPrice getDoorPriceById(Integer id)   {
        if (id != null) {
            return doorPricesInteractionWithDatabase.getDoorPriceById(id);
        }
        return null;
    }

    public long getTotalNumberOfDoors(List<DoorPosition> currentListDoors) {
        return doorPriceCalculator.calculateTotalNumberOfDoors(currentListDoors);
    }

    public long getGeneralDoorPrice(List<DoorPosition> currentListDoors) {
        return doorPriceCalculator.calculateTotalPriceOfDoors(currentListDoors);
    }
}