package org.quarkus.resource;

import static io.restassured.RestAssured.given;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ExampleResourceTest {

  @Test
  public void getList() {

    given().when().get("/examples").then().statusCode(200);
  }
}
