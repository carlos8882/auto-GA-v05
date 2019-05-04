Feature: Acidents Functionality

  Scenario: The User can Create an Accident
    Given Go to Incident of the main menu
    And Click Incident Button
    When Fill the incident register with "Scenarie 1" data
    Then El register added is shown in the table in the first position

  Scenario: The User can Deleted an Accident
    Given Go to Incident of the main menu
    When click Deleted "Marco Herrera" of the table
    Then El "Marco Herrera" register is not shown in the table

  Scenario: The user can Update and Accident
    Given Go to Incident of the main menu
    When click Update "carmen guzman 7676764" is Update in the "Carlos Cori"
    Then The "carmen guzman" Resgister is show in the table


    #  Resoonsable: Carlos Camacho  
  Scenario: The User can Create an Incident Type
    Given Go to Incident of the main menu
    And Click Incident Button
    And Click add Incident Type Button
    And Fill Incident Type with Type: "Medio Baja" and Description: "Medio Baja"
    Then Verify Incident Type: "Medio Baja"

    #  Resoonsable: Carlos Camacho
  Scenario: The User can Create an IncidentType
    Given Go to Incident of the main menu
    And Click Incident Button
    And Click Incident Agent Button
    And Fill Incident Agent with "Corte Infeccioso"
    Then Verify Incident Agent: "Corte Infeccioso"