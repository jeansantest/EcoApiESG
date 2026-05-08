Feature: API de coleta reciclável

  Scenario: Criar coleta com sucesso
    Given que a API está disponível
    When envio uma coleta válida
    Then o sistema retorna status 201

  Scenario: Não permitir coleta sem endereço
    Given que a API está disponível
    When envio uma coleta sem endereco
    Then o sistema retorna status 400

  Scenario: Listar coletas
    Given que existem coletas cadastradas
    When solicito a listagem
    Then o sistema retorna status 200