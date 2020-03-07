package su.myspringwebapps.repositories;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import su.myspringwebapps.points.DoorPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DoorPricesInteractionWithDatabase implements DoorPricesInteractionWithDatabaseInterface {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/servlet-servlet.xml");
    private static SimpleJdbcTemplate jdbcTemplate = (SimpleJdbcTemplate) context.getBean("jdbcTemplate");
    private static List<DoorPrice> listDoorPrices = new ArrayList<DoorPrice>();

    private void getListDoorPricesFromDB()  {
        listDoorPrices.clear();
        String query = "SELECT * FROM door_prices";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
        Iterator iterator = list.iterator();
        while (iterator.hasNext())  {
            String strBuf = iterator.next().toString();
            String[] params = strBuf.toString().split(", ");
            params[0] = params[0].substring(4,params[0].length());
            params[1] = params[1].substring(14,params[1].length());
            params[2] = params[2].substring(23,params[2].length());
            params[3] = params[3].substring(22,params[3].length());
            params[4] = params[4].substring(25,params[4].length());
            params[5] = params[5].substring(12,params[5].length());
            params[6] = params[6].substring(21,params[6].length());
            params[7] = params[7].substring(20,params[7].length());
            params[8] = params[8].substring(23,params[8].length());
            params[9] = params[9].substring(9,params[9].length());
            params[10] = params[10].substring(12,params[10].length());
            params[11] = params[11].substring(12,params[11].length());
            params[12] = params[12].substring(10,params[12].length());
            params[13] = params[13].substring(12,params[13].length());
            params[14] = params[14].substring(12,params[14].length());
            params[15] = params[15].substring(9,params[15].length());
            params[16] = params[16].substring(16,params[16].length());
            params[17] = params[17].substring(14,params[17].length());
            params[18] = params[18].substring(13,params[18].length());
            params[19] = params[19].substring(16,params[19].length());
            params[20] = params[20].substring(13,params[20].length());
            params[21] = params[21].substring(16,params[21].length());
            params[22] = params[22].substring(14,params[22].length());
            params[23] = params[23].substring(20,params[23].length());
            params[24] = params[24].substring(20,params[24].length());
            params[25] = params[25].substring(21,params[25].length());
            params[26] = params[26].substring(23,params[26].length());
            params[27] = params[27].substring(16,params[27].length()-1);
            DoorPrice nextPrice = new DoorPrice();
            nextPrice.setId(Integer.parseInt(params[0]));
            nextPrice.setPriceLeafReech(Integer.parseInt(params[1]));
            nextPrice.setPriceLeafReechNonStandartHeigth(Integer.parseInt(params[2]));
            nextPrice.setPriceLeafReechNonStandartWidth(Integer.parseInt(params[3]));
            nextPrice.setPriceLeafReechNonStandartHghtWdth(Integer.parseInt(params[4]));
            nextPrice.setPriceLeafSot(Integer.parseInt(params[5]));
            nextPrice.setPriceLeafSotNonStandartHeigth(Integer.parseInt(params[6]));
            nextPrice.setPriceLeafSotNonStandartWidth(Integer.parseInt(params[7]));
            nextPrice.setPriceLeafSotNonStandartHghtWdth(Integer.parseInt(params[8]));
            nextPrice.setPriceDoorFrame(Integer.parseInt(params[9]));
            nextPrice.setPriceDoorFrameNonStandart(Integer.parseInt(params[10]));
            nextPrice.setPriceAssmbl(Integer.parseInt(params[11]));
            nextPrice.setPriceHole(Integer.parseInt(params[12]));
            nextPrice.setPriceInsert(Integer.parseInt(params[13]));
            nextPrice.setPriceZch201(Integer.parseInt(params[14]));
            nextPrice.setPriceZV4(Integer.parseInt(params[15]));
            nextPrice.setPricePaintGrunt(Integer.parseInt(params[16]));
            nextPrice.setPricePaintRAl(Integer.parseInt(params[17]));
            nextPrice.setPriceDoorTrim60mm(Integer.parseInt(params[18]));
            nextPrice.setPriceDoorTrim60mmNonStandart(Integer.parseInt(params[19]));
            nextPrice.setPriceDoorTrim90mm(Integer.parseInt(params[20]));
            nextPrice.setPriceDoorTrim90mmNonStandart(Integer.parseInt(params[21]));
            nextPrice.setSurchGenNum10(Integer.parseInt(params[22]));
            nextPrice.setSurchGenNumFr11to20(Integer.parseInt(params[23]));
            nextPrice.setSurchGenNumFr21to50(Integer.parseInt(params[24]));
            nextPrice.setSurchGenNumFr51to100(Integer.parseInt(params[25]));
            nextPrice.setSurchGenNumFr101to1000(Integer.parseInt(params[26]));
            nextPrice.setSurchGenNum1000(Integer.parseInt(params[27]));
            listDoorPrices.add(nextPrice);
        }
    }

    private String priceSave(DoorPrice doorPrice)   {
        return String.format(
            "INSERT INTO door_prices VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)",
                doorPrice.getId(),
                doorPrice.getPriceLeafReech(),
                doorPrice.getPriceLeafReechNonStandartHeigth(),
                doorPrice.getPriceLeafReechNonStandartWidth(),
                doorPrice.getPriceLeafReechNonStandartHghtWdth(),
                doorPrice.getPriceLeafSot(),
                doorPrice.getPriceLeafSotNonStandartHeigth(),
                doorPrice.getPriceLeafSotNonStandartWidth(),
                doorPrice.getPriceLeafSotNonStandartHghtWdth(),
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

}