package AutomationExercisesWebsitePractice;

import io.restassured.RestAssured;

public class GetAllBrandsList {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://automationexercise.com")
                .basePath("/api/brandsList")
                .log().all()
                .when().get()
                .then().log().all()
                .statusCode(200);
    }
}
