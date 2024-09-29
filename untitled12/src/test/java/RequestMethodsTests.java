import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RequestMethodsTests {
    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                    .when()
                    .get("/get")
                    .then()
                    .extract()
                    .response();

            response.then()
                    .statusCode(200)
                    .body("url", equalTo("https://postman-echo.com/get"));
    }
    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .header("Content-Type", "application/json")
                .body("{\"key1\": \"value1\", \"key2\": \"value2\"}")
                .post("/post");

        response.then()
                .statusCode(200)
                .body("json.key1", equalTo("value1"))
                .body("json.key2", equalTo("value2"));
    }
    @Test
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        String requestBody = "{\"foo\": \"bar\"}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("json.foo", equalTo("bar"))
                .extract().response();

        System.out.println(response.asString());
    }
    @Test
    public void testPatchMethod() {
        RestAssured.baseURI = "https://postman-echo.com";

        String requestBody = "{\"foo\": \"bar\"}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("json.foo", equalTo("bar"))
                .extract()
                .response();

        System.out.println(response.getBody().asString());
    }
    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        given()
                .when()
                .delete("/delete")
                .then()
                .assertThat()
                .statusCode(200)
                .body("args", equalTo(null));
    }
}