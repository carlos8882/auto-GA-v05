package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.catalogo.clickCatalogo;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;

public class StepsDefinitionPHPtravel {
    private Login login;
    private clickCatalogo clickCatalogo;
    WebDriver driver;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'Tractorstore' page in 'header' page$")
    public void tractorstorePageInHeaderPage() {
        clickCatalogo = LoadPage.catalogoPage();
    }

    @And("^click 'Employee' page in 'buton'$")
    public void clickCatalogoPageInButon() {
        clickCatalogo.clickButtonH();
    }

    @And("^click on 'Employee list' menu in 'header button'$")
    public void clickOnEmployeeListMenuInHeaderButton() {
        clickCatalogo.clickMenuEmp();
    }

    @And("^click on 'add Employee' button in 'employee list' page$")
    public void clickOnAddEmployeeButtonInEmployeeListPage() {
        clickCatalogo.clickAddEmpl();
    }

    @And("^set first name in 'add employee' page$")
    public void setFirstNameInAddEmployeePage() {
        clickCatalogo.setEmployee();
    }

    @And("^click 'delete employee' in 'employee list' page$")
    public void clickDeleteEmployeeInEmployeeListPage() {
        clickCatalogo.clickDeleteEmpl();
    }

    @And("^set personal dates in 'add employee' pageLoad$")
    public void setFirstNameInAddEmployeePage(DataTable dt) {
        List<List<String>> list = dt.raw();
        // driver.findElement(By.name("firstName")).sendKeys(list.get(0).get(0));
        clickCatalogo.setEmployee2(list);
    }

    @And("^click ' submit button' in 'add employee' page$")
    public void clickSubmitButtonInAddEmployeePage() throws Throwable {
        clickCatalogo.clickAddEmplBtn();
    }

    @And("^click ' edit button' in 'employee list' page for edit 'lastmane' value$")
    public void clickEditButtonInEmployeeListPageForEditLastmaneValue(DataTable dt) {
        List<List<String>> list = dt.raw();
        clickCatalogo.clickEditBtn();
//        clickCatalogo.editEmployee(list);
//        clickCatalogo.clickAddEmplBtn();
    }

    @And("^click 'edit button'$")
    public void clickEditButton() {
        clickCatalogo.clickEditBtn();
    }
}
