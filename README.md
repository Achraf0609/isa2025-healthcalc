# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada

# Práctica 1

## Casos de prueba 

A continuación se enumerará una serie de prueba que se tendrá en cuenta , a la hora de realizar el proyecto.

### Ideal Weight
 -Test en la situación de introducir un género diferente a "m" o "w"

 -Test en la situación de introducir una altura en negativo

 -Test calcular correctamente el idealWeight para hombres

 -Test calcular correctamente el idealWeight para mujeres

 -Test en la situacion de introducir una altura igual a 0



### Basal Metabolic Rate
-Test en la situación de introducir un peso negativo

-Test en la situación de introducir una edad negativo

-Test en la situación de introducir una edad igual a 0

-Test en la situación de introducir un genero diferente a "m" o "w"

-Test en la situación de introducir un peso igual a 0

-Test en la situación de introducir una altura igual a 0

-Test en la situación de introducir una altura negativo

-Test calcular correctamente el Basal Metabolic Rate para hombres

-Test calcular correctamente el Basal Metabolic Rate para mujeres

# Resultados Al ejecutar los test

![image](doc/ResultadoTests.png)

# Commits Realizados durante la Practica 1

![image](doc/CommitsRealizados.png)

# Práctica 3

## Feature : Ideal Weight

Como usuario quiero calcular mi peso ideal para estar consciente de mi estado de salud.

    Scenario Altura negativa
    Given Tengo una calculadora de salud
    And Una altura negativa -5 cm
    And Un genero masculino
    When Calculo el peso ideal
    Then Se lanza una excepcion por parametro invalido

    Scenario Altura cero
    Given Tengo una calculadora de salud
    And una altura de 0 cm
    And un genero masculino
    When Calculo el peso ideal
    Then Se lanza una excepcion por parametro invalido

    Scenario Genero Incorrecto
    Given Tengo una calculadora de salud
    And una altura de 160 cm
    And un genero diferente a másculino o femenino
    When Calculo el peso ideal
    Then Se lanza una excepción por parametro invalido

    Scenario:Calculo el peso ideal genero masculino
    Given Tengo una calculadora de salud
    And Una altura de 160 cm
    And Un genero másculino
    When Calculo el peso ideal
    Then El sistema devuelve 57.5 kg

    Scenario:Calculo el peso ideal genero femenino
    Given Tengo una calculadora de salud
    And Una altura de 160 cm
    And Un genero femenino
    When Calculo el peso ideal
    Then El sistema devuelve 56 kg

## Feature : Basal Metabolic Rate

Como usuario quiero calcular mi peso metabólico basal para estar consciente de mi estado de salud.

    Scenario Peso negativo
    Given Tengo una calculadora de salud
    And un peso de -10 kg
    And una altura de 160 cm
    And una edad de 20
    And un genero masculino
    When Calculo el peso metabólico basal
    Then Se lanza una excepcion por parametro invalido

    Scenario Peso cero
    Given Tengo una calculadora de salud
    And un peso de 0 kg
    And una altura de 160 cm
    And una edad de 20
    And un genero masculino
    When Calculo el peso metabólico basal
    Then Se lanza una excepcion por parametro invalido

    Scenario Altura negativa
    Given Tengo una calculadora de salud
    And un peso de 60 kg
    And Una altura negativa -5 cm
    And una edad de 20
    And Un genero masculino
    When Calculo el peso metabólico basal
    Then Se lanza una excepcion por parametro invalido

    Scenario Altura cero
    Given Tengo una calculadora de salud
    And un peso de 60 kg
    And una altura de 0 cm
    And una edad de 20
    And un genero masculino
    When Calculo el peso metabólico basal
    Then Se lanza una excepcion por parametro invalido

    Scenario Edad negativa
    Given Tengo una calculadora de salud
    And un peso de 60 kg
    And una altura de 180 cm
    And una edad de -5
    And un genero masculino
    When Calculo el peso metabólico basal
    Then Se lanza una excepcion por parametro invalido

    Scenario Edad cero
    Given Tengo una calculadora de salud
    And un peso de 60 kg
    And una altura de 180 cm
    And una edad de 0
    And un genero masculino
    When Calculo el peso metabólico basal
    Then Se lanza una excepcion por parametro invalido

    Scenario Genero Incorrecto
    Given Tengo una calculadora de salud
    And un peso de 60 kg
    And una altura de 160 cm
    And una edad de 20
    And un genero diferente a másculino o femenino
    When Calculo el peso metabólico basal
    Then Se lanza una excepción por parametro invalido

    Scenario:Calculo el peso metabólico basal genero masculino
    Given Tengo una calculadora de salud
    And un peso de 60 kg
    And Una altura de 160 cm
    And una edad de 20
    And Un genero másculino
    When Calculo el peso metabólico basal
    Then El sistema devuelve 1776.432

    Scenario:Calculo el peso metabólico basal genero femenino
    Given Tengo una calculadora de salud
    And un peso de 60 kg
    And Una altura de 160 cm
    And una edad de 20
    And Un genero femenino
    When Calculo el peso metabólico basal
    Then El sistema devuelve 1334.5131

