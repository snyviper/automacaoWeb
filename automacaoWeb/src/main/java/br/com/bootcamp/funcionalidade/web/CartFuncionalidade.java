package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.pages.web.CartPage;
import br.com.bootcamp.settings.BaseTest;
//import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.statics.Products;
import org.openqa.selenium.WebElement;

public class CartFuncionalidade extends BaseTest {

    private CartPage cartPage;

    public CartFuncionalidade(){ this.cartPage = new CartPage(webDriver); }

    public void aceitarEFazerCheckout(){
        this.cartPage.getChkBxTermsOfService().click();
        this.cartPage.getBtnCheckout().click();
    }

    public boolean compararPrecoTotal(){
        return Float.parseFloat(cartPage.getTxtSubTotal().getText()) == Products.getSubTotal();
    }

    public WebElement getTxtSubTotal(){
        return cartPage.getTxtSubTotal();
    }
}
