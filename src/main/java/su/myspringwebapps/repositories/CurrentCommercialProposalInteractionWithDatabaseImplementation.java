package su.myspringwebapps.repositories;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import su.myspringwebapps.points.DoorPosition;
import su.myspringwebapps.points.DoorPositionEntity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CurrentCommercialProposalInteractionWithDatabaseImplementation implements CurrentCommercialProposalInteractionWithDatabase {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/servlet-servlet.xml");
    private static SimpleJdbcTemplate jdbcTemplate = (SimpleJdbcTemplate) context.getBean("jdbcTemplate");
    private static List<DoorPosition> listCurrentCommencialProposal = new ArrayList<>();

    public void savePosition(DoorPosition newPos) {
        this.getListCurrentCommencialProposalFromDB();
        listCurrentCommencialProposal.add(newPos);
        String update = this.faqSQL(newPos);
        jdbcTemplate.update(update);
    }

    public void deletePosition(DoorPosition doorPosition) {
        this.getListCurrentCommencialProposalFromDB();
        listCurrentCommencialProposal.remove(doorPosition);
        DoorPosition bufDoorPos;
        for(int i=0; i<listCurrentCommencialProposal.size(); i++)    {
            bufDoorPos = listCurrentCommencialProposal.get(i);
            bufDoorPos.setId(i);
            listCurrentCommencialProposal.set(i, bufDoorPos);
        }
        String command = "TRUNCATE TABLE comm_prop";
        jdbcTemplate.update(command);
        for(int i=0; i<listCurrentCommencialProposal.size(); i++)    {
            DoorPosition lineToDb = listCurrentCommencialProposal.get(i);
            String updateDb = this.faqSQL(lineToDb);
            jdbcTemplate.update(updateDb);
        }

    }

    public List<DoorPosition> getAllPositions() {
        this.getListCurrentCommencialProposalFromDB();
        return listCurrentCommencialProposal;
    }

    public DoorPosition getPositionById(Integer id) {
        if (id != null) {
            this.getListCurrentCommencialProposalFromDB();
            return listCurrentCommencialProposal.get(id);
        }
        return null;
    }

    private void getListCurrentCommencialProposalFromDB()    {
        listCurrentCommencialProposal.clear();
        String query = "SELECT * FROM comm_prop";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
        Iterator iterator = list.iterator();
        while (iterator.hasNext())  {
            String strBuf = iterator.next().toString();
            String[] params = strBuf.toString().split(", ");
            params[0] = params[0].substring(4,5);
            params[1] = params[1].substring(10,params[1].length());
            params[2] = params[2].substring(11,params[2].length());
            params[3] = params[3].substring(5,params[3].length());
            params[4] = params[4].substring(5,params[4].length());
            params[5] = params[5].substring(9,params[5].length());
            params[6] = params[6].substring(7,params[6].length());
            params[7] = params[7].substring(5,params[7].length());
            params[8] = params[8].substring(5,params[8].length());
            params[9] = params[9].substring(5,params[9].length());
            params[10] = params[10].substring(6,params[10].length());
            params[11] = params[11].substring(4,params[11].length());
            params[12] = params[12].substring(5,params[12].length());
            params[13] = params[13].substring(4,params[13].length());
            params[14] = params[14].substring(11,params[14].length()-1);
            DoorPosition nextPos = new DoorPosition();
            nextPos.setId(Integer.parseInt(params[0]));
            nextPos.setSizeWidth(Short.parseShort(params[1]));
            nextPos.setSizeHeigth(Short.parseShort(params[2]));
            nextPos.setType(params[3]);
            nextPos.setOpen(params[4]);
            nextPos.setDoorStep(params[5]);
            nextPos.setAssmbl(params[6]);
            nextPos.setFill(params[7]);
            nextPos.setHole(params[8]);
            nextPos.setFitt(params[9]);
            nextPos.setPaint(params[10]);
            nextPos.setDoorTrim(params[11]);
            nextPos.setTwoDoorLeafs(params[12]);
            nextPos.setSum(Integer.parseInt(params[13]));
            nextPos.setTotalPrice(Long.parseLong(params[14]));
            listCurrentCommencialProposal.add(nextPos);
        }
    }

    private String faqSQL(DoorPosition doorPosition)  {
        return String.format(
                "INSERT INTO comm_prop VALUES (%s, %s, %s, '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', %s)",
                doorPosition.getId(),
                doorPosition.getSizeWidth(),
                doorPosition.getSizeHeigth(),
                doorPosition.getType(),
                doorPosition.getOpen(),
                doorPosition.getDoorStep(),
                doorPosition.getAssmbl(),
                doorPosition.getFill(),
                doorPosition.getHole(),
                doorPosition.getFitt(),
                doorPosition.getPaint(),
                doorPosition.getDoorTrim(),
                doorPosition.getTwoDoorLeafs(),
                doorPosition.getSum(),
                doorPosition.getTotalPrice()
        );
    }

}