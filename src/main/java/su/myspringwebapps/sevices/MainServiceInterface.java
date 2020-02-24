package su.myspringwebapps.sevices;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface MainServiceInterface {

    void saveNewDoorPosition(
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
    );

    void deleteDoorPosition(DoorPosition doorPosition);

    DoorPosition getDoorPositionById(Integer id);

    List<DoorPosition> getAllDoors();

    long getTotalNumberOfDoors();

    long getGeneralDoorPrice();

}