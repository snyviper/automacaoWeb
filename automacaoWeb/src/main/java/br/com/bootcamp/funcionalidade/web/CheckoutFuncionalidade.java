package br.com.bootcamp.funcionalidade.web;


import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.CheckoutPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.OrderData;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        new OrderData("Brazil", faker.address().cityName(),faker.address().streetAddressNumber(),
                faker.address().zipCode(), faker.phoneNumber().phoneNumber());
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getDpBxCountry()));
        seleniumRobot.selecionaItemLista(checkoutPage.getDpBxCountry(), OrderData.getCountry());
        checkoutPage.getTxtCity().sendKeys(OrderData.getCity());
        checkoutPage.getTxtAddress().sendKeys(OrderData.getAddress());
        checkoutPage.getTxtZipCode().sendKeys(OrderData.getZipCode());
        checkoutPage.getTxtPhoneNumber().sendKeys(OrderData.getPhoneNumber());
        checkoutPage.getBtnContinueBilling().click();
    }

    public void testarPickUpInStoreEContinuar(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getCkBxPickUpInStore()));
        checkoutPage.getCkBxPickUpInStore().click();
        checkoutPage.getCkBxPickUpInStore().click();
        OrderData.setPickUpInStore(checkoutPage.getCkBxPickUpInStore().isSelected());
        checkoutPage.getBtnContinueShippingButtons().click();
    }

    public void testarShippingMethodEContinuar(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getRdBxNextDayAir()));
        checkoutPage.getRdBxNextDayAir().click();
        checkoutPage.getRdBx2ndDayAir().click();
        checkoutPage.getRdBxGround().click();

        if(checkoutPage.getRdBxGround().isSelected()){
            OrderData.setShippingMethod("Ground");
        }
        else if(checkoutPage.getRdBxNextDayAir().isSelected()){
            OrderData.setShippingMethod("Next Day Air");
        }
        else if(checkoutPage.getRdBx2ndDayAir().isSelected()){
            OrderData.setShippingMethod("2nd Day Air");
        }

        checkoutPage.getBtnContinueShippingMethods().click();
    }

    public void testarPaymentMethodEContinuar(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getRdBxCheck()));
        checkoutPage.getRdBxCheck().click();
        checkoutPage.getRdBxPurchaseOrder().click();
        checkoutPage.getRdBxCash().click();
        checkoutPage.getRdBxCreditCard().click();

        if(checkoutPage.getRdBxCash().isSelected()){
            OrderData.setPaymentMethod("Cash On Delivery (COD)");
        }
        else if(checkoutPage.getRdBxCheck().isSelected()){
            OrderData.setPaymentMethod("Check / Money Order");
        }
        else if(checkoutPage.getRdBxCreditCard().isSelected()){
            OrderData.setPaymentMethod("Credit Card");
        }
        else if(checkoutPage.getRdBxPurchaseOrder().isSelected()){
            OrderData.setPaymentMethod("Purchase Order");
        }

        this.checkoutPage.getBtnContinuePaymentMethods().click();
    }

    public void preencherPaymentInformationEContinuar(){
        if(OrderData.getPaymentMethod().equals("Credit Card")){
            wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getDpBxCreditCard()));
            seleniumRobot.selecionaItemLista(checkoutPage.getDpBxCreditCard(),1);
            checkoutPage.getTxtCardHolderName().sendKeys(faker.name().fullName());
            checkoutPage.getTxtCardNumber().sendKeys("1234567890123456789012");
            seleniumRobot.selecionaItemLista(checkoutPage.getDpBxExpireMonth(), 1);
            seleniumRobot.selecionaItemLista(checkoutPage.getDpBxExpireYear(), 2);
            checkoutPage.getTxtCardCode().sendKeys(faker.number().digits(4));
        }
        else{
            wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getBtnContinuePaymentInfo()));
        }
        checkoutPage.getBtnContinuePaymentInfo().click();
    }
}
