# Login feature review the behavior in thie feature
Feature: Account

  Scenario: Admins page is displayed
    Given set my credentials on 'Login' page
    And go to admins page
    And click add Button
    And fill form to create admin user
