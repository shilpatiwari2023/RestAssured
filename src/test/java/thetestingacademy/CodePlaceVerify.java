package thetestingacademy;

import io.restassured.RestAssured;

import java.util.Scanner;

public class CodePlaceVerify {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter PinCode: ");
        String pin_code = scanner.next();

        RestAssured.given()
                      .baseUri("https://api.zippopotam.us")
                      .basePath("/IN/" + pin_code)
                .when()
                      .get()
                .then()
                      .log().all().statusCode(200);
    }
}
