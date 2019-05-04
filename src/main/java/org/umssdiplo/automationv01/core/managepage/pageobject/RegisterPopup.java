package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.input.Employee;
import org.umssdiplo.automationv01.core.input.Incident;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class RegisterPopup extends BasePage {

    @FindBy(css = "#employeeId")
    private WebElement employee;

    @FindBy(css = "#accidentDateId")
    private WebElement accidentDate;

    @FindBy(css = "#accidentHrId")
    private WebElement  accidentHr;

    @FindBy(css = "#accidentDayId")
    private WebElement accidentDay;

    @FindBy(css = "#incidentName")
    private WebElement incidentType;

    @FindBy(css = "#incidentAgent")
    private WebElement incidentAgent;

    @FindBy(css = "#affectedPartsId")
    private WebElement affectedParts;

    @FindBy(css = "#accidentSiteId")
    private WebElement accidentSite;

    @FindBy(css = "#addIncidentTypeId")
    private WebElement addIncidentTypeButton;

    @FindBy(css = "#incidentTypeNameId")
    private WebElement incidentTypeNameField;

    @FindBy(css = "#incidentTypeDescriptionId")
    private WebElement incidentTypeDescriptionField;

    @FindBy(css = "#addIncidentAgentId")
    private WebElement addIncidentAgentButton;

    @FindBy(css = "#incidentAgentNameId")
    private WebElement incidentAgentNameIdField;

    @FindBy(css = "app-incident-type-add button[type='submit']")
    private WebElement createIncidentTypeButton;

    @FindBy(css = "app-incident-agent-add button[type='submit']")
    private WebElement createIncidentAgentButton;

    @FindBy(css = "body modal-container div div app-incident-add div div.modal-body form div:nth-child(7) div button.btn.btn-primary")
    private WebElement create;


   public void fillRegister(Employee employeed, Incident incidentd){
       String employed= employeed.getFirstName()+" "+employeed.getLastName()+" "+employeed.getCi();
       CommonEvents.selectElemet(employee,employed);
       CommonEvents.setDatePicker(accidentDate,incidentd.getAccidentDate());
       CommonEvents.setHourDate(accidentHr,incidentd.getAccidentHr());
       CommonEvents.selectElemet(accidentDay,incidentd.getAccidentDay());
       CommonEvents.selectElemet(incidentType,incidentd.getIncidentType());
       CommonEvents.selectElemet(incidentAgent,incidentd.getIncidentAgent());
       CommonEvents.setInputField(affectedParts,incidentd.getAffectedParts());
       CommonEvents.setInputField(accidentSite,incidentd.getAccidentSite());
       CommonEvents.clickButton(create);
   }

   public void clickAddIncidentType(){
       waitImplicitTime();
       addIncidentTypeButton.click();
       waitImplicitTime();
   }

   public void clickAddIncidentAgent(){
       waitImplicitTime();
       addIncidentAgentButton.click();
       waitImplicitTime();
   }

   public void fillIncidentType(String incidentTypeName, String incidentTypeDescription){
       incidentTypeNameField.sendKeys(incidentTypeName);
       incidentTypeDescriptionField.sendKeys(incidentTypeDescription);
       createIncidentTypeButton.click();
   }

   public void fillIncidentAgent(String incidentAgentName){
       incidentAgentNameIdField.sendKeys(incidentAgentName);
       createIncidentAgentButton.click();
   }

   public String getLastIncidentType(){
       waitImplicitTime();
       incidentType.click();
       List<WebElement> incidentTypeList = incidentType.findElements(By.cssSelector("option"));
       return incidentTypeList.get(incidentTypeList.size()-1).getText();
   }

    public String getLastIncidentAgent(){
        waitImplicitTime();
        incidentAgent.click();
        List<WebElement> incidentAgentList = incidentAgent.findElements(By.cssSelector("option"));
        return incidentAgentList.get(incidentAgentList.size()-1).getText();
    }

}
