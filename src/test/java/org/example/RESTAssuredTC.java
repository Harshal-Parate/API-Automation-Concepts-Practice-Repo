package org.example;

import io.restassured.RestAssured;

public class RESTAssuredTC {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("http://api.zippopotam.us")
                .basePath("/IN/440027")
                .when().get()
                .then().statusCode(201);
        //System.out.println(response.asString());
    }
}