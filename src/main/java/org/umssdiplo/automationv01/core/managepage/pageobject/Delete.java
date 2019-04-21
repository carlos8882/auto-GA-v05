package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class Delete extends BasePage {

/**CommonEvents.clickButtonLis
 * action
 *0=delet
 * 1=edit
 */

    @FindBy(css = ".table  tbody:nth-child(2)  tr")
    private List<WebElement> list;


    public void deleteRow(String name) {
        CommonEvents.clickButtonList(list,name,0);
    }

    public boolean isExist(String name) {
      return   CommonEvents.isExist(list,name);
    }
}
