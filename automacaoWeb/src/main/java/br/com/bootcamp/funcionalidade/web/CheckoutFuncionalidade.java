package br.com.bootcamp.funcionalidade.web;


import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.CheckoutPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.OrderData;
import com.github.javafaker.Faker;

public class CheckoutFuncionalidade extends BaseTest {

    private CheckoutPage checkoutPage;
    private SeleniumRobot seleniumRobot;
    private Faker faker;

    public CheckoutFuncionalidade(){
        this.checkoutPage = new CheckoutPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
        this.faker = new Faker();
    }

    public void preencherEnderecoEContinuar(){
        new OrderData("Brazil", this.faker.address().streetAddressNumber(), faker.phoneNumber().phoneNumber());
        seleniumRobot.esperaElementoSerClicavel(this.checkoutPage.getDpBxCountry());
        seleniumRobot.selecionaItemLista(this.checkoutPage.getDpBxCountry(), OrderData.getCountry());
        this.checkoutPage.getTxtCity().sendKeys(this.faker.address().cityName());
        this.checkoutPage.getTxtAddress().sendKeys(OrderData.getAddress());
        this.checkoutPage.getTxtZipCode().sendKeys(this.faker.address().zipCode());
        this.checkoutPage.getTxtPhoneNumber().sendKeys(OrderData.getPhoneNumber());
        this.checkoutPage.getBtnContinueBilling().click();
    }

    public void testarPickUpInStoreEContinuar(){
        this.seleniumRobot.esperaElementoSerClicavel(this.checkoutPage.getCkBxPickUpInStore());
        this.checkoutPage.getCkBxPickUpInStore().click();
        this.checkoutPage.getCkBxPickUpInStore().click();
        OrderData.setPickUpInStore(this.checkoutPage.getCkBxPickUpInStore().isSelected());
        this.checkoutPage.getBtnContinueShippingButtons().click();
    }

    public void testarShippingMethodEContinuar(){
        this.seleniumRobot.esperaElementoSerClicavel(this.checkoutPage.getRdBxNextDayAir());
        this.checkoutPage.getRdBxNextDayAir().click();
        this.checkoutPage.getRdBx2ndDayAir().click();
        this.checkoutPage.getRdBxGround().click();

        if(this.checkoutPage.getRdBxGround().isSelected()){
            OrderData.setShippingMethod("Ground");
        }
        else if(this.checkoutPage.getRdBxNextDayAir().isSelected()){
            OrderData.setShippingMethod("Next Day Air");
        }
        else if(this.checkoutPage.getRdBx2ndDayAir().isSelected()){
            OrderData.setShippingMethod("2nd Day Air");
        }

        this.checkoutPage.getBtnContinueShippingMethods().click();
    }

    public void testarPaymentMethodEContinuar(){
        this.seleniumRobot.esperaElementoSerClicavel(this.checkoutPage.getRdBxCheck());
        this.checkoutPage.getRdBxCheck().click();
        this.checkoutPage.getRdBxPurchaseOrder().click();
        this.checkoutPage.getRdBxCash().click();
        this.checkoutPage.getRdBxCreditCard().click();

        if(this.checkoutPage.getRdBxCash().isSelected()){
            OrderData.setPaymentMethod("Cash On Delivery (COD)");
        }
        else if(this.checkoutPage.getRdBxCheck().isSelected()){
            OrderData.setPaymentMethod("Check / Money Order");
        }
        else if(this.checkoutPage.getRdBxCreditCard().isSelected()){
            OrderData.setPaymentMethod("Credit Card");
        }
        else if(this.checkoutPage.getRdBxPurchaseOrder().isSelected()){
            OrderData.setPaymentMethod("Purchase Order");
        }

        this.checkoutPage.getBtnContinuePaymentMethods().click();
    }

    public void preencherPaymentInformationEContinuar(){
        if(OrderData.getPaymentMethod().equals("Credit Card")){
            this.seleniumRobot.esperaElementoSerClicavel(this.checkoutPage.getDpBxCreditCard());
            this.seleniumRobot.selecionaItemLista(this.checkoutPage.getDpBxCreditCard(),1);
            this.checkoutPage.getTxtCardHolderName().sendKeys(faker.name().fullName());
            this.checkoutPage.getTxtCardNumber().sendKeys("1234567890123456789012");
            this.seleniumRobot.selecionaItemLista(this.checkoutPage.getDpBxExpireMonth(), 1);
            this.seleniumRobot.selecionaItemLista(this.checkoutPage.getDpBxExpireYear(), 2);
            this.checkoutPage.getTxtCardCode().sendKeys(faker.number().digits(4));
        }
        else{
            this.seleniumRobot.esperaElementoSerClicavel(this.checkoutPage.getBtnContinuePaymentInfo());
        }
        this.checkoutPage.getBtnContinuePaymentInfo().click();
    }
}
