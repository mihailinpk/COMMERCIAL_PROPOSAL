package su.myspringwebapps.sevices;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface MainServiceInterface {

    void saveNewDoorPosition(DoorPosition newDoorPosition);

    void deleteDoorPosition(DoorPosition doorPosition);

    DoorPosition getDoorPositionById(Integer id);

    List<DoorPosition> getAllDoors();

    long getTotalNumberOfDoors();

    long getGeneralDoorPrice();

}