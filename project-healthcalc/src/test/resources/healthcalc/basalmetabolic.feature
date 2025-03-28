@tag
Feature: Basal Metabolic Rate
  As a user I want to compute my Basal Metabolic Rate so that to be aware about my health condition
  @tag1
    Scenario: Peso invalido
    Given Tengo una calculadora de salud
    When calculo el peso metabolico basal con un peso <peso>
    Then se lanza una excepcion por peso invalido

    Examples:
    | peso |
    | -5.523    |    
    | -3     |
    |  0     | 
  @tag2
  Scenario: Genero Incorrecto 
  Given Tengo una calculadora de salud
  When Calculo el peso metabolico basal con un genero '<genero>'
  Then The system raises exception

  Examples:
  |genero|
  |z|
  |r|
  |d|
  
  @tag3
   Scenario: Altura invalida
    Given Tengo una calculadora de salud
    When calculo peso metabolico basal con una altura <altura>
    Then se lanza una excepcion por altura invalida

    Examples:
    | altura |
    | -5     |    
    | -3     |
    |  0     | 

  @tag4
  Scenario: Edad invalida
    Given Tengo una calculadora de salud
    When calculo peso metabolico basal con una edad <edad>
    Then se lanza una excepcion por edad invalido

    Examples:
    | edad |
    | -32     |    
    | -3     |
    |  0     |
  
  @tag5
  Scenario: Calcular peso metabolico basal
  Given Tengo una calculadora de salud
  When Calculo el peso metabolico basal con un peso <peso>, altura <altura>, edad <edad> y genero '<genero>'
  Then El sistema devuelve resultado <value>

  Examples:
  |peso|altura|edad|genero|value|
  |70.567|180|20|m|1784.028076171875|
  |50.23|165|20|w|1336.639892578125|