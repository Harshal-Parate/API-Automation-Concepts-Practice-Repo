package RequestFormation;
import FileReaders.PropertyFileReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationService {
    public static RequestSpecification requestSpecification(String BasePath) {
        return new RequestSpecBuilder()
                .setBaseUri(PropertyFileReader.readConfigData("BaseURI"))
                .setBasePath(BasePath)
                .setContentType(ContentType.JSON)
                //.setContentType(ContentType.TEXT)
                //.setContentType(ContentType.ANY)
                //.setContentType("*/*")
                .build();
    }
}