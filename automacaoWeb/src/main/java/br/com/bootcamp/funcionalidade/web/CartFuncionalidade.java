package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.CartPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartFuncionalidade extends BaseTest {

    private static final String funcionalidade = "Cart";
    private CartPage cartPage;

    private void softAssertString(String expected, String actual, String scope, String attribute){
        SeleniumRobot.softAssertString(expected, actual, funcionalidade, scope, attribute);
    }

    public CartFuncionalidade(){ this.cartPage = new CartPage(webDriver); }

    public void aceitarEFazerCheckout(){
        cartPage.getChkBxTermsOfService().click();
        cartPage.getBtnCheckout().click();
    }

    public void testarTermsOfService(){
        cartPage.getBtnCheckout().click();
        String scope = "Terms of service window";
        //wait.until(ExpectedConditions.visibilityOf(cartPage.getTxtTermsOfServiceTitle()));
        softAssertString("Terms of service",
                cartPage.getTxtTermsOfServiceTitle().getText(), scope, "Title");
        softAssertString("Please accept the terms of service before the next step.",
                cartPage.getTxtTermsOfServiceBody().getText(), scope, "Body");
        cartPage.getBtnCloseTermsOfService().click();
    }

    public void compararPrecoTotal(){
        wait.until(ExpectedConditions.and(ExpectedConditions.elementToBeClickable(cartPage.getTxtPriceProduct2()),
                ExpectedConditions.elementToBeClickable(cartPage.getTxtSubTotal())));
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(cartPage.getTxtSubTotal().getText()), deltaFloat);
    }
}
