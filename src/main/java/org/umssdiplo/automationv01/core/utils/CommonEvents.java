package org.umssdiplo.automationv01.core.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

import java.util.List;

public class CommonEvents {

    /**
     * This method set text content to web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void setInputField(WebElement webElement, String content) {
//        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
        webElement.sendKeys(Keys.TAB);
    }

    public static void waitEvent() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    /**
     * This method perform a click action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(WebElement webElement) {
        //ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click in a non visible element in the UI.
     *
     * @param webElement the WebElement non visible in the UI.
     */
    public static void jsClickElement(WebElement webElement) {
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isVisible(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isPresent(WebElement webElement) {
        try {
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method perform a search in a WebElement list based on a content string parameter.
     *
     * @param elements is the WebElements lists.
     * @param content  is the content parameter.
     * @return the WebElement search result.
     */
    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * This method return the text content of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * This method get title of current page.
     *
     * @return title of the current page.
     */
    public static String getPageTitle() {
        return ManageDriver.getInstance().getWebDriver().getTitle();
    }

    /**
     * This method press enter key to web element.
     *
     * @param webElement is the WebElement.
     */
    public static void pressEnterKey(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    public static void selectElemet(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        Select drop = new Select(webElement);
        drop.selectByVisibleText(content);
    }


    public static void setDatePicker(WebElement accidentDate, String accidentDateData) {
        accidentDate.click();
        accidentDate.sendKeys(Keys.ARROW_LEFT);
        accidentDate.sendKeys(Keys.ARROW_LEFT);
        accidentDate.sendKeys(Keys.ARROW_LEFT);
        accidentDate.sendKeys(accidentDateData);
    }

    public static void setHourDate(WebElement accidentHr, String accidentHrData) {
        accidentHr.click();
        accidentHr.sendKeys(accidentHrData);
    }

    /*
    * 0=delete
    * 1=Update
    */

    public static void clickButtonList(List<WebElement> list, String name, int action) {
        boolean isNameExist = false;
        int i = 0;
        while (!isNameExist) {
            List<WebElement> cells = list.get(i).findElements(By.tagName("td"));
            isNameExist = cells.get(0).getText().contains(name);
            if (isNameExist)
                cells.get(7).findElements(By.cssSelector(" button.btn.btn-danger")).get(action).click();
            i=i+1;
        }
    }

    public static boolean isExist(List<WebElement> list,String name) {
        boolean isNameExist = false;
        int i = 0;
        while (!isNameExist) {
            List<WebElement> cells = list.get(i).findElements(By.tagName("td"));
            isNameExist = cells.get(0).getText().contains(name);
            i = i + 1;
        }
        return isNameExist;
    }
}
