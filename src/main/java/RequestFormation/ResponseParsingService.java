package RequestFormation;

import io.restassured.response.Response;

public class ResponseParsingService {

    public static String responseData(Response response) {
        return response.then().extract().response().asString();
    }
}