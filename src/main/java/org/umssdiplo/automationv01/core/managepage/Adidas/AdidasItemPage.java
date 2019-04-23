package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class AdidasItemPage extends BasePage {

    @FindBy(css = "button[title='Elige tu talla']")
    private WebElement tallaDropdown;

    @FindBy(css = "button[aria-label='Añadir al carrito']")
    private WebElement addCarrito;

    @FindBy(css = "span[data-auto-id='add-to-bag-product-info-qty']")
    private WebElement itemCarritoCantidad;

    @FindBy(css = "a[data-auto-id='view-bag-desktop']")
    private WebElement itemCarritoVerCarrito;


    public void selectTalla(String talla){
        WebElement itemTalla = webDriver.findElement(By.cssSelector("button[title='" + talla +"']"));
        itemTalla.click();
    }

    public void clickTalla(){
        tallaDropdown.click();
    }

    public void clicAddCarrito(){
        addCarrito.click();
    }

    public String getItemCarritoCantidad(){
        return itemCarritoCantidad.getText();
    }

    public void clicVerCarrito(){
        itemCarritoVerCarrito.click();
    }
}
