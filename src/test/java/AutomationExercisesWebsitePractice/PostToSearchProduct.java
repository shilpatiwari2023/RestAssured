package AutomationExercisesWebsitePractice;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class PostToSearchProduct {
    @Test
    public void test_PostToSearchProduct() {
        RestAssured.
                given()
                    .baseUri("https://automationexercise.com")
                    .basePath("/api/searchProduct")
                    .contentType("application/x-www-form-urlencoded")
                    .formParam("search_product", "top")
                    .log().all()
                .when()
                    .post()
                .then()
                    .log().all()
                    .statusCode(200);

    }
}
