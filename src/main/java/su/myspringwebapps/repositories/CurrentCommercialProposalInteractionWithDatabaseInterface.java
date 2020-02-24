package su.myspringwebapps.repositories;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface CurrentCommercialProposalInteractionWithDatabaseInterface {

    void savePosition(DoorPosition newPos);

    void deletePosition(DoorPosition doorPosition);

    List<DoorPosition> getAllPositions();

    DoorPosition getPositionById(Integer id);

}