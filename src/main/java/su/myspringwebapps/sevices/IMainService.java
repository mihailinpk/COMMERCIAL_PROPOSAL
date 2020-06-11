package su.myspringwebapps.sevices;

import com.fasterxml.jackson.core.JsonProcessingException;
import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface IMainService {

    List<DoorPosition> saveNewDoorPosition(String jsonDoorPosition, List<DoorPosition> currentListDoors) throws JsonProcessingException;

    List<DoorPosition> deleteDoorPosition(Integer id, List<DoorPosition> currentListDoors);

    DoorPosition getDoorPositionById(Integer id, List<DoorPosition> currentListDoors);

    long getTotalNumberOfDoors(List<DoorPosition> currentListDoors);

    long getGeneralDoorPrice(List<DoorPosition> currentListDoors);

}