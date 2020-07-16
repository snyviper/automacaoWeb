package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(WebDriver webDriver) { PageFactory.initElements(webDriver, this); }

    @FindBy(xpath = "//table[@class='cart-total']/descendant::tr[1]" +
            "/descendant::span[@class='product-price']")
    private WebElement txtSubTotal;

    @FindBy(id = "termsofservice")
    private WebElement chkBxTermsOfService;

    @FindBy(id = "checkout")
    private WebElement btnCheckout;

    public WebElement getTxtSubTotal(){ return txtSubTotal; }

    public WebElement getChkBxTermsOfService() { return chkBxTermsOfService; }

    public WebElement getBtnCheckout(){ return btnCheckout; }
}