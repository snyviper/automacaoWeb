package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.ConfirmOrderPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.OrderData;
import br.com.bootcamp.statics.Products;

public class ConfirmOrderFuncionalidade extends BaseTest{

    private ConfirmOrderPage confirmOrderPage;
    private SeleniumRobot seleniumRobot;

    public ConfirmOrderFuncionalidade(){
        this.confirmOrderPage = new ConfirmOrderPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public boolean verifyBillingColumn(){
        seleniumRobot.esperaElementoSerClicavel(this.confirmOrderPage.getTxtBillingPhone());
        return this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtBillingPhone().getText(), OrderData.getPhoneNumber()) &&
                this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtBillingAddress().getText(), OrderData.getAddress()) &&
                this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtBillingCountry().getText(), OrderData.getCountry());
    }

    public boolean verifyShippingColumn(){
        if(!OrderData.isPickUpInStore()){
            return this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtShippingPhone().getText(), OrderData.getPhoneNumber()) &&
                    this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtShippingAddress().getText(), OrderData.getAddress()) &&
                    this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtShippingCountry().getText(), OrderData.getCountry());
        }
        return true;
    }

    public boolean verifyPaymentMethod(){
        return this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtPaymentMethod().getText(), OrderData.getPaymentMethod());
    }

    public boolean verifyShippingMethod(){
        return this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtShippingMethod().getText(), OrderData.getShippingMethod());
    }

    public boolean verifyProducts(){
        this.seleniumRobot.esperaElementoSerClicavel(this.confirmOrderPage.getTxtProduct2Name());
        return this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtProduct1Name().getText(), Products.getName1()) &&
                this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtProduct2Name().getText(), Products.getName2()) &&
                Float.parseFloat(this.confirmOrderPage.getTxtProduct1Price().getText()) == Products.getPrice1() &&
                Float.parseFloat(this.confirmOrderPage.getTxtProduct2Price().getText()) == Products.getPrice2() &&
                Float.parseFloat(this.confirmOrderPage.getTxtSubTotal().getText()) == Products.getSubTotal();
    }

    public void confirmOrder(){
        this.confirmOrderPage.getBtnConfirmOrder().click();
    }

    public boolean verifySuccess(String textoSucesso){
        this.seleniumRobot.esperaElementoSerClicavel(this.confirmOrderPage.getTxtSuccess());
        return this.seleniumRobot.validaTexto(this.confirmOrderPage.getTxtSuccess().getText(), textoSucesso);
    }

}
