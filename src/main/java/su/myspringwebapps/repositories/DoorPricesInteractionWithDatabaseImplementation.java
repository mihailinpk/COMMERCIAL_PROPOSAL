package su.myspringwebapps.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Service;
import su.myspringwebapps.points.DoorPrice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoorPricesInteractionWithDatabaseImplementation implements DoorPricesInteractionWithDatabase {

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    private static List<DoorPrice> listDoorPrices = new ArrayList<DoorPrice>();

    private void updateDB() {
        String command = "TRUNCATE TABLE door_prices";
        jdbcTemplate.update(command);
        for(int i=0; i<listDoorPrices.size(); i++)  {
            DoorPrice lineToDBp = listDoorPrices.get(i);
            String updateDbP = this.priceSave(lineToDBp);
            jdbcTemplate.update(updateDbP);
        }
    }

    public void saveDoorPrice(DoorPrice newDoorPrice) {
        this.getListDoorPricesFromDB();
        listDoorPrices.add(newDoorPrice);
        String update = this.priceSave(newDoorPrice);
        jdbcTemplate.update(update);
    }

    public void deleteDoorPrice(DoorPrice doorPrice) {
        this.getListDoorPricesFromDB();
        listDoorPrices.remove(doorPrice);
        DoorPrice bufDoorPrice;
        for(int i=0; i<listDoorPrices.size(); i++)    {
            bufDoorPrice = listDoorPrices.get(i);
            bufDoorPrice.setId(i);
            listDoorPrices.set(i, bufDoorPrice);
        }
        this.updateDB();
    }

    public void setDoorPrice(Integer id, DoorPrice doorPrice)    {
        if (id != null) {
            this.getListDoorPricesFromDB();
            listDoorPrices.set(id, doorPrice);
            this.updateDB();
        }
    }

    public List<DoorPrice> getAllDoorPrices() {
        this.getListDoorPricesFromDB();
        return listDoorPrices;
    }

    public DoorPrice getDoorPriceById(Integer id) {
        if (id != null) {
            this.getListDoorPricesFromDB();
            return listDoorPrices.get(id);
        }
        return null;
    }

    private void getListDoorPricesFromDB()  {
        String query = "SELECT * FROM door_prices";
        listDoorPrices = jdbcTemplate.query(
            query,
            new RowMapper<DoorPrice>() {
                @Override
                public DoorPrice mapRow(ResultSet resultSet, int i) throws SQLException {
                    DoorPrice newPrice = new DoorPrice();
                    newPrice.setId(resultSet.getInt(1));
                    newPrice.setPriceLeafReech(resultSet.getInt(2));
                    newPrice.setPriceLeafReechNonStandartHeigth(resultSet.getInt(3));
                    newPrice.setPriceLeafReechNonStandartWidth(resultSet.getInt(4));
                    newPrice.setPriceLeafReechNonStandartHeigthWidth(resultSet.getInt(5));
                    newPrice.setPriceLeafSot(resultSet.getInt(6));
                    newPrice.setPriceLeafSotNonStandartHeigth(resultSet.getInt(7));
                    newPrice.setPriceLeafSotNonStandartWidth(resultSet.getInt(8));
                    newPrice.setPriceLeafSotNonStandartHeigthWidth(resultSet.getInt(9));
                    newPrice.setPriceDoorFrame(resultSet.getInt(10));
                    newPrice.setPriceDoorFrameNonStandart(resultSet.getInt(11));
                    newPrice.setPriceAssmbl(resultSet.getInt(12));
                    newPrice.setPriceHole(resultSet.getInt(13));
                    newPrice.setPriceInsert(resultSet.getInt(14));
                    newPrice.setPriceZch201(resultSet.getInt(15));
                    newPrice.setPriceZV4(resultSet.getInt(16));
                    newPrice.setPricePaintGrunt(resultSet.getInt(17));
                    newPrice.setPricePaintRAl(resultSet.getInt(18));
                    newPrice.setPriceDoorTrim60mm(resultSet.getInt(19));
                    newPrice.setPriceDoorTrim60mmNonStandart(resultSet.getInt(20));
                    newPrice.setPriceDoorTrim90mm(resultSet.getInt(21));
                    newPrice.setPriceDoorTrim90mmNonStandart(resultSet.getInt(22));
                    newPrice.setSurchGenNum10(resultSet.getInt(23));
                    newPrice.setSurchGenNumFr11to20(resultSet.getInt(24));
                    newPrice.setSurchGenNumFr21to50(resultSet.getInt(25));
                    newPrice.setSurchGenNumFr51to100(resultSet.getInt(26));
                    newPrice.setSurchGenNumFr101to1000(resultSet.getInt(27));
                    newPrice.setSurchGenNum1000(resultSet.getInt(28));
                    return newPrice;
                }
            }
        );
    }


    private String priceSave(DoorPrice doorPrice)   {
        return String.format(
                "INSERT INTO door_prices VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)",
                doorPrice.getId(),
                doorPrice.getPriceLeafReech(),
                doorPrice.getPriceLeafReechNonStandartHeigth(),
                doorPrice.getPriceLeafReechNonStandartWidth(),
                doorPrice.getPriceLeafReechNonStandartHeigthWidth(),
                doorPrice.getPriceLeafSot(),
                doorPrice.getPriceLeafSotNonStandartHeigth(),
                doorPrice.getPriceLeafSotNonStandartWidth(),
                doorPrice.getPriceLeafSotNonStandartHeigthWidth(),
                doorPrice.getPriceDoorFrame(),
                doorPrice.getPriceDoorFrameNonStandart(),
                doorPrice.getPriceAssmbl(),
                doorPrice.getPriceHole(),
                doorPrice.getPriceInsert(),
                doorPrice.getPriceZch201(),
                doorPrice.getPriceZV4(),
                doorPrice.getPricePaintGrunt(),
                doorPrice.getPricePaintRAl(),
                doorPrice.getPriceDoorTrim60mm(),
                doorPrice.getPriceDoorTrim60mmNonStandart(),
                doorPrice.getPriceDoorTrim90mm(),
                doorPrice.getPriceDoorTrim90mmNonStandart(),
                doorPrice.getSurchGenNum10(),
                doorPrice.getSurchGenNumFr11to20(),
                doorPrice.getSurchGenNumFr21to50(),
                doorPrice.getSurchGenNumFr51to100(),
                doorPrice.getSurchGenNumFr101to1000(),
                doorPrice.getSurchGenNum1000()
        );
    }

}