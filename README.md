# Projeto ESG - API de Coleta Reciclável

## Descrição

Este projeto foi desenvolvido com foco em sustentabilidade ambiental dentro dos pilares ESG (Environmental, Social and Governance).

A aplicação consiste em uma API REST para gerenciamento de coletas recicláveis, permitindo cadastro e consulta de resíduos recicláveis.

Além do desenvolvimento da API, foram implementados testes automatizados utilizando BDD (Behavior Driven Development), validação de APIs e testes de contrato com JSON Schema.

---

# Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- JUnit
- Cucumber
- RestAssured
- JSON Schema Validator
- GitHub Actions

---

# Funcionalidades da API

## Criar coleta

POST `/coletas`

### Exemplo de requisição

```json
{
  "endereco": "Rua A",
  "tipoResiduo": "Plástico"
}
```

---

## Listar coletas

GET `/coletas`

---

## Buscar coleta por ID

GET `/coletas/{id}`

---

# Testes Automatizados

O projeto possui testes automatizados utilizando:

- BDD com Cucumber e Gherkin
- Testes de API com RestAssured
- Validação de status code
- Validação de corpo JSON
- Testes de contrato com JSON Schema

---

# Cenários BDD Implementados

## Cenário positivo

- Criar coleta com sucesso

## Cenário negativo

- Não permitir coleta sem endereço

## Cenário de listagem

- Listar coletas cadastradas

---

# Como Executar o Projeto

## Pré-requisitos

- Java 17
- Maven

---

## Executar a aplicação

```bash
mvn spring-boot:run
```

A aplicação será iniciada em:

```txt
http://localhost:8080
```

---

# Como Executar os Testes

Com a API rodando, execute:

```bash
mvn test
```

---

# Pipeline CI/CD

O projeto possui integração contínua utilizando GitHub Actions.

Os testes são executados automaticamente a cada push realizado na branch main.

---

# Tema ESG

O projeto está relacionado ao pilar ambiental (Environmental) do ESG, simulando um sistema de gerenciamento de coleta reciclável com foco em sustentabilidade e descarte consciente de resíduos.

---

# Autor

Jean Santiago Sabença Esteves - RM559437