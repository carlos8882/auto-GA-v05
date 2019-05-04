package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Assigment.Assigment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class AssigmentStepDef {
    private Login login;

    private Assigment assigment;


    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    //Assigment Report

    @Given("^Load Assigment Report$")
    public void loadAssigmentReport() {

       assigment= LoadPage.assigment();


    }

    @And("^click Assigment Report$")
    public void clickAssigmentReport() {

        assigment.clickMenuAssigment();
    }

    @And("^click 'submenu' Assigment Report$")
    public void clickSubmenuAssigmentReport() {
        assigment.clickSubMenuReport();


    }

    //Assigment Material

    @Given("^Load Assigment Material$")
    public void loadAssigmentMaterial() {
        assigment=LoadPage.assigment();
    }

    @And("^click 'menu Material'$")
    public void clickMenuMaterial() {

        assigment.clickMenuMaterial();
    }

    @And("^click 'Assigment Material'$")
    public void clickAssigmentMaterial() {
        assigment.clickSubMenuMaterial();
    }

    @And("^click 'delete' assigment$")
    public void clickDeleteButtom() {

        assigment.clickDeleteButtom();

    }

    @And("^click 'employee'$")
    public void clickEmployee() {

        assigment.clickMenEmployee();
    }


    @And("^fill 'employee'$")
    public void fillEmployee() throws Throwable {
        fillData();

    }

    public void fillData(){
        assigment.fillEmployee( "Carlos Cori");

    }

    @And("^click 'Material Assign'$")
    public void clickMaterialAssign() {
        assigment.clickMenAssigEmp();
    }

    @And("^fill 'material'$")
    public void fillMaterial()throws Throwable{
        fillDataMat();
    }

    public void fillDataMat(){
        assigment.fillMaterial("casco");
    }


    @And("^click 'Quantity' Assign$")
    public void clickQuantityAssign() {
        assigment.clickCantidad();
    }

    @And("^fill 'cantidad'$")
    public void fillCantidad() {
        assigment.fillCantidad("Uno");
    }

    @And("^click 'selected Item'$")
    public void clickSelectedItem() {

    }


    @Then("^verify \"([^\"]*)\" is assigment to employee$")
    public void verifyIsAssigmentToEmployee(String cantidadEsperada) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        String cantidadActual =assigment.verifyMaterialElement();
        Assert.assertEquals(cantidadEsperada,cantidadActual,"casco");

    }
//Material Strore
    @Given("^Load Material Store$")
    public void loadMaterialStore() {
        assigment=LoadPage.assigment();
    }

    @And("^click 'Material Store'$")
    public void clickMaterialStore() {
        assigment.clickMaterialStrore();
    }

    @And("^verify lista \"([^\"]*)\" elemnt$")
    public void verifyListaElemnt(String ListaEsperada) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        String ListaActual=assigment.verifyElementMatStore();
        Assert.assertEquals(ListaEsperada,ListaActual,"1");
    }

    @And("^delete 'element'$")
    public void deleteElement() {
        assigment.clickDeleteElement();
    }

    @And("^edit 'material'$")
    public void editMaterial() {
        assigment.editElementMaterial();
        //
    }

    @And("^fll 'Material Strore'$")
    public void fllMaterialStrore() {
        assigment.fillMaterialElement("s");
    }

    @And("^click 'Material Type'$")
    public void clickMaterialType() {

        assigment.materialType();

    }

    @And("^fill 'new Material Type'$")
    public void fillNewMaterialType() {
        assigment.newMaterial();

        assigment.fillNewMaterialType("Secure Especial Element");
    }
}
