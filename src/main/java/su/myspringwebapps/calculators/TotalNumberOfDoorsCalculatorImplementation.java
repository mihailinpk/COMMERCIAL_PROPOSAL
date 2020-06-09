package su.myspringwebapps.calculators;

import org.springframework.stereotype.Service;
import su.myspringwebapps.points.DoorPosition;
import java.util.Iterator;
import java.util.List;

@Service
public class TotalNumberOfDoorsCalculatorImplementation implements TotalNumberOfDoorsCalculator {

    public long calculateTotalNumberOfDoors(List<DoorPosition> currentCommercialProposalList) {

        long sum=0;

        Iterator iterator = currentCommercialProposalList.iterator();

        while (iterator.hasNext())  {

            DoorPosition doorPosition = (DoorPosition)iterator.next();
            sum += doorPosition.getSum();

        }

        return sum;

    }

}