package org.umssdiplo.automationv01.core.managepage.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.input.Employee;
import org.umssdiplo.automationv01.core.input.Incident;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RegisterPopup extends BasePage {

    @FindBy(css = "#employeeId")
    private WebElement employee;

    @FindBy(css = "#accidentDateId")
    private WebElement accidentDate;

    @FindBy(css = "#accidentHrId")
    private WebElement  accidentHr;

    @FindBy(css = "#accidentDayId")
    private WebElement  accidentDay;

    @FindBy(css = "#incidentName")
    private WebElement incidentType;

    @FindBy(css = "#incidentAgent")
    private WebElement incidentAgent;

    @FindBy(css = "#affectedPartsId")
    private WebElement affectedParts;

    @FindBy(css = "#accidentSiteId")
    private WebElement accidentSite;

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

    public void selectEmployee(String name){
        CommonEvents.selectElemet(employee,name);
    }


    @FindBy(id = "employeeFirstNameId")
    private WebElement firstname;

    @FindBy(css = "#employeeLastNameId")
    private WebElement lastname;

    @FindBy(css = "#employeeCiId")
    private WebElement ci;

    @FindBy(css = "#employeeGenderId")
    private WebElement gender;



    public String dataEmployeed() {

     return firstname.getAttribute("value")+" "+lastname.getAttribute("value")+" "+ci.getAttribute("value")+" "+gender.getAttribute("value");
    }
}
