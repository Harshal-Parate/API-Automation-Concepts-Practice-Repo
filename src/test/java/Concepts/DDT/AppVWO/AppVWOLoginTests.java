package Concepts.DDT.AppVWO;

import Concepts.DDT.ReadExcelFile;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

public class AppVWOLoginTests {

    //@Test(dataProvider = "getData", dataProviderClass = ReadExcelFile.class) --> If data provider is in different class
    @Test(dataProvider = "getData")
    public void test1(String username, String password) {

        String data = "{\n" +
                "    \"username\": \""+username+"\",\n" +
                "    \"password\": \""+password+"\",\n" +
                "    \"remember\": false,\n" +
                "    \"recaptcha_response_field\": \"\"\n" +
                "}";

       Map<String, String> header = new HashMap<>();
         header.put("Accept","*/*");
         header.put("Accept-Encoding", "gzip, deflate, br");
         header.put("Accept-Language", "en-US,en;q=0.9");
         header.put("Content-Type", "application/json;charset=UTF-8");

        Response response = RestAssured.given()
                .basePath("/login")
                .baseUri("https://app.vwo.com")
                .headers(header)
                .body(data)
                .when().post();
        int id = response.then().extract().path("id");
        String name = response.then().extract().path("name");
        String email = response.then().extract().path("email");

        assertThat(id).isNotZero().isNotNull();
        assertThat(name).isEqualTo("Harsh Parate").isNotEmpty();
        assertThat(email).isEqualTo("qwertyharshal@gmail.com").isNotEmpty();

    }

    @DataProvider
    public Object[][] getData() {
        return ReadExcelFile.getData("Creds");
    }
}