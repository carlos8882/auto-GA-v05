package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.catalogo.clickCatalogo;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private clickCatalogo clickCatalogo;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'Tractorstore' page in 'header' page$")
    public void tractorstorePageInHeaderPage() {
        clickCatalogo = LoadPage.catalogoPage();
    }

    @And("^click 'Catalogo' page in 'buton'$")
    public void clickCatalogoPageInButon() {
        clickCatalogo.clickButtonH();
    }
}
