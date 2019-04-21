package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

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


}
