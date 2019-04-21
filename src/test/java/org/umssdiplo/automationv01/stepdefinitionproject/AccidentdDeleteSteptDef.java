package org.umssdiplo.automationv01.stepdefinitionproject;


import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.pageobject.Delete;
import org.umssdiplo.automationv01.core.utils.page.DeletePage;

public class AccidentdDeleteSteptDef {
    private Delete delete;


    @When("^click Deleted \"([^\"]*)\" of the table$")
    public void clickDeletedOfTheTable(String name) throws Throwable {
        delete= DeletePage.deleteRowTable();
        delete.deleteRow(name);
    }

    @Then("^El \"([^\"]*)\" register is not shown in the table$")
    public void elRegisterIsNotShownInTheTable(String name) throws Throwable {
        boolean actual=delete.isExist(name);
        Assert.assertTrue(actual);
    }
}
