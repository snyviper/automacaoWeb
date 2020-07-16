package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.pages.web.CartPage;
import br.com.bootcamp.settings.BaseTest;
//import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CartFuncionalidade extends BaseTest {

    private CartPage cartPage;

    public CartFuncionalidade(){ this.cartPage = new CartPage(webDriver); }

    public void aceitarEFazerCheckout(){
        this.cartPage.getChkBxTermsOfService().click();
        this.cartPage.getBtnCheckout().click();
    }

    public void compararPrecoTotal(){
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(this.cartPage.getTxtSubTotal().getText()),0.0049);
    }

    public WebElement getTxtSubTotal(){
        return cartPage.getTxtSubTotal();
    }
}