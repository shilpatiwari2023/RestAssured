package AutomationExercisesWebsitePractice;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostToAllProductList {
    @Test
    public void test_Post(){
        RestAssured.given()
                .baseUri("https://automationexercise.com")
                .basePath("/api/productsList")
                .log().all()
                .when().post()
                .then().log().all().statusCode(200);
    }
}
