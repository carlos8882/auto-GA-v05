package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.SSI.EmployeeListPage;

public class EmployeeStepDef {
    private EmployeeListPage employeeListPage;

    @And("^'employee List' page is loaded$")
    public void employeeIsLoaded() throws Throwable {
        employeeListPage = new EmployeeListPage();
    }

    @And("^press delete on 'Employee' page$")
    public void deleteEmployee() throws Throwable {
        employeeListPage.clickDeleteEditButton(1,1);
    }

    @And("^press refresh on 'Employee' page$")
    public void refreshEmployee() throws Throwable {
        employeeListPage.clickRefresh();
    }

    @And("^add 'Employee' data$")
    public void addNewEmployee() throws Throwable{
        employeeListPage.clickAddEmployee();
        fillData();
        employeeListPage.clickCreateButton();
    }

    @And("^edit 'Employee' data$")
    public void EditNewEmployee() throws Throwable{
        employeeListPage.clickDeleteEditButton(1,2);
        fillData();
        employeeListPage.clickCreateButton();
    }

    private void fillData(){
        employeeListPage.fillFirstName("Carlos");
        employeeListPage.fillLastName("Camacho");
        employeeListPage.fillCi("5188819");
        employeeListPage.fillGender("MALE");
        employeeListPage.fillAddress("J. E. Molina");
        employeeListPage.fillDOB("08/08/1982");
        employeeListPage.fillPhone("79324048");
        employeeListPage.fillEmailField("a@a.com");
        employeeListPage.fillEmployeeType("Electricista");
        employeeListPage.fillSalaryField("158");
    }

    @Then("^verify \"([^\"]*)\" is displayed in Employee page$")
    public void verifyIsDisplayedInEmployeePage(String nameEmployeeExpected) throws Throwable {
        String nameEmployActual = employeeListPage.getLastNameEmployee();
        Assert.assertEquals(nameEmployActual, nameEmployeeExpected, "error message ");
    }

    @Then("^verify \"([^\"]*)\" Edited is displayed in Employee page$")
    public void verifyIsDisplayedInEmployeeEditPage(String nameEmployeeExpected) throws Throwable {
        String nameEmployActual = employeeListPage.getFirstNameEmployee();
        Assert.assertEquals(nameEmployActual, nameEmployeeExpected, "error message ");
    }

    @Then("^verify \"([^\"]*)\" was Deleted in Employee page$")
    public void verifyDeleteEmployee(String nameEmployeeExpected) throws Throwable {
        String nameEmployActual = employeeListPage.getFirstNameEmployee();
        Assert.assertNotEquals(nameEmployActual, nameEmployeeExpected, "error message ");
    }

}
