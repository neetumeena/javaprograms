package restassured;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import restassured.RequestPojos.CreateUserPojo;

public class PostApiCall {

    public static void main(String[] args) {
        postApiCall();
    }

    private static void postApiCall() {


        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification request = RestAssured.given();
        CreateUserPojo createUserPojo = new CreateUserPojo();
        createUserPojo.setName("Testuser");
        createUserPojo.setJob("Testing");
        Response response = request.body(createUserPojo).log().all().post("/api/login").then()
                .statusCode(200)
                .and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema("src/test/resources/createUserJsonSchema.json"))
                .and()
                .extract().response();

        System.out.println(response.prettyPrint());

    }

}
