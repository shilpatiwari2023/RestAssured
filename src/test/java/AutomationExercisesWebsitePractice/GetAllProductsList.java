package AutomationExercisesWebsitePractice;

import io.restassured.RestAssured;

public class GetAllProductsList {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://automationexercise.com")
                .basePath("/api/productsList")
                .log().all()
                .when().get()
                .then().log().all().statusCode(200);


    }
}
