Feature: registros

  Scenario: crear area en Registros
    Given Load 'new area registration' load
    And complete 'form' on 'new area' page
      | almacen | area donde se almacenan los materiales | alm01 |
