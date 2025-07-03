package thetestingacademy.RestAssured_HTTPMethods.Get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Get_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_GET_NonBDD(){
        String pin_code = "401107";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pin_code);
        response = r.when().log().all().get();
        System.out.println(response.asString());
        vr = response.then().log().all().statusCode(404);
    }
    @Test
    public void test_GET_Negative(){
        String pin_code = "@";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pin_code);
        response = r.when().log().all().get();
        System.out.println(response.asString());
        vr = response.then().log().all().statusCode(404);
    }
}
