Feature: registros

  Scenario: crear area en Registros
    Given Load 'new area registration' load
    And complete 'form' on 'new area' page
      | almacen | area donde se almacenan los materiales | alm01 |

  Scenario: editar area en Registros
    Given Select 'edit' options on 'registration list'
    And update 'area' field
      | almacen principal |

  Scenario: eliminar area en Registros
    Given Select 'delete' options on 'registration list'
