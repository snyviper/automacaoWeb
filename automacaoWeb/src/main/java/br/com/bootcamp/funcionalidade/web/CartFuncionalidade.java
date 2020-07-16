package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.CartPage;
import br.com.bootcamp.settings.BaseTest;
//import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Scanner;

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
        wait.until(ExpectedConditions.and(ExpectedConditions.elementToBeClickable(cartPage.getTxtPriceProduct2()),
                ExpectedConditions.elementToBeClickable(cartPage.getTxtSubTotal())));
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(cartPage.getTxtSubTotal().getText()),0.0024);
    }
}
