Feature: Assigment Report

Scenario: The Page SSI-GA Assigment Report must be load
  Given Load Assigment Report
  And click Assigment Report
  And click 'submenu' Assigment Report


  Scenario: Once the page of SSI-GA load delete assigment material of an employee
    Given Load Assigment Report
    And click Assigment Report
    And click 'submenu' Assigment Report
    And click 'delete' assigment


    Scenario: Loading page SSI-GA
      Given Load Assigment Material
      And click 'menu Material'
      And click 'Assigment Material'

      Scenario: Assign Material an Employee
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

        Scenario:  Material Store
          Given Load Material Store
          And click 'Material Store'
          And verify lista "1" elemnt

          Scenario: Material Strore Delete
            Given Load Material Store
            And click 'Material Store'
            And verify lista "1" elemnt
            And  delete 'element'

          Scenario: Material Store Edit
            Given Load Material Store
            And click 'Material Store'
            And edit 'material'
            And fll 'Material Strore'

            Scenario: Material Type
              Given Load Material Store
              And  click 'Material Type'
              And fill 'new Material Type'



