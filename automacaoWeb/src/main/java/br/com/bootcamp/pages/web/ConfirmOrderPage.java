package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage {

    public ConfirmOrderPage(WebDriver webDriver) { PageFactory.initElements(webDriver, this); }

    @FindBy(xpath = "//ul[@class='billing-info']/li[@class='phone']")
    private WebElement txtBillingPhone;

    @FindBy(xpath = "//ul[@class='billing-info']/li[@class='address1']")
    private WebElement txtBillingAddress;

    @FindBy(xpath = "//ul[@class='billing-info']/li[@class='city-state-zip']")
    private WebElement txtBillingCityZip;

    @FindBy(xpath = "//ul[@class='billing-info']/li[@class='country']")
    private WebElement txtBillingCountry;

    @FindBy(xpath = "//ul[@class='billing-info']/li[@class='payment-method']")
    private WebElement txtPaymentMethod;

    @FindBy(xpath = "//ul[@class='shipping-info']/li[@class='phone']")
    private WebElement txtShippingPhone;

    @FindBy(xpath = "//ul[@class='shipping-info']/li[@class='address1']")
    private WebElement txtShippingAddress;

    @FindBy(xpath = "//ul[@class='shipping-info']/li[@class='city-state-zip']")
    private WebElement txtShippingCityZip;

    @FindBy(xpath = "//ul[@class='shipping-info']/li[@class='country']")
    private WebElement txtShippingCountry;

    @FindBy(xpath = "//ul[@class='shipping-info']/li[@class='shipping-method']")
    private WebElement txtShippingMethod;

    @FindBy(xpath = "//table[@class='cart']/descendant::tr[2]/descendant::a[@class='product-name']")
    private WebElement txtProduct1Name;

    @FindBy(xpath = "//table[@class='cart']/descendant::tr[3]/descendant::a[@class='product-name']")
    private WebElement txtProduct2Name;

    @FindBy(xpath = "//table[@class='cart']/descendant::tr[2]/descendant::span[@class='product-unit-price']")
    private WebElement txtProduct1Price;

    @FindBy(xpath = "//table[@class='cart']/descendant::tr[3]/descendant::span[@class='product-unit-price']")
    private WebElement txtProduct2Price;

    @FindBy(xpath = "//table[@class='cart-total']/descendant::tr[1]/descendant::span[@class='product-price']")
    private WebElement txtSubTotal;

    @FindBy(xpath = "//table[@class='cart-total']/descendant::tr[2]/descendant::span[@class='product-price']")
    private WebElement txtFeeShipping;

    @FindBy(xpath = "//table[@class='cart-total']/descendant::tr[3]/descendant::span[@class='product-price']")
    private WebElement txtFeePaymentMethod;

    @FindBy(xpath = "//table[@class='cart-total']/descendant::tr[4]/descendant::span[@class='product-price']")
    private WebElement txtFeeTax;
    private final String txtFeeTaxXPath = "//table[@class='cart-total']/descendant::tr[4]/descendant::span[@class='product-price']";

    @FindBy(xpath = "//table[@class='cart-total']/descendant::strong")
    private WebElement txtTotal;

    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input")
    private WebElement btnConfirmOrder;

    @FindBy(xpath = "//*[text()='Your order has been successfully processed!']")
    private WebElement txtSuccess;

    public WebElement getTxtBillingPhone() { return txtBillingPhone; }

    public WebElement getTxtBillingAddress() { return txtBillingAddress; }

    public WebElement getTxtBillingCityZip() { return txtBillingCityZip; }

    public WebElement getTxtBillingCountry() { return txtBillingCountry; }

    public WebElement getTxtPaymentMethod() { return txtPaymentMethod; }

    public WebElement getTxtShippingPhone() { return txtShippingPhone; }

    public WebElement getTxtShippingAddress() { return txtShippingAddress; }

    public WebElement getTxtShippingCityZip() { return txtShippingCityZip; }

    public WebElement getTxtShippingCountry() { return txtShippingCountry; }

    public WebElement getTxtShippingMethod() { return txtShippingMethod; }

    public WebElement getTxtProduct1Name() { return txtProduct1Name; }

    public WebElement getTxtProduct2Name() { return txtProduct2Name; }

    public WebElement getTxtProduct1Price() { return txtProduct1Price; }

    public WebElement getTxtProduct2Price() { return txtProduct2Price; }

    public WebElement getTxtSubTotal() { return txtSubTotal; }

    public WebElement getTxtFeeShipping() { return txtFeeShipping; }

    public WebElement getTxtFeePaymentMethod() { return txtFeePaymentMethod; }

    public WebElement getTxtFeeTax() { return txtFeeTax; }

    public String getTxtFeeTaxXPath(){ return txtFeeTaxXPath; }

    public WebElement getTxtTotal() { return txtTotal; }

    public WebElement getBtnConfirmOrder() { return btnConfirmOrder; }

    public WebElement getTxtSuccess() { return txtSuccess; }
}
