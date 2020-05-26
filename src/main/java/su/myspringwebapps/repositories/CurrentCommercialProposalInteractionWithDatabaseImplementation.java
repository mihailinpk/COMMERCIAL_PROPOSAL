package su.myspringwebapps.repositories;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import su.myspringwebapps.points.DoorPosition;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

        String query = "SELECT * FROM comm_prop";

        listCurrentCommencialProposal = jdbcTemplate.query(
            query,
            new RowMapper<DoorPosition>() {
                public DoorPosition mapRow(ResultSet rs, int rowNum) throws SQLException {
                    DoorPosition newPos = new DoorPosition();
                    newPos.setId(rs.getInt(1));
                    newPos.setSizeWidth(rs.getShort(2));
                    newPos.setSizeHeigth(rs.getShort(3));
                    newPos.setType(rs.getString(4));
                    newPos.setOpen(rs.getString(5));
                    newPos.setDoorStep(rs.getString(6));
                    newPos.setAssmbl(rs.getString(7));
                    newPos.setFill(rs.getString(8));
                    newPos.setHole(rs.getString(9));
                    newPos.setFitt(rs.getString(10));
                    newPos.setPaint(rs.getString(11));
                    newPos.setDoorTrim(rs.getString(12));
                    newPos.setTwoDoorLeafs(rs.getString(13));
                    newPos.setSum(rs.getInt(14));
                    newPos.setTotalPrice(rs.getLong(15));
                    return newPos;
                }
            });

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