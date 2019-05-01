Feature: registros

  Scenario: crear area en Registros
    Given Load 'new area registration' load
    And complete 'form' on 'new area' page
      | almacen | area donde se almacenan los materiales | alm01 |
    Then the new 'area' on 'registration list' should be "alm01"

  Scenario: editar area en Registros
    Given Select 'edit' options on 'registration list'
    And update 'area' field
      | almacen principal |
    Then 'area' field sould be "almacen principal"

  Scenario: eliminar area en Registros
    Given Select 'delete' options on 'registration list'
    Then code "alm01" must be eliminated from 'resgistration list'

  Scenario: crear el registro de personal por area
    Given Load 'create personal registration' page
    And complete 'form' on 'create personal' page from employee "carmen"
