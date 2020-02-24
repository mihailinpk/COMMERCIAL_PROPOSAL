package su.myspringwebapps.repositories;

import su.myspringwebapps.points.DoorPrice;
import java.util.List;

public interface DoorPricesInteractionWithDatabaseInterface {

    void saveDoorPrice(DoorPrice newDoorPrice);

    void deleteDoorPrice(DoorPrice doorPrice);

    List<DoorPrice> getAllDoorPrices();

    DoorPrice getDoorPriceById(Integer id);

}
