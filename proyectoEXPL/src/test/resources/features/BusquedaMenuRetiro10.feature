Feature: como usuario debo ingresar el rut de la persona,
  para realizar la busqueda de sus retiros de 10%

  @Test
  Scenario: Busqueda de retiro 10%
    Given en la pantalla de retiro10
    When ingreso el <rut> de la persona
      | 15546140 |
    Then presiono el boton buscar
    And se muestra en cuadro con los retiros realizados por el afiliado
