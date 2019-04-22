package org.umssdiplo.automationv01.core.managepage.Assigment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import javax.xml.crypto.Data;

public class Assigment extends BasePage {

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(5) > a")
    private WebElement menuAssigmentReport;

    public void clickMenuAssigment(){

        menuAssigmentReport.click();
    }

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li.dropdown.open > ul > li:nth-child(2) > a")
    private  WebElement subMenuAssigmentReport;


    public void clickSubmenuAssigmentReport(){

        subMenuAssigmentReport.click();

    }

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[5]/ul/li[3]/a")
    private WebElement submenuReport;

    public void clickSubMenuReport(){

        submenuReport.click();
    }

    //Assigment Material

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(5) > a")
    private WebElement menuAssigmentMaterial;

    public void clickMenuMaterial(){

        menuAssigmentMaterial.click();
    }

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li.dropdown.open > ul > li:nth-child(2) > a")
    private WebElement subMenuMaterial;


    public void clickSubMenuMaterial(){

        subMenuMaterial.click();
    }



    @FindBy(css="#equipments > tbody > tr:nth-child(2) > td:nth-child(7) > button")//#equipments > tbody > tr:nth-child(2) > td:nth-child(7) > button
    private WebElement clickDelete;

    public void clickDeleteButtom(){

        clickDelete.click();
    }

    //Filling the dates for assigment material of an employee

    //Find Employee
    @FindBy(xpath = "//*[@id=\"ngForm\"]/mat-form-field[1]/div/div[1]/div")
    private WebElement menEmployee;

    public void clickMenEmployee(){
        menEmployee.click();
    }

   //Fill Employee
    @FindBy(xpath = "//*[@id=\"mat-option-4\"]")//#mat-select-4 > div > div.mat-select-value
    private WebElement employee;

    public void fillEmployee(String Data){

       // employee.clear();
        employee.sendKeys(Data);
    }
    //Find Material
    @FindBy(name="employee")
    private WebElement material;

    public void clickMenAssigEmp(){

        material.click();
    }
    //Fill Material
    @FindBy( name="employee")//#mat-select-22
    private WebElement menMaterial;

    public void fillMaterial(String Data){

        menMaterial.sendKeys(Data);


    }

    //Find Cantidad

    @FindBy(name="quantity")
    private WebElement cantidadAssign;

    public void clickCantidad(){

        cantidadAssign.click();
    }
    //Fill Cantidad
    @FindBy(name="quantity")
    private WebElement asignaCantidad;

    public void fillCantidad(String Data){

        asignaCantidad.sendKeys(Data);
    }


    //click selected Item
    @FindBy(className="mat-select-content ng-trigger ng-trigger-fadeInContent")
    private WebElement selectItem;

    public void clickSelec(){
    selectItem.click();

    }

    //Submit Material
    @FindBy(css="#ngForm > button > span")
    private WebElement submitMat;

    public void clickSubmitMat(){
        submitMat.click();

    }
}
