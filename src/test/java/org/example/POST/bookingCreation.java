package org.example.POST;

import RequestFormation.RequestFormationService;
import RequestFormation.RequestSpecificationService;
import RequestFormation.ResponseParsingService;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
//import static TestDataBuilder.CreateBookingPayloadBuilder.getBookingCreationPayload;
import static FilePaths.CreateBookingFilePaths.getBookingCreationFile;
import static FilePaths.Endpoints.*;
import static FileReaders.JSONFileReader.payload;

public final class bookingCreation {

    @Test
    public void createBooking() {
        RequestSpecification requestSpecification = RequestSpecificationService.requestSpecification(getCreateBookingEndpoint());
        Response response = RequestFormationService.post(requestSpecification, payload(getBookingCreationFile()));
        String parsedResponse = ResponseParsingService.responseData(response);
    }
}