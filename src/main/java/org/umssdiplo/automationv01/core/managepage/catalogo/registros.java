package org.umssdiplo.automationv01.core.managepage.catalogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class registros extends BasePage {

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[4]/a")
    private WebElement registroButonHeader;

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[4]/ul/li[2]/a")
    private WebElement registroClick;

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[4]/ul/li[3]/a")
    private WebElement registroListClick;

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[4]/ul/li[4]/a")
    private WebElement personalAreaListClick;

    @FindBy(name = "area")
    private WebElement areaField;

    @FindBy(name = "description")
    private WebElement descriptionField;

    @FindBy(name = "codigo")
    private WebElement codigoField;

    @FindBy(xpath = "//button[text()='Submitxx']")
    private WebElement btnArea;

    @FindBy(xpath = "/html/body/app-root/app-area-create/div/div/div[1]/table/tbody/tr[4]/td[4]/img[1]")
    private WebElement btnEdit;


    @FindBy(xpath = "/html/body/app-root/app-area-create/div/div/div[1]/table/tbody/tr[4]/td[4]/img[2]")
    private WebElement btnDel;

    @FindBy(xpath = "//*[@name='employeeTypeId']/option[@value='1']")
    private WebElement employeeIdField;

    public void editOption() {
        CommonEvents.clickButton(registroButonHeader);
        CommonEvents.clickButton(registroListClick);
        CommonEvents.clickButton(btnEdit);
    }

    public void editField(List<List<String>> list) {
        String areaActual = list.get(0).get(0);
        areaField.clear();
        areaField.sendKeys(areaActual);
        btnArea.click();
        //        CommonEvents.clickButton(btnArea);
    }


    public void clickButtonH(List<List<String>> list) {

        CommonEvents.clickButton(registroButonHeader);
        CommonEvents.clickButton(registroClick);

        String area = list.get(0).get(0);
        String description = list.get(0).get(1);
        String codigo = list.get(0).get(2);

        areaField.sendKeys(area);
        descriptionField.sendKeys(description);
        codigoField.sendKeys(codigo);

        CommonEvents.clickButton(btnArea);

    }

    public void delOption() {
        CommonEvents.clickButton(btnDel);
    }

    public void personalAreaPage() {
        CommonEvents.clickButton(registroButonHeader);
        CommonEvents.clickButton(personalAreaListClick);

    }

    public void completeEmployee() {
        employeeIdField.click();
    }
}
