package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface GeneralDoorPriceCalculatorInterface {

    long calculateTotalPriceOfDoors(List<DoorPosition> listCurrentCommercialProposal);

}
