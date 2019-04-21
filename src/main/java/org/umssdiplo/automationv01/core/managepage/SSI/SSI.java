package org.umssdiplo.automationv01.core.managepage.SSI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SSI extends BasePage {
    @FindBy(css = "li.dropdown:nth-child(2) > a")
    private WebElement workIntems;

    @FindBy(css = "li.dropdown:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
    private WebElement workIntemClasification;

    @FindBy(css = "li.dropdown:nth-child(3) > a:nth-child(1)")
    private WebElement emplyeeMenu;

    @FindBy(css = "li.dropdown:nth-child(3) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
    private WebElement emplyeeListMenu;

    public void selectworkItemClasification(){
        workIntems.click();
        workIntemClasification.click();
    }

    public void selectEmployeeList(){
        emplyeeMenu.click();
        emplyeeListMenu.click();
    }

}
