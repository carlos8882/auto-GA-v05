# Login feature review the behavior in thie feature
Feature: SSI

   Scenario: Fill Employee
     Given 'SSI' page is loaded
     And select EmployeeList on 'SSI' page
     And 'employee List' page is loaded
     And add 'Employee' data
     Then verify "Carlos" is displayed in Employee page

  Scenario: Edit Employee
    Given 'SSI' page is loaded
    And select EmployeeList on 'SSI' page
    And 'employee List' page is loaded
    And edit 'Employee' data
    Then verify "Carlos" Edited is displayed in Employee page

  Scenario: Delete Employee
    Given 'SSI' page is loaded
    And select EmployeeList on 'SSI' page
    And 'employee List' page is loaded
    And press delete on 'Employee' page
    And press refresh on 'Employee' page
    Then verify "carmen" was Deleted in Employee page
