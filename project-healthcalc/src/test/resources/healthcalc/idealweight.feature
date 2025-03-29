#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

# tenemos que tener 2 feature, porque tenemos 2 historias de usuarios

@tag
Feature:  Ideal Weight
  As a user I want to compute my ideal weight so that to be aware about my health condition
  @tag1
  Scenario: Altura invalida
    Given Tengo una calculadora de salud
    When calculo el peso ideal con una altura <altura>
    Then se lanza una excepcion por parametro invalido

    Examples:
    | altura |
    | -5     |    
    | -3     |
    |  0     | 
  
  @tag2
  Scenario: Genero Incorrecto 
  Given Tengo una calculadora de salud
  When Calculo el peso ideal con un genero '<genero>'
  Then The system raises an exception

  Examples:
  |genero|
  |z|
  |r|
  |d|

  @tag3
  Scenario: Calcular peso ideal
  Given Tengo una calculadora de salud
  When Calculo el peso ideal con una altura <altura> y genero '<genero>'
  Then El sistema devuelve <value>

  Examples:
  |altura|genero|value|
  |160|m|57.5|
  |160|w|56|









      
