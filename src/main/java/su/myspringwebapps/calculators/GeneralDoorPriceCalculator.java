package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import java.util.Iterator;
import java.util.List;

public class GeneralDoorPriceCalculator implements GeneralDoorPriceCalculatorInterface {

    public long calculateTotalPriceOfDoors(List<DoorPosition> listCurrentCommercialProposal) {

        long totalPrice = 0;

        Iterator iterator = listCurrentCommercialProposal.iterator();

        while(iterator.hasNext())   {

            DoorPosition doorPosition = (DoorPosition) iterator.next();
            totalPrice += doorPosition.getTotalPrice();

        }

        return totalPrice;

    }

}