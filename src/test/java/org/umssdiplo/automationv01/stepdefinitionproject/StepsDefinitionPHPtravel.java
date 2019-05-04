package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Accounts.AdminsMngt;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.Date;
import java.util.List;

public class StepsDefinitionPHPtravel {
    private Login login;
    private AdminsMngt account;


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
        Date d = new Date();
        account.fillfname("testName");
        account.filllname("LastNametest");
        account.fillemail("asde1234567@asd.com");
        account.fillpassword("1234567");
        account.fillmobile("12345");
        account.fillcountry("Bolivia");
        account.filladrress1("asd123");
        account.filladrress2("asd12345");
        account.submitBtn();

    }
    public void setFieldsUpdated(){

        account.fillfname("Test updt");
//        account.filllname("Clarosupdt");
        account.fillemail("asd12345@asdupdt.com");

        //account.clickchkSuscriber();
        account.submitBtn();


    }


    @And("^fill form to create admin user$")
    public void fillFormToCreateAdminUser() {
        setFields();
        String nameEmployActual = account.getFirstNameEmployee();
        Assert.assertEquals(nameEmployActual, "testName", "admin user not created ");
        account.deleteclck();
    }

    @And("^go to admins page$")
    public void goToAdminsPage() throws Throwable{
        account = LoadPage.accountPage();
    }


//    @Then("^Click on update button for a user already created$")
//    public void clickOnUpdateButtonForAUserAlreadyCreated() throws Throwable {
//        setFieldsUpdated();
//    }

    @And("^click on edit button$")
    public void clickOnEditButton() throws Throwable {
        account.editclick();
        setFieldsUpdated();
    }

    @Then("^Verify fields were updated$")
    public void verifyFieldsWereUpdated() {
        String nameEmployActual = account.getFirstNameEmployee();
        Assert.assertEquals(nameEmployActual, "Test updt", "first name not updated ");
        account.deleteclck();
        //deleteUserCreated();
    }

    @And("^Delete user created$")
    public void deleteUserCreated() {
        //account.deleteclck();
        String nameEmployActual = account.getFirstNameEmployee();

        //if (nameEmployActual != "test")
            Assert.assertTrue(nameEmployActual != "test", "user not deleted ");

    }


    @Given("^User Created$")
    public void userCreated() {
        account.addAdmin();
        setFields();

    }

    @And("^fill form to create admin user then edit$")
    public void fillFormToCreateAdminUserThenEdit() {
        setFields();
    }

    @And("^Click on Search button$")
    public void clickOnSearchButton() {
        account.clickSearch();
    }

    @And("^Click on DropDwnFirst$")
    public void clickOnDropDwnFirst() {
        account.clickDropdwn();
        account.putValue("f");
    }

    @And("^Enter a name for the first name search$")
    public void enterANameForTheFirstNameSearch() {
        account.fillTextField("test1");
    }

    @And("^Click on Go button$")
    public void clickOnGoButton() {
        account.clickGoBtn();
        CommonEvents.waitEvent();


    }

    @Then("^Verify that search by First Name was success$")
    public void verifyThatSearchByFirstNameWasSuccess() {
        String nameEmployActual = account.getFirstNameEmployee();
        //CommonEvents.waitEvent();
        Assert.assertEquals(nameEmployActual, "test1", "error message ");
    }

    @And("^Click on DropDwnLast$")
    public void clickOnDropDwnLast() {
        account.clickDropdwn();
        account.putValue("L");
    }

    @And("^Enter a name for the last name search$")
    public void enterANameForTheLastNameSearch() {
        account.fillTextField("lastNameTest");
    }

    @Then("^Verify that search by Last Name was success$")
    public void verifyThatSearchByLastNameWasSuccess() {
        String nameEmployActual = account.getLastNameEmployee();
        Assert.assertEquals(nameEmployActual, "lastNameTest", "error message ");
    }

        @And("^Click on DropDwn \"([^\"]*)\"$")
    public void clickOnDropDwn(String arg0) throws Throwable {
            account.clickDropdwn();
            switch(arg0) {
                case "F" :
                    account.putValue("f");
                    break;
                case "L" :
                    account.putValue("L");
                    break;
                case "E" :
                    account.putValue("E");
                    break;
                case "Active" :
                    account.putValue("Active");
                    break;

            }
    }

    @And("^Enter an email for the email search$")
    public void enterAnEmailForTheEmailSearch() {
        account.fillTextField("email@searched.com");
    }

    @Then("^Verify that search by Email was success$")
    public void verifyThatSearchByEmailWasSuccess() {
        String emailEmployActual = account.getEmailEmployee();
        Assert.assertEquals(emailEmployActual, "email@searched.com", "admin user searched by email not found");
    }

    @Then("^Verify that search by Active was success$")
    public void verifyThatSearchByActiveWasSuccess() {
        Boolean activeEmployActual = account.getActiveEmployee();
         Assert.assertTrue(activeEmployActual, "admin user searched by active not found");

    }

    @When("^Click on header First Name column$")
    public void clickOnHeaderFirstNameColumn() {
        account.firstNameCol();
    }

    @Then("^Verify grid was sorted descentantly$")
    public void verifyGridWasSortedDescentantly() {
        String valuefirstrow = account.getFirstNameEmployee();
        String valuesecondrow = account.getFirstNameEmployee2();
        boolean greater = (valuefirstrow.compareTo(valuesecondrow)>0);
        Assert.assertTrue(greater, "grid not sorted descendantly");

    }
}
