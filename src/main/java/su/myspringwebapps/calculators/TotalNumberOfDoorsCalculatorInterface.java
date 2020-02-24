package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface TotalNumberOfDoorsCalculatorInterface {

    long calculateTotalNumberOfDoors(List<DoorPosition> listCurrentCommercialProposal);

}