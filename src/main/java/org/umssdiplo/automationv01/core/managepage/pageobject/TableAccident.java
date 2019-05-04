package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import javax.lang.model.element.Element;
import java.util.List;

public class TableAccident extends BasePage {

    @FindBy(css = ".table tbody:nth-child(2) tr")
    private List<WebElement> incidents;



    public String getFirstRowTable(){
      return  CommonEvents.getTextContent( incidents.get(0));
    }


    public boolean existOnList(String expected) {
        return CommonEvents.isExist(incidents,expected);
    }
}
