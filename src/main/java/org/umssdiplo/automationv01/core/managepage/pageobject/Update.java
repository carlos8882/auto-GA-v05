package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.input.Employee;
import org.umssdiplo.automationv01.core.input.Incident;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class Update extends BasePage {
    @FindBy(css = ".table  tbody:nth-child(2)  tr")
    private List<WebElement> list;

    @FindBy(css = "#employeeId")
    private WebElement employee;

    @FindBy(css = "body modal-container div div app-incident-add div div.modal-body form div:nth-child(7) div button.btn.btn-primary")
    private WebElement update;


    public void updateRegister(String nameActual,String nameUpdate){
      CommonEvents.clickButtonList(list,nameActual,1);
      CommonEvents.selectElemet(employee,nameUpdate);
      CommonEvents.clickButton(update);
    }

    public boolean isExist(String nameUpdate) {
        return   CommonEvents.isExist(list,nameUpdate);
    }
}
