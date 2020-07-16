package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.ConfirmOrderPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.OrderData;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmOrderFuncionalidade extends BaseTest{

    private ConfirmOrderPage confirmOrderPage;
    private SeleniumRobot seleniumRobot;

    public ConfirmOrderFuncionalidade(){
        this.confirmOrderPage = new ConfirmOrderPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void verifyBillingColumn(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderPage.getTxtBillingCityZip()));
        Assert.assertEquals(OrderData.getCity() + " , " + OrderData.getZipCode(), confirmOrderPage.getTxtBillingCityZip().getText());
        Assert.assertEquals("Phone: " + OrderData.getPhoneNumber(), confirmOrderPage.getTxtBillingPhone().getText());
        Assert.assertEquals(OrderData.getAddress(), confirmOrderPage.getTxtBillingAddress().getText());
        Assert.assertEquals(OrderData.getCountry(), confirmOrderPage.getTxtBillingCountry().getText());
    }

    public void verifyShippingColumn(){
        if(!OrderData.isPickUpInStore()){
            Assert.assertEquals(OrderData.getCity() + " , " + OrderData.getZipCode(), confirmOrderPage.getTxtShippingCityZip().getText());
            Assert.assertEquals("Phone: " + OrderData.getPhoneNumber(), confirmOrderPage.getTxtShippingPhone().getText());
            Assert.assertEquals(OrderData.getAddress(), confirmOrderPage.getTxtShippingAddress().getText());
            Assert.assertEquals(OrderData.getCountry(), confirmOrderPage.getTxtShippingCountry().getText());
        }
    }

    public void verifyPaymentMethod(){
        Assert.assertEquals(OrderData.getPaymentMethod(), confirmOrderPage.getTxtPaymentMethod().getText());
    }

    public void verifyShippingMethod(){
        Assert.assertEquals(OrderData.getShippingMethod(), confirmOrderPage.getTxtShippingMethod().getText());
    }

    public void verifyProducts(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderPage.getTxtProduct2Name()));
        Assert.assertEquals(Products.getName1(), confirmOrderPage.getTxtProduct1Name().getText());
        Assert.assertEquals(Products.getName2(), confirmOrderPage.getTxtProduct2Name().getText());
        Assert.assertEquals(Products.getPrice1(), Float.parseFloat(confirmOrderPage.getTxtProduct1Price().getText()), 0.0024);
        Assert.assertEquals(Products.getPrice2(), Float.parseFloat(confirmOrderPage.getTxtProduct2Price().getText()), 0.0024);
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(confirmOrderPage.getTxtSubTotal().getText()), 0.0024);
        if(webDriver.findElements(By.xpath(confirmOrderPage.getTxtFeeTaxXPath())).size() > 0){
            Assert.assertEquals(Float.parseFloat(confirmOrderPage.getTxtSubTotal().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeeShipping().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeePaymentMethod().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeeTax().getText()),
                    Float.parseFloat(confirmOrderPage.getTxtTotal().getText()),0.0024);
        }
        else{
            Assert.assertEquals(Float.parseFloat(confirmOrderPage.getTxtSubTotal().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeeShipping().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeePaymentMethod().getText()),
                    Float.parseFloat(confirmOrderPage.getTxtTotal().getText()),0.0024);
        }
    }

    public void confirmOrder(){ confirmOrderPage.getBtnConfirmOrder().click(); }

    public void verifySuccess(String textoSucesso){
        seleniumRobot.esperaElementoSerClicavel(confirmOrderPage.getTxtSuccess());
        Assert.assertEquals(textoSucesso, confirmOrderPage.getTxtSuccess().getText());
    }

}
