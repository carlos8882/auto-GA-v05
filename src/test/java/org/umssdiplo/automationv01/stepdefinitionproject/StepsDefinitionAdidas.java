package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Adidas.AdidasCarritoPage;
import org.umssdiplo.automationv01.core.managepage.Adidas.AdidasItemPage;
import org.umssdiplo.automationv01.core.managepage.Adidas.AdidasPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdidas {
    private AdidasPage adidas;
    private AdidasItemPage adidasItem;
    private AdidasCarritoPage adidasCarrito;

    private String price;

    // load page
    @Given("^'Puma' page is loaded$")
    public void adidasPageIsLoaded() throws Throwable {
        adidas = LoadPage.loginPageAdidas();
        adidasItem = new AdidasItemPage();
        adidasCarrito = new AdidasCarritoPage();
    }

    // Select item
    @And("^click tenis > Futbol$")
    public void adidasClickFutbol() throws Throwable {
        adidas.menHolder();
        adidas.tenisClick();
    }

    @And("^click item \"([^\"]*)\"$")
    public void clickElement(String item) throws Throwable {
        price = adidas.getPriceItem(item);
        adidas.clickItem(item);
    }

    // item page
    @And("^select talla \"([^\"]*)\"$")
    public void selectTalla(String talla) throws Throwable {
        adidasItem.clickTalla();
        adidasItem.selectTalla(talla);
    }

    @And("^click add carrito$")
    public void clickAddCarrito() throws Throwable {
        adidasItem.clicAddCarrito();
    }

    @And("^verify cantidad \"([^\"]*)\"$")
    public void verifyCantidad(String cantidad) throws Throwable {
        String actualCantidad = adidasItem.getItemCarritoCantidad();
        Assert.assertTrue(actualCantidad.contains(cantidad));
    }

    @And("^clicks Ver Carrito$")
    public void clickVerCarrito() throws Throwable {
        adidasItem.clicVerCarrito();
    }

    @Then("^Verify title:\"([^\"]*)\", quantity: \"([^\"]*)\", price: \"([^\"]*)\" and total: \"([^\"]*)\"$")
    public void verifyCarritoItem(String title, String quantity, String standarPrice, String total) throws Throwable {
       String actualTitle = adidasCarrito.getTitleText(title);
       String actualTitle2 = adidasCarrito.getTitleText2();
       String actualQuantity = adidasCarrito.getQuantity();
       String actualPrice = adidasCarrito.getPrice();
       String actualTotalPrice = adidasCarrito.getTotalPrice();
       title = title.toUpperCase();

       Assert.assertTrue(title.equals(actualTitle));
       Assert.assertTrue(title.equals(actualTitle2));
       Assert.assertTrue(quantity.equals(actualQuantity));
       Assert.assertTrue(standarPrice.equals(actualPrice));
       Assert.assertTrue(total.equals(actualTotalPrice));
    }

}
