package org.umssdiplo.automationv01.core.managepage.catalogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;

public class clickCatalogo extends BasePage {
    //    @FindBy(css = ".fa.fa-list.fa-lg")
    @FindBy(css = ".dropdown-toggle")
    private WebElement catalogoButonHeader;

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[3]/ul/li[2]/a")
    private WebElement employeeMenuSelect;

    @FindBy(css = ".btn.btn-success")
    private WebElement addEmployee;

    //    @FindBy(css = ".form-control.ng-untouched.ng-pristine.ng-valid")
    @FindBy(name = "firstName")
    private WebElement addEmployeeFirstName;

    @FindBy(name = "lastName")
    private WebElement addEmployeeLastName;

    @FindBy(name = "ci")
    private WebElement addEmployeeCI;

    @FindBy(name = "address")
    private WebElement addEmployeeAddress;

    @FindBy(name = "phone")
    private WebElement addEmployeephone;

    @FindBy(name = "email")
    private WebElement addEmployeeEmail;

    @FindBy(name = "salary")
    private WebElement addEmployeeSalary;

    @FindBy(name = "gender")
    private WebElement addEmployeeGender;

    @FindBy(name = "birthDate")
    private WebElement addEmployeeBirthDate;

    @FindBy(name = "employeeTypeId")
    private WebElement addEmployeeTypeId;

    //    @FindBy(css = ".btn.btn-primary")
    // @FindBy(xpath = "//html/body/modal-container/div/div/app-add-employee/div/div[2]/form/div[8]/div/button[1]")
    @FindBy(css = "button[type='submit'")
    private WebElement addEmployeeBtn;

    @FindBy(xpath = "//table/tbody/tr[7]/td[9]/button[2]")
    private WebElement editEmployeeBtn;

    @FindBy(xpath = "//table/tbody/tr[7]/td[9]/button[1]")
    private WebElement delEmployee;

//    @FindBy(name = "password")
//    private WebElement passwordInputField;
//
//    @FindBy(css = ".btn-primary.btn-block")
//    private WebElement loginBtn;

    public void clickButtonH() {
//        String username = PropertyAccessor.getInstance().getUser();
//        String password = PropertyAccessor.getInstance().getPassword();
//        CommonEvents.setInputField(usernameInputField, username);
//        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(catalogoButonHeader);
    }

    public void clickMenuEmp() {
        CommonEvents.clickButton(employeeMenuSelect);
    }

    public void clickAddEmpl() {
        CommonEvents.clickButton(addEmployee);
    }

    public void setEmployee() {
        String username = PropertyAccessor.getInstance().getUser();
        CommonEvents.setInputField(addEmployeeFirstName, username);
    }

    public void setEmployee2(List<List<String>> list) {
        String username = list.get(0).get(0);
        String lastname = list.get(0).get(1);
        String ci = list.get(0).get(2);
        String address = list.get(0).get(3);
        String phone = list.get(0).get(4);
        String email = list.get(0).get(5);
        String salary = list.get(0).get(6);
        String gender = list.get(0).get(7);
        String date = list.get(0).get(8);
        String cargo = list.get(0).get(9);


        addEmployeeFirstName.sendKeys(username);
        addEmployeeLastName.sendKeys(lastname);
        addEmployeeCI.sendKeys(ci);
        addEmployeeAddress.sendKeys(address);
        addEmployeephone.sendKeys(phone);
        addEmployeeEmail.sendKeys(email);
        addEmployeeGender.sendKeys(gender);
        addEmployeeBirthDate.sendKeys(date);
        addEmployeeTypeId.sendKeys(cargo);
        addEmployeeSalary.sendKeys(salary);
        addEmployeeSalary.submit();
        //CommonEvents.setInputField(addEmployeeFirstName, username);

//        CommonEvents.clickButton(addEmployeeBtn);
    }

    public void clickDeleteEmpl() {
        CommonEvents.clickButton(delEmployee);


    }

    public void clickAddEmplBtn() {

//        CommonEvents.clickButton(addEmployeeBtn);
        // addEmployeeBtn.submit();
        CommonEvents.pressEnterKey(addEmployeeBtn);
    }

    public void editEmployee(List<List<String>> list) {
        String newLastName = list.get(0).get(0);

        CommonEvents.clickButton(editEmployeeBtn);
        addEmployeeLastName.clear();
        addEmployeeLastName.sendKeys(newLastName);

    }
}
