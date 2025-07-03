package thetestingacademy.RestAssured_HTTPMethods.Get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Get_BDD_Style {
    @Test
    public void test_get_positive_TC1() {
        String pin_code = "401107";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }
}
