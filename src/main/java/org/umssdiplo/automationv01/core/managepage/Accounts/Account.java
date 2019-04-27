package org.umssdiplo.automationv01.core.managepage.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;

public class Account extends BasePage {
    @FindBy(css = " .add_button button")
    private WebElement add;

    @FindBy (name = "fname")
    private WebElement fname;

    @FindBy (name = "lname")
    private WebElement lname;

    @FindBy (name = "email")
    private WebElement email;

    @FindBy (name = "password")
    private WebElement password;

    @FindBy (name = "mobile")
    private WebElement mobile;

    @FindBy (css = ".select2-chosen")
    private WebElement country;

    @FindBy (css = ".select2-input")
    private WebElement setCountry;

    @FindBy (css=".select2-result-label")
    private WebElement selectedCountry;

    @FindBy (name = "address1")
    private WebElement address1;

    @FindBy (name = "address2")
    private WebElement address2;

    @FindBy (css = "button.btn:nth-child(4)")
    private WebElement submitbtn;

    @FindBy (name = ".col-md-12 > div:nth-child(1) > label:nth-child(1) > div:nth-child(1)")
    private WebElement chkSuscriber;

    @FindBy(css = ".table.table-striped  > tbody >tr")
    private List<WebElement> employeeRows;





    public void addAdmin(){
        add.click();
    }

    public void fillfname(String data){
        fname.sendKeys(data);
    }
    public void filllname(String data){
        lname.sendKeys(data);
    }
    public void fillemail(String data){
        email.sendKeys(data);
    }
    public void fillpassword(String data){
        password.sendKeys(data);
    }
    public void fillmobile(String data){
        mobile.sendKeys(data);
    }
    public void fillcountry(String data){
        country.click();
        setCountry.sendKeys(data);
        selectedCountry.click();
    }
    public void filladrress1(String data){
        address1.sendKeys(data);
    }
    public void filladrress2(String data){
        address2.sendKeys(data);
    }
    public void submitBtn(){
        hoverSubmitButton();
        CommonEvents.jsClickElement(submitbtn);
    }
    public void hoverSubmitButton(){
        mouseOver(submitbtn);
    }
    public void mouseOver(WebElement webElement){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement).build().perform();
    }
    public void clickchkSuscriber(){
        //
        mouseOver(chkSuscriber);
        CommonEvents.jsClickElement(chkSuscriber);
        chkSuscriber.click();
    }

    public String getLastNameEmployee(){
        WebElement lastElement = employeeRows.get(employeeRows.size()-1);
        List<WebElement> deleteButton = lastElement.findElements(By.cssSelector("td"));
        String name = deleteButton.get(1).getText();
        return name;
    }

    public String getFirstNameEmployee(){
        WebElement lastElement = employeeRows.get(0);
        List<WebElement> deleteButton = lastElement.findElements(By.cssSelector("td"));
        String name = deleteButton.get(1).getText();
        return name;
    }


}
