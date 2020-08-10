package su.myspringwebapps.sevices;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.myspringwebapps.calculators.DoorPriceCalculator;
import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPositionView;
import su.myspringwebapps.points.DoorPrice;
import su.myspringwebapps.points.DoorPriceView;
import su.myspringwebapps.repositories.DoorPricesRepository;

import java.util.List;

@Service
public class DoorsService implements IDoorsService {

    @Autowired
    private DoorPricesRepository doorPricesRepository;
    @Autowired
    private DoorPriceCalculator doorPriceCalculator;

    public List<DoorPosition> saveNewDoorPosition(DoorPositionView newDoorPositionView, List<DoorPosition> currentListDoors) {

        newDoorPositionView.setTotalPrice(
                doorPriceCalculator.calculatePrice(newDoorPositionView,
                        getDoorPriceById(0),
                        getTotalNumberOfDoors(currentListDoors))
        );

        List<DoorPosition> tempListDoors = currentListDoors;
        DoorPosition doorPosition;
        if (!tempListDoors.isEmpty())   {
            doorPosition = tempListDoors.get(tempListDoors.size() - 1);
            newDoorPositionView.setId(doorPosition.getId() + 1);
            currentListDoors.add(newDoorPositionView);
        }
        else    {
            newDoorPositionView.setId(0);
            currentListDoors.add(newDoorPositionView);
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

    public void setDoorPrice(Integer id, DoorPriceView newDoorPrice) {
        doorPricesRepository.setDoorPrice(id, newDoorPrice);
    }

    public String getDefaultDoorPriceJson() throws JsonProcessingException {
        return convertDoorPriceToJson(getDefaultDoorPrice());
    }

    public String getDoorPriceByIdJson(Integer id)  throws JsonProcessingException {
        if (id != null) {
            return convertDoorPriceToJson(getDoorPriceById(id));
        }
        return null;
    }

    public DoorPrice getDefaultDoorPrice()  {
        return doorPricesRepository.getDoorPriceById(0);
    }

    public DoorPrice getDoorPriceById(Integer id)   {
        if (id != null) {
            return doorPricesRepository.getDoorPriceById(id);
        }
        return null;
    }

    public long getTotalNumberOfDoors(List<DoorPosition> currentListDoors) {
        return doorPriceCalculator.calculateTotalNumberOfDoors(currentListDoors);
    }

    public long getGeneralDoorPrice(List<DoorPosition> currentListDoors) {
        return doorPriceCalculator.calculateTotalPriceOfDoors(currentListDoors);
    }

    private String convertDoorPriceToJson(DoorPrice doorPrice)throws JsonProcessingException {
        return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(doorPrice);
    }

}