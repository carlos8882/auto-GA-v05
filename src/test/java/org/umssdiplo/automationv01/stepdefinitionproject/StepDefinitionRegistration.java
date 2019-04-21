package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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
}
