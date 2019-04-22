package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Accounts.Account;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Account account;


    @Given("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login = LoadPage.loginPage();
        login.setCredentials();
    }


    @And("^admins page loaded$")
    public void adminsPageLoaded() {
        account = LoadPage.accountPage();
        account.addAdmin();
    }
}
