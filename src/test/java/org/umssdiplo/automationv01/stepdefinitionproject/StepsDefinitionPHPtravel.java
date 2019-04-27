package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
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


    @And("^click add Button$")
    public void clickAddButton() throws Throwable {
        account.addAdmin();
    }

    public void setFields(){
        account.fillfname("Miguel");
        account.filllname("Claros");
        account.fillemail("asd12345@asd.com");
        account.fillpassword("1234567");
        account.fillmobile("12345");
        account.fillcountry("Bolivia");
        account.filladrress1("asd123");
        account.filladrress2("asd12345");
        //account.clickchkSuscriber();
        account.submitBtn();

    }


    @And("^fill form to create admin user$")
    public void fillFormToCreateAdminUser() {
        setFields();
        String nameEmployActual = account.getLastNameEmployee();
        Assert.assertEquals(nameEmployActual, "Miguel", "error message ");
        //account.submitBtn();
    }

    @And("^go to admins page$")
    public void goToAdminsPage() throws Throwable{
        account = LoadPage.accountPage();
    }


}
