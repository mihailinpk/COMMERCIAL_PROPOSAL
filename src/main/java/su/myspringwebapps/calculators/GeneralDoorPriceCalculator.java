package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import java.util.List;

public interface GeneralDoorPriceCalculator {

    long calculateTotalPriceOfDoors(List<DoorPosition> listCurrentCommercialProposal);

}
