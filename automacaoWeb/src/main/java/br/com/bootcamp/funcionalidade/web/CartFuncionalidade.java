package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.CartPage;
import br.com.bootcamp.settings.BaseTest;
//import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartFuncionalidade extends BaseTest {

    private CartPage cartPage;
    private SeleniumRobot seleniumRobot;

    public CartFuncionalidade(){
        this.cartPage = new CartPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
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
        seleniumRobot.forceSleep(250);
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(cartPage.getTxtSubTotal().getText()),0.0024);
    }

    public WebElement getTxtSubTotal(){
        return cartPage.getTxtSubTotal();
    }
}
