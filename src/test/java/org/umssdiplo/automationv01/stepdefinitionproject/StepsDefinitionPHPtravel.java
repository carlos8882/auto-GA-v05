package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Assigment.Assigment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;

    private Assigment assigment;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^Load Assigment Report$")
    public void loadAssigmentReport() {

       assigment= LoadPage.assigment();


    }

    @And("^click Assigment Report$")
    public void clickAssigmentReport() {

        assigment.clickMenuAssigment();
    }

    @And("^click 'submenu' Assigment Report$")
    public void clickSubmenuAssigmentReport() {
        assigment.clickSubMenuReport();


    }
}
