import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserAPITest {

    @Test
    public void testGetUserAPI() {
        // Base URI
        RestAssured.baseURI = "https://reqres.in";

        // Send GET request
        Response response = RestAssured
                .given()
                .when()
                .get("/api/users/2")
                .then()
                .extract().response();

        // Print response (optional)
        System.out.println("Response:\n" + response.prettyPrint());

        // Validate status code = 200
        Assert.assertEquals(response.statusCode(), 200, "Status code should be 200");

        // Validate first name in response
        String firstName = response.jsonPath().getString("data.first_name");
        Assert.assertEquals(firstName, "Janet", "First name should be Janet");

        // Validate email format
        String email = response.jsonPath().getString("data.email");
        Assert.assertTrue(email.contains("@reqres.in"), "Email should contain @reqres.in");
    }
}
