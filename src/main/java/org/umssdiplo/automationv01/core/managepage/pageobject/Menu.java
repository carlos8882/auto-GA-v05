package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Menu extends BasePage {
     
    @FindBy(css = "#ssiga-navbar-collapse  ul ul li:nth-child(2)  a")
    private WebElement  accidents;


    @FindBy(css = "body app-root app-incident-list div button")
    private WebElement  incident;
    public void createIncident() {
        CommonEvents.clickButton(accidents);
        CommonEvents.clickButton(incident);
        waitImplicitTime();
    }




}
