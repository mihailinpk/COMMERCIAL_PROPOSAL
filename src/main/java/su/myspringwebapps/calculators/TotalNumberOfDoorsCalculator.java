package su.myspringwebapps.calculators;

import su.myspringwebapps.points.DoorPosition;
import java.util.Iterator;
import java.util.List;

public class TotalNumberOfDoorsCalculator implements TotalNumberOfDoorsCalculatorInterface {

    public long calculateTotalNumberOfDoors(List<DoorPosition> listCurrentCommercialProposal) {

        long sum=0;

        Iterator iterator = listCurrentCommercialProposal.iterator();

        while (iterator.hasNext())  {

            DoorPosition doorPosition = (DoorPosition)iterator.next();
            sum += doorPosition.getSum();

        }

        return sum;

    }

}