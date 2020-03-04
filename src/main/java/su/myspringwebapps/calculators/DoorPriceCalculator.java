package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPrice;

public interface DoorPriceCalculator {

    long calculatePrice(DoorPosition currentDoorPosition, DoorPrice currentDoorPrice, Long totalNumberOfDoors);

}