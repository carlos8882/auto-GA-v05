package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.input.Employee;
import org.umssdiplo.automationv01.core.input.Incident;
import org.umssdiplo.automationv01.core.managepage.pageobject.Login;
import org.umssdiplo.automationv01.core.managepage.pageobject.Menu;
import org.umssdiplo.automationv01.core.managepage.pageobject.RegisterPopup;
import org.umssdiplo.automationv01.core.managepage.pageobject.TableAccident;
import org.umssdiplo.automationv01.core.utils.page.LoadPage;
import org.umssdiplo.automationv01.core.utils.page.MenuPage;
import org.umssdiplo.automationv01.core.utils.page.RegisterIncidentPage;
import org.umssdiplo.automationv01.core.utils.page.TablePage;

public class AccidentsCreateSeptDef {
    private Login loginPage;
    private Menu menu;
    private RegisterPopup registerIncident;
    private Employee employeeData;
    private Incident incidentData;
    private TableAccident tableAccident;



    @Given("^Go to Incident of the main menu$")
    public void loadPageAndGotoAccidentMenu()  {
        loginPage=LoadPage.loginPage();
        registerIncident= RegisterIncidentPage.openRegisterPopup();
            }

    @And("^Click Incident Button$")
    public void clickIncidentButton()  {
        menu= MenuPage.gotoMenu();
        menu.createIncident();
    }

    @And("^Click add Incident Type Button$")
    public void clickAddIncidentTypeButton()  {
        registerIncident.clickAddIncidentType();
    }

    @And("^Click Incident Agent Button$")
    public void clickAddIncidentAgentButton()  {
        registerIncident.clickAddIncidentAgent();
    }

    @And("^Fill Incident Type with Type: \"([^\"]*)\" and Description: \"([^\"]*)\"$")
    public void fillIncidentTypeButton(String typeName, String typeDescription)  {
        registerIncident.fillIncidentType(typeName,typeDescription);
    }

    @And("^Fill Incident Agent with \"([^\"]*)\"$")
    public void IncidentAgen(String agentType)  {
        registerIncident.fillIncidentAgent(agentType);
    }

    @Then("^Verify Incident Type: \"([^\"]*)\"$")
    public void verifyIncidentType(String incidentType)  {
        String actual = registerIncident.getLastIncidentType();
        Assert.assertEquals(actual.trim(),incidentType);
    }

    @Then("^Verify Incident Agent: \"([^\"]*)\"$")
    public void verifyIncidentAgen(String agentType)  {
        String actual = registerIncident.getLastIncidentAgent();
        Assert.assertEquals(actual.trim(),agentType);
    }

    @When("^Fill the incident register with \"([^\"]*)\" data$")
    public void fillTheIncidentRegisterWithData(String  data) throws Throwable {
        employeeData = new Employee();
        incidentData= new Incident();
        registerIncident= RegisterIncidentPage.openRegisterPopup();
        registerIncident.fillRegister(employeeData,incidentData);
    }


    @Then("^El register added is shown in the table in the first position$")
    public void elRegisterAddedIsShownInTheTableInTheFirstPosition() throws Throwable {
        employeeData = new Employee();
        tableAccident= TablePage.getTableAccidentValue();
        String actual=tableAccident.getFirstRowTable();
        String expected=employeeData.getFirstName()+" "+employeeData.getLastName();
        Assert.assertEquals( actual,expected,"The employee is not exist in the List ");
    }

}
