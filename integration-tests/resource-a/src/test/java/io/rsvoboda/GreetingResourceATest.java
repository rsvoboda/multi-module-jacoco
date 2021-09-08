package io.rsvoboda;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceATest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello/A")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }
    @Test
    public void testOldEndpoint() {
        given()
                .when().get("/old/A")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

}