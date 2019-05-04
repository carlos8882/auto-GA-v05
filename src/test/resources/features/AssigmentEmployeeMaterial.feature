Feature: Once a SSI-GA load must select the Material Assigment Menu and assign material an employee

  Scenario: Assign material an employee.
    #The employee and Materials must be created in the system take a note in this case

  Given Load Assigment Material
    And click 'menu Material'
    And click 'Assigment Material'
    And click 'employee'
    And fill 'employee'
    And click 'Quantity' Assign
    And fill 'cantidad'
    And click 'Material Assign'
    And fill 'material'
    And click 'selected Item'
    And  subimit 'Material'
   Then verify "casco" is assigment to employee

