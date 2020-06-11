package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;

import java.util.List;

public interface IDoorPriceCalculator {

    long calculatePrice(DoorPosition currentDoorPosition, DoorPrice currentDoorPrice, Long totalNumberOfDoors);

    long calculateTotalPriceOfDoors(List<DoorPosition> listCurrentCommercialProposal);

    long calculateTotalNumberOfDoors(List<DoorPosition> currentCommercialProposalList);

}