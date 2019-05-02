package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.catalogo.registros;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;

public class StepDefinitionRegistration {
    private registros registro;

    @Given("^Load 'new area registration' load$")
    public void loadNewAreaRegistrationLoad() {
        registro = LoadPage.registroPage();

    }

    @And("^complete 'form' on 'new area' page$")
    public void completeFormOnNewAreaPage(DataTable dt) {

        List<List<String>> list = dt.raw();
        registro.clickButtonH(list);

    }

    @Given("^Select 'edit' options on 'registration list'$")
    public void selectEditOptions() {
        registro = LoadPage.registroPage();
        registro.editOption();
    }

    @And("^update 'area' field$")
    public void updateAreaField(DataTable dt) {
        List<List<String>> list = dt.raw();
        registro.editField(list);
    }

    @Given("^Select 'delete' options on 'registration list'$")
    public void selectDeleteOptionsOnRegistrationList() {
        registro = LoadPage.registroPage();
        registro.delOption();
    }

    @Given("^Load 'create personal registration' page$")
    public void loadCreatePersonalRegistrationPage() {
        registro = LoadPage.registroPage();
        registro.personalAreaPage();
    }

    @And("^complete 'form' on 'create personal' page from employee$")
    public void completeFormOnCreatePersonalPageFromEmployee(DataTable dt) throws Throwable {
        List<List<String>> list = dt.raw();
        registro.completeEmployee(list);

    }

    @Then("^the new 'area' on 'registration list' should be \"([^\"]*)\"$")
    public void theNewAreaOnRegistrationListShouldBe(String esperado) throws Throwable {
        String actual = registro.getCodigoTabla();

        Assert.assertEquals(actual, esperado, "El codigo es diferente al esperado ");
    }

    @Then("^'area' field sould be \"([^\"]*)\"$")
    public void areaFieldSouldBe(String esperadoUpdate) throws Throwable {
        String actual = registro.getCodigoTablaUpdate();

        Assert.assertEquals(actual, esperadoUpdate, "El registro no se ha actualizado");
    }

    @Then("^code \"([^\"]*)\" must be eliminated from 'resgistration list'$")
    public void codeMustBeEliminatedFromResgistrationList(String arg0) throws Throwable {
        String actual = registro.getCodigoTabla();
        Assert.assertTrue(actual.isEmpty(), "El registro no se ha eliminado");
    }

    @Then("^'name' field should be \"([^\"]*)\"$")
    public void nameFieldShouldBe(String esperado) throws Throwable {
        String actual = registro.getCodigoTablaArea();
        Assert.assertEquals(esperado, actual, "El nombre no coincide con el esperado");
    }
}
