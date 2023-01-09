Feature: Ingreso de solicitud de congelamiento de saldo en RAD

  Scenario: Se debe ingresar una nueva solicitud de congelamiento desde el RAD
    Given Estando logeado en RAD
    When Ingreso al menu NCG264->tramites->por congelar
    Then Selecciono la opcion Agregar
    Then Ingreso el <rut> del afiliado
      | 155461470 |
    And presiono salir
