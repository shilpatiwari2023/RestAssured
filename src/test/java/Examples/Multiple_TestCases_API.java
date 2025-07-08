package Examples;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Multiple_TestCases_API {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter PinCode: ");
        String pin_code = scanner.next();*/

    String pin_code = "401107";

    @Test
    public void test_get_positive_TC1() {
        pin_code = "401107";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .get()
                .then()
                .log().all().statusCode(404);
    }

    @Test
    public void test_get_negative_TC2() {
        pin_code = "@";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public void test_get_negative_TC3() {
        pin_code = "";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/" + pin_code)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }

}
