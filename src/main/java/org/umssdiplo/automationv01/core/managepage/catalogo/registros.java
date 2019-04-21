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

    @FindBy(name = "area")
    private WebElement areaField;

    @FindBy(name = "description")
    private WebElement descriptionField;

    @FindBy(name = "codigo")
    private WebElement codigoField;

    @FindBy(xpath = "//button[text()='Submitxx']")
    private WebElement btnArea;


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
}
