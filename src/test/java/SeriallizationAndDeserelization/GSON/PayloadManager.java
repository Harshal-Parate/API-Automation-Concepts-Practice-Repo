package SeriallizationAndDeserelization.GSON;

import SeriallizationAndDeserelization.RequestPOJO.BookingCreationRootRequest;
import SeriallizationAndDeserelization.RequestPOJO.BookingdatesRequest;

public class PayloadManager {

    public static Object payLoadManager() {

        BookingCreationRootRequest create = new BookingCreationRootRequest();
        create.setFirstname("Harshal");
        create.setLastname("Parate");
        create.setTotalprice(1000);
        create.setDepositpaid(true);

        BookingdatesRequest dates = new BookingdatesRequest();
        dates.setCheckin("2018-01-01");
        dates.setCheckout("2019-01-01");

        create.setBookingdates(dates);
        create.setAdditionalneeds("chicken");

        return create;

    }
}
