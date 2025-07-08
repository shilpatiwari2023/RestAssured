package Examples;

import io.restassured.RestAssured;

public class FirstProgram_Ping {
    public static void main(String[] args) {
        RestAssured.given()
                      .baseUri("https://restful-booker.herokuapp.com/ping")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(201);
        //test coomment
        // alok
    }
}
