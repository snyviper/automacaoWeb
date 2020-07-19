package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildComputerPage {

    public BuildComputerPage(WebDriver webDriver) { PageFactory.initElements(webDriver,this); }

    @FindBy(id = "product_attribute_72_5_18_52")
    private WebElement rdBtnProcessorSlow;

    @FindBy(id = "product_attribute_72_5_18_53")
    private WebElement rdBtnProcessorMedium;

    @FindBy(id = "product_attribute_72_5_18_65")
    private WebElement rdBtnProcessorFast;

    @FindBy(id = "product_attribute_72_6_19_91")
    private WebElement rdBtnRam8GB;

    @FindBy(id = "product_attribute_72_6_19_54")
    private WebElement rdBtnRam2GB;

    @FindBy(id = "product_attribute_72_6_19_55")
    private WebElement rdBtnRam4GB;

    @FindBy(id = "product_attribute_72_3_20_57")
    private WebElement rdBtnHdd320GB;

    @FindBy(id = "product_attribute_72_3_20_58")
    private WebElement rdBtnHdd400GB;

    @FindBy(id = "product_attribute_72_8_30_93")
    private WebElement ckBxImageViewer;

    @FindBy(id = "product_attribute_72_8_30_94")
    private WebElement ckBxOfficeSuite;

    @FindBy(id = "product_attribute_72_8_30_95")
    private WebElement ckBxOtherOfficeSuite;

    @FindBy(xpath = "//label[@for='product_attribute_72_5_18_53']")
    private WebElement txtProcessorMedium;

    @FindBy(xpath = "//label[@for='product_attribute_72_5_18_65']")
    private WebElement txtProcessorFast;

    @FindBy(xpath = "//label[@for='product_attribute_72_6_19_91']")
    private WebElement txtRam8GB;

    @FindBy(xpath = "//label[@for='product_attribute_72_6_19_55']")
    private WebElement txtRam4GB;

    @FindBy(xpath = "//label[@for='product_attribute_72_3_20_58']")
    private WebElement txtHdd400GB;

    @FindBy(xpath = "//label[@for='product_attribute_72_8_30_93']")
    private WebElement txtImageViewer;

    @FindBy(xpath = "//label[@for='product_attribute_72_8_30_94']")
    private WebElement txtOfficeSuite;

    @FindBy(xpath = "//label[@for='product_attribute_72_8_30_95']")
    private WebElement txtOtherOfficeSuite;

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement txtName;

    @FindBy(xpath = "//span[@itemprop='price']")
    private WebElement txtPrice;

    @FindBy(id = "add-to-cart-button-72")
    private WebElement btnAddToCart;

    @FindBy(className = "loading-image")
    private WebElement imgLoading;

    public WebElement getRdBtnProcessorSlow(){ return rdBtnProcessorSlow; }

    public WebElement getRdBtnProcessorMedium() { return rdBtnProcessorMedium; }

    public WebElement getRdBtnProcessorFast() { return rdBtnProcessorFast; }

    public WebElement getRdBtnRam8GB() { return rdBtnRam8GB; }

    public WebElement getRdBtnRam2GB() { return rdBtnRam2GB; }

    public WebElement getRdBtnRam4GB() { return rdBtnRam4GB; }

    public WebElement getRdBtnHdd320GB() { return rdBtnHdd320GB; }

    public WebElement getRdBtnHdd400GB() { return rdBtnHdd400GB; }

    public WebElement getCkBxImageViewer() { return ckBxImageViewer; }

    public WebElement getCkBxOfficeSuite() { return ckBxOfficeSuite; }

    public WebElement getCkBxOtherOfficeSuite() { return ckBxOtherOfficeSuite; }

    public WebElement getTxtProcessorMedium() { return txtProcessorMedium; }

    public WebElement getTxtProcessorFast() { return txtProcessorFast; }

    public WebElement getTxtRam8GB() { return txtRam8GB; }

    public WebElement getTxtRam4GB() { return txtRam4GB; }

    public WebElement getTxtHdd400GB() { return txtHdd400GB; }

    public WebElement getTxtImageViewer() { return txtImageViewer; }

    public WebElement getTxtOfficeSuite() { return txtOfficeSuite; }

    public WebElement getTxtOtherOfficeSuite() { return txtOtherOfficeSuite; }

    public WebElement getBtnAddToCart(){ return btnAddToCart; }

    public WebElement getTxtName() { return txtName; }

    public WebElement getTxtPrice() { return txtPrice; }

    public WebElement getImgLoading() { return imgLoading; }
}
