package SeriallizationAndDeserelization.GSONImplementationTESTCLASS;
import io.restassured.RestAssured;
import static org.assertj.core.api.Assertions.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static SeriallizationAndDeserelization.GSON.GsonLiabImplementation.searlization;
import static SeriallizationAndDeserelization.GSON.PayloadManager.payLoadManager;

public class tests {

    @Test
    public void testPOSTBookingCreation() {


        RequestSpecification  requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .setBasePath("/booking")
                .setContentType(ContentType.JSON)
                .build();

        Response response = RestAssured.given()
                .spec(requestSpecification)
                .body(searlization(payLoadManager()))
                .with().post();

        ValidatableResponse validatableResponse = response.then();

        JsonPath jsonPath = new JsonPath(response.asString());

        int bookingId = jsonPath.getInt("bookingid");
        String firstName = jsonPath.getString("booking.firstname");
        String lastName = jsonPath.getString("booking.lastname");
        int totalPrice = jsonPath.getInt("booking.totalprice");
        boolean depositPaid = jsonPath.getBoolean("booking.depositpaid");
        String checkInDate = jsonPath.getString("booking.bookingdates.checkin");
        String checkOutDate = jsonPath.getString("booking.bookingdates.checkout");
        String additionalNeeds = jsonPath.getString("booking.additionalneeds");

        assertThat(bookingId).isNotZero();














    }
}
