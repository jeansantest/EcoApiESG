package com.esg.eco_api.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class ColetaSteps {

    Response response;

    @Dado("que a API está disponível")
    public void apiDisponivel() {
        // API já está rodando localmente
    }

    @Quando("envio uma coleta válida")
    public void envioColeta() {

        String body = """
        {
          "endereco": "Rua A",
          "tipoResiduo": "Plástico"
        }
        """;

        response =
                given()
                        .contentType("application/json")
                        .body(body)
                        .when()
                        .post("http://localhost:8080/coletas");
    }

    @Quando("envio uma coleta sem endereco")
    public void envioColetaSemEndereco() {

        String body = """
        {
          "endereco": "",
          "tipoResiduo": "Plástico"
        }
        """;

        response =
                given()
                        .contentType("application/json")
                        .body(body)
                        .when()
                        .post("http://localhost:8080/coletas");
    }

    @Quando("solicito a listagem")
    public void listarColetas() {

        response =
                given()
                        .when()
                        .get("http://localhost:8080/coletas");
    }

    @Entao("o sistema retorna status {int}")
    public void validarStatus(int status) {

        response.then()
                .statusCode(status);
    }

    @Entao("o JSON da resposta contém os dados da coleta")
    public void validarJsonDaResposta() {

        response.then()
                .body("id", notNullValue())
                .body("endereco", equalTo("Rua A"))
                .body("tipoResiduo", equalTo("Plástico"));
    }
}