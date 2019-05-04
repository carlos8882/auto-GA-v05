Feature: Acidents Functionality

  @Incident
  Scenario: The User can Create an Accident
    Given Go to Incident of the main menu
    And Click Incident Button
    When Fill the incident register with "Incident.json" data
    Then El register added is shown in the table in the first position

  @Incident
  Scenario: The User can Deleted an Accident
    Given Go to Incident of the main menu
    When click Deleted "Marco Herrera" of the table
    Then El "Marco Herrera" register is not shown in the table

  @Incident
  Scenario: The user can Update and Accident
    Given Go to Incident of the main menu
    When click Update "carmen guzman" is Update in the "Carlos Cori"
    Then The popup of the update should be shown

  @Incident
  Scenario: The Employeed is prepopulate data in the Popup
    Given Go to Incident of the main menu
    When Click Incident Button
    And  Select "Carlos Cori 5454345"
    Then The Prepopulate "Carlos Cori 5454345 MALE"

