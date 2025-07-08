package Examples;

import io.restassured.RestAssured;

public class PinCodeAreaVerify {
    public static void main(String[] args) {
        RestAssured.given()
                     .baseUri("https://api.postalpincode.in/pincode/401107")
                .when()
                     .get()
                .then()
                     .log().all().statusCode(200);
    }
}
