package su.myspringwebapps.sevices;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface MainServiceInterface {

    List<DoorPosition> saveNewDoorPosition(DoorPosition newDoorPosition, List<DoorPosition> currentListDoors);

    List<DoorPosition> deleteDoorPosition(DoorPosition doorPosition, List<DoorPosition> currentListDoors);

    DoorPosition getDoorPositionById(Integer id, List<DoorPosition> currentListDoors);

    long getTotalNumberOfDoors(List<DoorPosition> currentListDoors);

    long getGeneralDoorPrice(List<DoorPosition> currentListDoors);

}