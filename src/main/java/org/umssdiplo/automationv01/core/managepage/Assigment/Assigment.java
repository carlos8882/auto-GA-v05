package org.umssdiplo.automationv01.core.managepage.Assigment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Assigment extends BasePage {

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li:nth-child(5) > a")
    private WebElement menuAssigmentReport;

    public void clickMenuAssigment(){

        menuAssigmentReport.click();
    }

    @FindBy(css = "#ssiga-navbar-collapse > ul > ul > li.dropdown.open > ul > li:nth-child(2) > a")
    private  WebElement subMenuAssigmentReport;


    public void clickSubmenuAssigmentReport(){

        subMenuAssigmentReport.click();

    }

    @FindBy(xpath = "//*[@id=\"ssiga-navbar-collapse\"]/ul/ul/li[5]/ul/li[3]/a")
    private WebElement submenuReport;

    public void clickSubMenuReport(){

        submenuReport.click();
    }











}
