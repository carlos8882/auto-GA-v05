package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.concurrent.TimeUnit;

/**
 * Class represent the base page
 *
 * @author <a href="mailto:luis.marcelo.garay@gmail.com">Marcelo Garay</a>
 * @version 1.0.0
 */
public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    /**
     * This method is the constructor class.
     */
    public BasePage() {
        webDriver = ManageDriver.getInstance().getWebDriver();
        webDriverWait = ManageDriver.getInstance().getWebDriverWait();
        PageFactory.initElements(webDriver, this);
    }

    public void alertOk(){
        webDriver.switchTo().alert().accept();
    }

    public void waitImplicitTime(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
