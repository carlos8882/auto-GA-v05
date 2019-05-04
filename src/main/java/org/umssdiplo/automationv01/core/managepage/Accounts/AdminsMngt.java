package org.umssdiplo.automationv01.core.managepage.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import java.util.List;


public class AdminsMngt extends BasePage {
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

    @FindBy(css = "tr.xcrud-row:nth-child(1)")
    private List<WebElement> adminsRow;

    @FindBy (css ="tr.xcrud-row:nth-child(2)")
    private List<WebElement> adminsSecRow;

    @FindBy (css = ".fa-edit")
    private WebElement editbtn;

    @FindBy (css= "i.fa.fa-times")
    private WebElement deletbtn;

    @FindBy (css =".xcrud-list > tbody:nth-child(2)")
    private List<WebElement> table;

    @FindBy (css = ".xcrud-search-toggle")
    private  WebElement searchbtn;

    @FindBy (css = "select.xcrud-data")
    private WebElement searchdrdwn;

    @FindBy (css = "input.xcrud-searchdata")
    private WebElement textField;

    @FindBy (css = ".btn-primary")
    private WebElement goBtn;

    @FindBy (css = "th.xcrud-column:nth-child(3)")
    private WebElement firstNameCol;

    @FindBy (css = "th.xcrud-column:nth-child(4)")
    private WebElement lastNameCol;

    @FindBy (css = "th.xcrud-column:nth-child(5)")
    private WebElement emailCol;

    @FindBy (css = "th.xcrud-column:nth-child(6)")
    private WebElement activeCol;

    public void addAdmin(){
        add.click();
    }

    public void fillfname(String data){
        fname.clear();
        fname.sendKeys(data);
    }
    public void filllname(String data){
        lname.sendKeys(data);
    }
    public void fillemail(String data){
        email.clear();
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

//    public String getLastNameEmployee(){
//        WebElement lastElement = adminsRow.get(adminsRow.size()-1);
//        List<WebElement> deleteButton = lastElement.findElements(By.cssSelector("td"));
//        String lname = deleteButton.get(1).getText();
//        return lname;
//    }

    public String getFirstNameEmployee(){
        WebElement listOfElement = adminsRow.get(0);
        List<WebElement> fname = listOfElement.findElements(By.cssSelector("td"));
        String fname1 = fname.get(2).getText();
        return fname1;
    }

    public String getFirstNameEmployee2(){
        WebElement listOfElement = adminsSecRow.get(0);
        List<WebElement> fname = listOfElement.findElements(By.cssSelector("td"));
        String fname2 = fname.get(2).getText();
        return fname2;
    }

    public String getLastNameEmployee(){
        WebElement listOfElement = adminsRow.get(0);
        List<WebElement> lname = listOfElement.findElements(By.cssSelector("td"));
        String name1 = lname.get(3).getText();
        return name1;
    }

    public String getEmailEmployee(){
        WebElement listOfElement = adminsRow.get(0);
        List<WebElement> gemail = listOfElement.findElements(By.cssSelector("td"));
        String email = gemail.get(4).getText();
        return email;
    }
    public Boolean getActiveEmployee(){
        WebElement listOfElement = adminsRow.get(0);
        List<WebElement> active = listOfElement.findElements(By.cssSelector("td"));
        Boolean active1 = active.get(5).isEnabled();
        return active1;
    }

    public void editclick(){
        editbtn.click();

    }
    public void deleteclck(){
        deletbtn.click();
        webDriver.switchTo().alert().accept();
    }
    public  void clickSearch(){
        searchbtn.click();
    }

    public  void clickDropdwn(){
        searchdrdwn.click();
    }

    public void putValue(String data){
        searchdrdwn.sendKeys(data);
    }

    public void fillTextField(String data){
        textField.click();
        textField.sendKeys(data);
    }

    public void clickGoBtn(){
        goBtn.click();
    }

    public void firstNameCol(){
        firstNameCol.click();
    }


}
