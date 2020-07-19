package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.pages.web.ConfirmOrderPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.OrderData;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmOrderFuncionalidade extends BaseTest {

    private ConfirmOrderPage confirmOrderPage;

    public ConfirmOrderFuncionalidade(){
        this.confirmOrderPage = new ConfirmOrderPage(webDriver);
    }

    private void softAssertString(String expected, String actual, String attribute){
        softly.assertThat(actual)
                .withFailMessage("Confirm Order -> " + attribute + "\nExpected: " + expected + "\nActual: " + actual)
                .isEqualTo(expected);
    }
    private void softAssertString(String expected, String actual, String scope, String attribute){
        softly.assertThat(actual)
                .withFailMessage("Confirm Order -> " + scope + " -> " + attribute + "\nExpected: " + expected + "\nActual: " + actual)
                .isEqualTo(expected);
    }

    public void verifyBillingColumn(){
        String scope = "Billing Column";
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderPage.getTxtBillingCityZip()));
        softAssertString(OrderData.getCity() + " , " + OrderData.getZipCode(),
                confirmOrderPage.getTxtBillingCityZip().getText(), scope, "City, Zip");
        //Assert.assertEquals(OrderData.getCity() + " , " + OrderData.getZipCode(), confirmOrderPage.getTxtBillingCityZip().getText());
        softAssertString("Phone: " + OrderData.getPhoneNumber(),
                confirmOrderPage.getTxtBillingPhone().getText(), scope, "Phone");
        //Assert.assertEquals("Phone: " + OrderData.getPhoneNumber(), confirmOrderPage.getTxtBillingPhone().getText());
        softAssertString(OrderData.getAddress(), confirmOrderPage.getTxtBillingAddress().getText(), scope, "Address");
        //Assert.assertEquals(OrderData.getAddress(), confirmOrderPage.getTxtBillingAddress().getText());
        softAssertString(OrderData.getCountry(), confirmOrderPage.getTxtBillingCountry().getText(), scope, "Country");
        //Assert.assertEquals(OrderData.getCountry(), confirmOrderPage.getTxtBillingCountry().getText());
    }

    public void verifyShippingColumn(){
        if(!OrderData.isPickUpInStore()){
            String scope = "Shipping Column";
            softAssertString(OrderData.getCity() + " , " + OrderData.getZipCode(),
                    confirmOrderPage.getTxtShippingCityZip().getText(), scope, "City, Zip");
            //Assert.assertEquals(OrderData.getCity() + " , " + OrderData.getZipCode(), confirmOrderPage.getTxtShippingCityZip().getText());
            softAssertString("Phone: " + OrderData.getPhoneNumber(),
                    confirmOrderPage.getTxtShippingPhone().getText(), scope, "Phone");
            //Assert.assertEquals("Phone: " + OrderData.getPhoneNumber(), confirmOrderPage.getTxtShippingPhone().getText());
            softAssertString(OrderData.getAddress(), confirmOrderPage.getTxtShippingAddress().getText(), scope, "Address");
            //Assert.assertEquals(OrderData.getAddress(), confirmOrderPage.getTxtShippingAddress().getText());
            softAssertString(OrderData.getCountry(), confirmOrderPage.getTxtShippingCountry().getText(), scope, "Country");
            //Assert.assertEquals(OrderData.getCountry(), confirmOrderPage.getTxtShippingCountry().getText());
        }
    }

    public void verifyPaymentMethod(){
        Assert.assertEquals(OrderData.getPaymentMethod(), confirmOrderPage.getTxtPaymentMethod().getText());
    }

    public void verifyShippingMethod(){
        softAssertString(OrderData.getShippingMethod(), confirmOrderPage.getTxtShippingMethod().getText(), "Shipping Method");
        //Assert.assertEquals(OrderData.getShippingMethod(), confirmOrderPage.getTxtShippingMethod().getText());
    }

    public void verifyProducts(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderPage.getTxtProduct2Name()));
        Assert.assertEquals(Products.getName1(), confirmOrderPage.getTxtProduct1Name().getText());
        Assert.assertEquals(Products.getName2(), confirmOrderPage.getTxtProduct2Name().getText());
        Assert.assertEquals(Products.getPrice1(), Float.parseFloat(confirmOrderPage.getTxtProduct1Price().getText()), delta);
        Assert.assertEquals(Products.getPrice2(), Float.parseFloat(confirmOrderPage.getTxtProduct2Price().getText()), delta);
        Assert.assertEquals(Products.getSubTotal(), Float.parseFloat(confirmOrderPage.getTxtSubTotal().getText()), delta);
        if(webDriver.findElements(By.xpath(confirmOrderPage.getTxtFeeTaxXPath())).size() > 0){
            Assert.assertEquals(Float.parseFloat(confirmOrderPage.getTxtSubTotal().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeeShipping().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeePaymentMethod().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeeTax().getText()),
                    Float.parseFloat(confirmOrderPage.getTxtTotal().getText()),delta);
        }
        else{
            Assert.assertEquals(Float.parseFloat(confirmOrderPage.getTxtSubTotal().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeeShipping().getText()) +
                            Float.parseFloat(confirmOrderPage.getTxtFeePaymentMethod().getText()),
                    Float.parseFloat(confirmOrderPage.getTxtTotal().getText()),delta);
        }
    }

    public void confirmOrder(){ confirmOrderPage.getBtnConfirmOrder().click(); }

    public void verifySuccess(String textoSucesso){
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderPage.getTxtSuccess()));
        softAssertString(textoSucesso, confirmOrderPage.getTxtSuccess().getText(), "Success text");
        Assert.assertEquals(textoSucesso, confirmOrderPage.getTxtSuccess().getText());
    }

}
