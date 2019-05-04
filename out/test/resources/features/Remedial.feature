Feature: Actividad remedial

  Scenario: Mostrar el catalogo de productos
    Given 'Tractorstore' page in 'header' page
    And click 'Employee' page in 'buton'
    And click on 'Employee list' menu in 'header button'
    And click on 'add Employee' button in 'employee list' page
    And set personal dates in 'add employee' pageLoad
      | juan german | montes | 13245678 | cala cala | 70700001 | juangerman@gmail.com | 33000 | MALE | 21011990 | OBRERO |
    And  click ' submit button' in 'add employee' page
    And click ' edit button' in 'employee list' page for edit 'lastmane' value
      | mendoza aviles |
#    And click 'delete employee' in 'employee list' page


  Scenario: editar employee
    Given 'employee' creado
    And click 'edit button'

