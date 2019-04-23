# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'Puma' page is loaded
    And click tenis > Futbol
    And click item "Calzado de Fútbol X 18.3 TF"
    And select talla "MX 9.5"
    And click add carrito
    And verify cantidad "1"
    And clicks Ver Carrito
    Then Verify title:"Calzado de Fútbol X 18.3 TF", quantity: "1", price: "$1,329.00" and total: "$1,428.00"


