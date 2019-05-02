package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import javax.lang.model.element.Element;
import java.util.List;

public class TableAccident extends BasePage {

    @FindBy(css = ".table tbody:nth-child(2) tr:nth-child(1) > td")
    private List<WebElement> incidents;
    private RegisterPopup registerPopup;

    public String getFirstRowTable(){
      return  CommonEvents.getTextContent( incidents.get(0));
    }


}
