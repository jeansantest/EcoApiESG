package com.esg.eco_api.tests;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class SchemaTest {

    @Test
    public void validarSchema() {

        given()
                .when()
                .get("http://localhost:8080/coletas")
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/coleta-schema.json"));
    }
}