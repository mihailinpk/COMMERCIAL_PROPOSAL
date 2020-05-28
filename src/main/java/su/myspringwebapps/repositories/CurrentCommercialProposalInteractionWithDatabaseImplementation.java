package su.myspringwebapps.repositories;

import su.myspringwebapps.points.DoorPosition;

import java.util.ArrayList;
import java.util.List;

public class CurrentCommercialProposalInteractionWithDatabaseImplementation implements CurrentCommercialProposalInteractionWithDatabase {

    private static List<DoorPosition> listCurrentCommencialProposal = new ArrayList<>();

    public void savePosition(DoorPosition newPos) {
        listCurrentCommencialProposal.add(newPos);

    }

    public void deletePosition(DoorPosition doorPosition) {
        listCurrentCommencialProposal.remove(doorPosition);
        DoorPosition bufDoorPos;
        for(int i=0; i<listCurrentCommencialProposal.size(); i++)    {
            bufDoorPos = listCurrentCommencialProposal.get(i);
            bufDoorPos.setId(i);
            listCurrentCommencialProposal.set(i, bufDoorPos);
        }

    }

    public List<DoorPosition> getAllPositions() {
        return listCurrentCommencialProposal;
    }

    public DoorPosition getPositionById(Integer id) {
        if (id != null) {
            return listCurrentCommencialProposal.get(id);
        }
        return null;
    }

}