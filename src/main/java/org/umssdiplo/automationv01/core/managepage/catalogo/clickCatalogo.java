package org.umssdiplo.automationv01.core.managepage.catalogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class clickCatalogo extends BasePage {
    @FindBy(css = ".fa.fa-list.fa-lg")
    private WebElement catalogoButonHeader;

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
}
