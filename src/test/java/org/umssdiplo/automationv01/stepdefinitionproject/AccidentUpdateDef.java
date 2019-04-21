package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.pageobject.Update;
import org.umssdiplo.automationv01.core.utils.page.UpdatePage;

public class AccidentUpdateDef {
    private Update update;

    @When("^click Update \"([^\"]*)\" is Update in the \"([^\"]*)\"$")
    public void clickUpdateIsUpdateInThe(String nameActual, String nameUpdate) throws Throwable {
        update= UpdatePage.updateValue();
        update.updateRegister(nameActual,nameUpdate);
    }

    @Then("^The \"([^\"]*)\" Resgister is show in the table$")
    public void theResgisterIsShowInTheTable(String nameUpdate) throws Throwable {
        boolean actual=update.isExist(nameUpdate);
        Assert.assertTrue(actual);
    }
}
