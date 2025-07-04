package thetestingacademy.RestAssured_HTTPMethods.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class DELETE_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Description("verify the delete request for the Restful Booker API")
    @Test
    public void test_DELETE_NonBDD(){
        String token = "9cc9447e730afc3";
        String bookingId = "582";
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking" + bookingId);
        r.contentType(ContentType.JSON);
        // r.auth().oauth()
        r.cookie("token" + token);
        r.log().all();

        response = r.when().log().all().delete();
        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
