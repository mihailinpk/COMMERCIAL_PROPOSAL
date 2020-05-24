package su.myspringwebapps.repositories;

import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPositionEntity;

import java.util.List;

public interface CurrentCommercialProposalInteractionWithDatabase {

    void savePosition(DoorPosition newPos);

    void deletePosition(DoorPosition doorPosition);

    List<DoorPosition> getAllPositions();

    DoorPosition getPositionById(Integer id);

}