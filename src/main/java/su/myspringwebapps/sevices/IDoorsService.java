package su.myspringwebapps.sevices;

import com.fasterxml.jackson.core.JsonProcessingException;
import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;

import java.util.List;

public interface IDoorsService {

    List<DoorPosition> saveNewDoorPosition(String jsonDoorPosition, List<DoorPosition> currentListDoors) throws JsonProcessingException;

    List<DoorPosition> deleteDoorPosition(Integer id, List<DoorPosition> currentListDoors);

    DoorPosition getDoorPositionById(Integer id, List<DoorPosition> currentListDoors);

    void setDoorPrice(Integer id, String jsonDoorPrice) throws JsonProcessingException;

    String getDefaultDoorPriceJson() throws JsonProcessingException;

    String getDoorPriceByIdJson(Integer id) throws JsonProcessingException;

    DoorPrice getDefaultDoorPrice();

    DoorPrice getDoorPriceById(Integer id);

    long getTotalNumberOfDoors(List<DoorPosition> currentListDoors);

    long getGeneralDoorPrice(List<DoorPosition> currentListDoors);

}