package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.ConfirmOrderPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.OrderData;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;

public class ConfirmOrderFuncionalidade extends BaseTest{

    private ConfirmOrderPage confirmOrderPage;
    private SeleniumRobot seleniumRobot;

    public ConfirmOrderFuncionalidade(){
        this.confirmOrderPage = new ConfirmOrderPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void verifyBillingColumn(){
        seleniumRobot.esperaElementoSerClicavel(this.confirmOrderPage.getTxtBillingPhone());
        Assert.assertEquals("Phone: " + OrderData.getPhoneNumber(), this.confirmOrderPage.getTxtBillingPhone().getText());
        Assert.assertEquals(OrderData.getAddress(), this.confirmOrderPage.getTxtBillingAddress().getText());
        Assert.assertEquals(OrderData.getCountry(), this.confirmOrderPage.getTxtBillingCountry().getText());
    }

    public void verifyShippingColumn(){
        if(!OrderData.isPickUpInStore()){
            Assert.assertEquals("Phone: " + OrderData.getPhoneNumber(), this.confirmOrderPage.getTxtShippingPhone().getText());
            Assert.assertEquals(OrderData.getAddress(), this.confirmOrderPage.getTxtShippingAddress().getText());
            Assert.assertEquals(OrderData.getCountry(), this.confirmOrderPage.getTxtShippingCountry().getText());
        }
    }

    public void verifyPaymentMethod(){
        Assert.assertEquals(OrderData.getPaymentMethod(), this.confirmOrderPage.getTxtPaymentMethod().getText());
    }

    public void verifyShippingMethod(){
        Assert.assertEquals(OrderData.getShippingMethod(), this.confirmOrderPage.getTxtShippingMethod().getText());
    }

    public void verifyProducts(){
        this.seleniumRobot.esperaElementoSerClicavel(this.confirmOrderPage.getTxtProduct2Name());
        Assert.assertEquals(Products.getName1(), this.confirmOrderPage.getTxtProduct1Name().getText());
        Assert.assertEquals(Products.getName2(), this.confirmOrderPage.getTxtProduct2Name().getText());
        Assert.assertEquals(Products.getPrice1(), Float.parseFloat(this.confirmOrderPage.getTxtProduct1Price().getText()), 0.0049);
        Assert.assertEquals(Products.getPrice2(), Float.parseFloat(this.confirmOrderPage.getTxtProduct2Price().getText()), 0.0049);
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(this.confirmOrderPage.getTxtSubTotal().getText()), 0.0049);
    }

    public void confirmOrder(){
        this.confirmOrderPage.getBtnConfirmOrder().click();
    }

    public void verifySuccess(String textoSucesso){
        this.seleniumRobot.esperaElementoSerClicavel(this.confirmOrderPage.getTxtSuccess());
        Assert.assertEquals(textoSucesso, this.confirmOrderPage.getTxtSuccess().getText());
    }

}
