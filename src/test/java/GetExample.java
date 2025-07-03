import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetExample {

    public static void main(String[] args) {
        // Set base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Send GET request to /posts/1
        Response response =
                given()
                        .when()
                        .get("/posts/1")
                        .then()
                        .statusCode(200)  // ✅ Validate Status Code
                        .body("id", equalTo(1))  // ✅ Validate body content
                        .body("userId", notNullValue())
                        .log().all()  // ✅ Log full response
                        .extract().response();

        // You can also extract and print fields:
        String title = response.jsonPath().getString("title");
        System.out.println("Post Title: " + title);
    }
}

