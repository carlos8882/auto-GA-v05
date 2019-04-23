package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Puma.Pumapage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPuma {
    private Pumapage puma;

    @Given("^'Puma' page is loaded$")
    public void pumaPageIsLoaded() throws Throwable {
        puma = LoadPage.loginPagePuma();
    }

    @And("^Click tenis > Futbol$")
    public void pumaclickFutbol() throws Throwable {
        puma.menHolder();
        puma.tenisClick();
    }



}
