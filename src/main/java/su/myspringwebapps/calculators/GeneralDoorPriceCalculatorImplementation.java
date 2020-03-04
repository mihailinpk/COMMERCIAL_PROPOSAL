package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import java.util.Iterator;
import java.util.List;

public class GeneralDoorPriceCalculatorImplementation implements GeneralDoorPriceCalculator {

    public long calculateTotalPriceOfDoors(List<DoorPosition> currentCommercialProposalList) {

        long totalPrice = 0;

        Iterator iterator = currentCommercialProposalList.iterator();

        while(iterator.hasNext())   {

            DoorPosition doorPosition = (DoorPosition) iterator.next();
            totalPrice += doorPosition.getTotalPrice();

        }

        return totalPrice;

    }

}