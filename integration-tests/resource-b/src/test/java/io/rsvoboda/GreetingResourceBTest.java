package io.rsvoboda;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceBTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello/B")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }
    @Test
    public void testoldEndpoint() {
        given()
                .when().get("/old/B")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

}