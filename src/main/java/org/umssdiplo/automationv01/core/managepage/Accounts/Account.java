package org.umssdiplo.automationv01.core.managepage.Accounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Account extends BasePage {
    @FindBy(css = " .add_button button")
    private WebElement add;


    public void addAdmin(){
        add.click();
    }

//    @FindBy(name = "password")
//    private WebElement passwordInputField;
//
//    @FindBy(css = ".btn-primary.btn-block")
//    private WebElement loginBtn;

//    public void setCredentials() {
//        String username = PropertyAccessor.getInstance().getUser();
//        String password = PropertyAccessor.getInstance().getPassword();
//        usernameInputField.clear();
//        usernameInputField.sendKeys(username);
//        CommonEvents.setInputField(usernameInputField, username);
//        passwordInputField.clear();
//        passwordInputField.sendKeys(password);
//        CommonEvents.setInputField(passwordInputField, password);
//        CommonEvents.clickButton(loginBtn);
//    }
}
