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
        action.moveToElement(hombewMenu);
    }

    public void tenisClick(){
        futbolOption.click();
    }

//    private WebElement tenisClick(String elemet){
//        String selector = "img[title='" + elemet +"'";
//
//    }


}
