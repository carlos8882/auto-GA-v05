package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class AdidasCarritoPage extends BasePage {

    @FindBy(css = "div a.name")
    private WebElement titleText;

    @FindBy(css = ".ffSelectButton span")
    private WebElement quantityDropdown;

    @FindBy(css = ".totalcolumn .standartprice")
    private WebElement price;

    @FindBy(css = ".cart-products-payment_total .cart-widget-value")
    private WebElement totalPrice;

    public String getTitleText(String itemTitle){
        WebElement itemtitle = webDriver.findElement(By.cssSelector("a[title='" + itemTitle + "']"));
        String itemTitleText = itemtitle.getText();
        return itemTitleText;
    }

    public String getTitleText2(){
        return titleText.getText();
    }

    public String getQuantity(){
        return quantityDropdown.getText();
    }

    public String getPrice(){
        return price.getText();
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }


}
