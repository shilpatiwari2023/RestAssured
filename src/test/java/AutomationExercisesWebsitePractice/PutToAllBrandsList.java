package AutomationExercisesWebsitePractice;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PutToAllBrandsList {
    @Test
    public void test_PutToAllBrandsList() {
        RestAssured.given()
                .baseUri("https://automationexercise.com")
                .basePath("/api/brandsList")
                .log().all()
                .when().put()
                .then().log().all().statusCode(200);

    }
}
