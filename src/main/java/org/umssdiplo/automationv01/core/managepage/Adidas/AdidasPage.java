package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class AdidasPage extends BasePage {

    @FindBy(css = "a[href='/hombre']")
    private WebElement hombewMenu;

    @FindBy(css = "a[href='/calzado_de_futbol-hombre']")
    private WebElement futbolOption;

    public void menHolder(){
        waitImplicitTime();
        action.moveToElement(hombewMenu).perform();
    }

    public void tenisClick(){
        waitImplicitTime();
        futbolOption.click();
    }

    private WebElement getItemParent(String item){
        WebElement itemImage = webDriver.findElement(By.cssSelector("img[title='" + item +"']"));
        WebElement itemElement = itemImage.findElement(By.xpath("../../.."));
        return itemElement;
    }

    public String getPriceItem(String item){
        WebElement itemElement = getItemParent(item);
        WebElement priceItem = itemElement.findElement(By.cssSelector("div span.gl-price__value"));
        String price = priceItem.getText();
        return price;
    }

    public void clickItem(String item){
        WebElement itemElement = getItemParent(item);
        itemElement.click();
    }


}
