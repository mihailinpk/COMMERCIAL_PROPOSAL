package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface TotalNumberOfDoorsCalculator {

    long calculateTotalNumberOfDoors(List<DoorPosition> currentCommercialProposalList);

}