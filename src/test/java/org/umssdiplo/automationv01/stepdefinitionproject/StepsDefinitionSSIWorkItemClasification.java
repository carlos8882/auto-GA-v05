package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.SSI.SSI;
import org.umssdiplo.automationv01.core.utils.LoadPageSSI;

public class StepsDefinitionSSIWorkItemClasification {
    private SSI ssi;

    @Given("^'SSI' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        ssi = LoadPageSSI.loginPage();
    }

    @And("^select EmployeeList on 'SSI' page$")
    public void selectEmployeeList() throws Throwable {
        ssi.selectEmployeeList();
    }


    @And("^subimit 'Material'$")
    public void subimitMaterial() {

    }

    @Then("^verify \"([^\"]*)\" is assigment to employee$")
    public void verifyIsAssigmentToEmployee(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
