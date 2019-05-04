package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.input.Employee;
import org.umssdiplo.automationv01.core.input.Incident;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class Update extends BasePage {
    @FindBy(css = ".table tbody:nth-child(2) tr")
    private List<WebElement> list;

    @FindBy(css = "#employeeId")
    private WebElement employee;

    @FindBy(css = "body modal-container div div app-incident-add div div.modal-body form div:nth-child(7) div button.btn.btn-primary")
    private WebElement update;

    @FindBy(css = ".modal-dialog div:nth-child(1) app-incident-add:nth-child(1) div")
    private WebElement updatepopup;

    public void updateRegister(String nameActual,String nameUpdate){
      CommonEvents.clickButtonUpdate(list,nameActual);

    }

    public boolean isExistUpdatePopup() {
        return   CommonEvents.isPresent(updatepopup);
    }
}
