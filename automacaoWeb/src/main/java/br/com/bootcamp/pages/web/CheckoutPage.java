package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage(WebDriver webDriver) { PageFactory.initElements(webDriver, this); }

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement dpBxCountry;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement txtCity;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement txtAddress;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement txtZipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement txtPhoneNumber;

    @FindBy(xpath = "//div[@id='billing-buttons-container']/input")
    private WebElement btnContinueBilling;

    @FindBy(id = "PickUpInStore")
    private WebElement ckBxPickUpInStore;

    @FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
    private WebElement btnContinueShippingButtons;

    @FindBy(id = "shippingoption_0")
    private WebElement rdBxGround;

    @FindBy(id = "shippingoption_1")
    private WebElement rdBxNextDayAir;

    @FindBy(id = "shippingoption_2")
    private WebElement rdBx2ndDayAir;

    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/input")
    private WebElement btnContinueShippingMethods;

    @FindBy(id = "paymentmethod_0")
    private WebElement rdBxCash;

    @FindBy(id = "paymentmethod_1")
    private WebElement rdBxCheck;

    @FindBy(id = "paymentmethod_2")
    private WebElement rdBxCreditCard;

    @FindBy(id = "paymentmethod_3")
    private WebElement rdBxPurchaseOrder;

    @FindBy(xpath = "//div[@id='payment-method-buttons-container']/input")
    private WebElement btnContinuePaymentMethods;

    @FindBy(id = "CreditCardType")
    private WebElement dpBxCreditCard;

    @FindBy(id = "CardholderName")
    private WebElement txtCardHolderName;

    @FindBy(id = "CardNumber")
    private WebElement txtCardNumber;

    @FindBy(id = "ExpireMonth")
    private WebElement dpBxExpireMonth;

    @FindBy(id = "ExpireYear")
    private WebElement dpBxExpireYear;

    @FindBy(id = "CardCode")
    private WebElement txtCardCode;

    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/input")
    private WebElement btnContinuePaymentInfo;

    public WebElement getDpBxCountry(){ return dpBxCountry; }

    public WebElement getTxtCity(){ return txtCity; }

    public WebElement getTxtAddress(){ return txtAddress; }

    public WebElement getTxtZipCode(){ return txtZipCode; }

    public WebElement getTxtPhoneNumber() { return txtPhoneNumber; }

    public WebElement getBtnContinueBilling() { return btnContinueBilling; }

    public WebElement getCkBxPickUpInStore() { return ckBxPickUpInStore; }

    public WebElement getBtnContinueShippingButtons() { return btnContinueShippingButtons; }

    public WebElement getRdBxGround() { return rdBxGround; }

    public WebElement getRdBxNextDayAir() { return rdBxNextDayAir; }

    public WebElement getRdBx2ndDayAir() { return rdBx2ndDayAir; }

    public WebElement getBtnContinueShippingMethods() { return btnContinueShippingMethods; }

    public WebElement getRdBxCash() { return rdBxCash; }

    public WebElement getRdBxCheck() { return rdBxCheck; }

    public WebElement getRdBxCreditCard() { return rdBxCreditCard; }

    public WebElement getRdBxPurchaseOrder() { return rdBxPurchaseOrder; }

    public WebElement getBtnContinuePaymentMethods() { return btnContinuePaymentMethods; }

    public WebElement getDpBxCreditCard() { return dpBxCreditCard; }

    public WebElement getTxtCardHolderName() { return txtCardHolderName; }

    public WebElement getTxtCardNumber() { return txtCardNumber; }

    public WebElement getDpBxExpireMonth() { return dpBxExpireMonth; }

    public WebElement getDpBxExpireYear() { return dpBxExpireYear; }

    public WebElement getTxtCardCode() { return txtCardCode; }

    public WebElement getBtnContinuePaymentInfo() { return btnContinuePaymentInfo; }
}
