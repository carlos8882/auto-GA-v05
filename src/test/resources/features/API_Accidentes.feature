# Login feature review the behavior in thie feature
Feature: Login


  Scenario: POSTMAN- GET Lista de Accidentes
    Given GET "/Incident" postman endpoint is configured
    Then the status code should be 200

  Scenario: POSTMAN- GET  El accidente de carmen guzman
    Given GET "/Incident/2" postman endpoint is configured
    Then the status code should be 200
    And The "carmen" content in the body

  Scenario: POSTMAN- Post ingresar un nuevo incidente
    Given POST "/Incident/createIncident" postman endpoint is configured with "carlo cori"
    Then the responde 'data' value is "carlos"
    And the status code post should be 201
