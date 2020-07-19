package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.pages.web.CartPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartFuncionalidade extends BaseTest {

    private CartPage cartPage;

    public CartFuncionalidade(){
        this.cartPage = new CartPage(webDriver);
    }

    public void aceitarEFazerCheckout(){
        cartPage.getChkBxTermsOfService().click();
        cartPage.getBtnCheckout().click();
    }

    public void testarTermsOfService(){
        cartPage.getBtnCheckout().click();
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.getBtnCloseTermsOfService()));
        cartPage.getBtnCloseTermsOfService().click();
    }

    public void compararPrecoTotal(){
        wait.until(ExpectedConditions.and(ExpectedConditions.elementToBeClickable(cartPage.getTxtPriceProduct2()),
                ExpectedConditions.elementToBeClickable(cartPage.getTxtSubTotal())));
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(cartPage.getTxtSubTotal().getText()), delta);
    }
}
