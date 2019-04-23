package org.umssdiplo.automationv01.core.managepage.Puma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import java.util.List;

public class Pumapage extends BasePage {

    @FindBy(css = "a[href='/hombre']")
    private WebElement hombewMenu;

    @FindBy(css = "a[href='/calzado_de_futbol-hombre']")
    private WebElement futbolOption;




    public void menHolder(){
        action.moveToElement(hombewMenu).perform();
    }

    public void tenisClick(){
        futbolOption.click();
    }

    private WebElement tenisElement(String elemet){
        String selector = "img[title='" + elemet +"'";
        WebElement tenisImage = webDriver.findElement(By.cssSelector(selector));
//        WebElement tenisPadre = webDriver.findElement(By.xpath(tenisImage.findElement()))
        return tenisImage;
    }


}
