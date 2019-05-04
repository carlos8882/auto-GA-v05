package org.umssdiplo.automationv01.core.managepage.SSI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import java.util.List;

public class EmployeeListPage extends BasePage {
    @FindBy(css = ".btn.btn-primary")
    private WebElement refreshButton;

    @FindBy(css = ".btn.btn-success")
    private WebElement addEmployeeButton;

    @FindBy(css = ".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(9) > button:nth-child(1)")
    private WebElement delteButton;

    // Pop up Add Employee
    @FindBy(css = "input[name='firstName']")

    private WebElement firstName;

    @FindBy(css = "input[name='lastName']")
    private WebElement lastName;

    @FindBy(css = "input[name='ci']")
    private WebElement ciField;

    @FindBy(css = "select[name='gender']")
    private WebElement genderField;

    @FindBy(css = "input[name='address']")
    private WebElement addressField;

    @FindBy(css = "input[name='birthDate']")
    private WebElement birthDateField;

    @FindBy(css = "input[name='phone']")
    private WebElement phoneField;

    @FindBy(css = "input[name='email']")
    private WebElement emailField;

    @FindBy(css = "select[name='employeeTypeId']")
    private WebElement employeeTypeField;

    @FindBy(css = "input[name='salary']")
    private WebElement employeeSalary;

    @FindBy(css = "button[type='submit']")
    private WebElement createButton;

    @FindBy(css = "button.btn.btn-danger[type='button']")
    private WebElement cancelButton;

    @FindBy(css = ".table.table-striped  > tbody >tr")
    private List<WebElement> employeeRows;

    public void clickAddEmployee(){
        addEmployeeButton.click();
    }

    private WebElement buttonDeleteEditItem(int rowNumber, int deleteEdit){
        String cssPath = ".table > tbody:nth-child(2) > tr:nth-child(" + rowNumber + ") > td:nth-child(9) > button:nth-child(" + deleteEdit +")";
        WebElement deleteButton = webDriver.findElement(By.cssSelector(cssPath));
        return deleteButton;
    }

    public void clickDeleteEditButton(int rowNumber, int deleteEdit){
        WebElement fila1 = buttonDeleteEditItem(rowNumber,deleteEdit);
        fila1.click();
        waitImplicitTime();
        if (deleteEdit == 1) {
            alertOk();
        }
    }

    public void fillFirstName(String data){
        firstName.clear();
        firstName.sendKeys(data);
    }

    public void fillLastName(String data){
        lastName.clear();
        lastName.sendKeys(data);
    }

    public void fillCi(String data){
        ciField.clear();
        ciField.sendKeys(data);
    }

    public void fillGender(String data){
        genderField.sendKeys(data);
    }

    public void fillAddress(String data){
        addressField.clear();
        addressField.sendKeys(data);
    }

    public void fillDOB(String data){
        birthDateField.sendKeys(data);
    }

    public void fillPhone(String data){
        phoneField.clear();
        phoneField.sendKeys(data);
    }

    public void fillEmailField(String data){
        emailField.clear();
        emailField.sendKeys(data);
    }

    public void fillEmployeeType(String data){
        employeeTypeField.sendKeys(data);
    }

    public void fillSalaryField(String data){
        employeeSalary.clear();
        employeeSalary.sendKeys(data);
    }

    public void clickCreateButton(){
        createButton.click();
        waitImplicitTime();
    }

    public String getLastNameEmployee(){
        WebElement lastElement = employeeRows.get(employeeRows.size()-1);
        List<WebElement> deleteButton = lastElement.findElements(By.cssSelector("td"));
        String name = deleteButton.get(1).getText();
        return name;
    }

    public String getFirstNameEmployee(){
        waitImplicitTime();
        WebElement lastElement = employeeRows.get(0);
        List<WebElement> firstElement = lastElement.findElements(By.cssSelector("td"));
        String name = firstElement.get(1).getText();
        return name;
    }

    public void clickRefresh(){
        refreshButton.click();
    }

}
