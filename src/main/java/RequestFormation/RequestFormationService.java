package RequestFormation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestFormationService {

    public static <T>Response post(RequestSpecification requestSpecification, T payload) {
        return RestAssured.given()
                .spec(requestSpecification)
                .body(payload)
                .when()
                .post();
    }
}