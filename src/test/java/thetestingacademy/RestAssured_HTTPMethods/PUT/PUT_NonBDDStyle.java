package thetestingacademy.RestAssured_HTTPMethods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class PUT_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Description("verify the Put request for the Restful Booker API")
    @Test
    public void test_PUT_NonBDD(){
        String token = "9cc9447e730afc3";
        String bookingId = "794";

        String payloadPUT = "{\n" +
                "    \"firstname\" : \"pramod\",\n" +
                "    \"lastname\" : \"dutta\"\n" +
                "    \"totalprice\" : \"111\"\n" +
                "}'";
        r = RestAssured.given();
       r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/booking" + bookingId);
                r.contentType(ContentType.JSON);
               // r.auth().oauth()
                r.cookie("token" + token);
                r.body(payloadPUT).log().all();

                response = r.when().log().all().put();
                vr = response.then().log().all();
                vr.statusCode(200);


    }
}
