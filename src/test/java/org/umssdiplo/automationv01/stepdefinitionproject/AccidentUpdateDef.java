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


    @Then("^The popup of the update should be shown$")
    public void thePopupOfTheUpdateShouldBeShown() throws Throwable {
        boolean actual=update.isExistUpdatePopup();
        Assert.assertTrue(actual, "The popup is not present in the UI");
    }
}
