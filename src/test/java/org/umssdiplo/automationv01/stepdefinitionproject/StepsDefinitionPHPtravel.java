package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Assigment.Assigment;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
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
        assigment.fillMaterial("arnez");
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
}
