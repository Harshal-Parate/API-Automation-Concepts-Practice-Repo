package SeriallizationAndDeserelization.GSON;

import SeriallizationAndDeserelization.RequestPOJO.BookingCreationRootRequest;
import SeriallizationAndDeserelization.RequestPOJO.BookingdatesRequest;
import com.google.gson.Gson;
import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.Method;

import static SeriallizationAndDeserelization.GSON.PayloadManager.payLoadManager;

public class GsonLiabImplementation {



    public static String  searlization(Object rawPayload) {

        Gson data = new Gson();
        String payload = data.toJson(rawPayload);
        return payload;

    }

//    public static Object desearlization (String payload) {
//
//        Gson data = new Gson();
//        return data.fromJson(payload);
//
//    }






}
