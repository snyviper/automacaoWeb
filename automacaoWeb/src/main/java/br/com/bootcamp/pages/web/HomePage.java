package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver webDriver) { PageFactory.initElements(webDriver, this); }

	@FindBy(xpath = "//a[@href='/customer/info' and text()!='My account']")
	private WebElement btnEmail;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']" +
			"/child::div[3]/descendant::h2[@class='product-title']/child::a")
	private WebElement txtSecondProductName;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']" +
			"/child::div[3]/descendant::span[@class='price actual-price']")
	private WebElement txtSecondProductPrice;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']" +
			"/child::div[3]/descendant::input[@value='Add to cart']")
	private WebElement btnAddToCartSecondItem;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']" +
			"/child::div[4]/descendant::h2[@class='product-title']/child::a")
	private WebElement txtThirdProductName;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']" +
			"/child::div[4]/descendant::span[@class='price actual-price']")
	private WebElement txtThirdProductPrice;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']" +
			"/child::div[4]/descendant::input[@value='Add to cart']")
	private WebElement btnAddToCartThirdItem;

	@FindBy(id = "product_attribute_72_5_18_52")
	private WebElement rdBtnSlow;

	@FindBy(id = "add-to-cart-button-72")
	private WebElement btnAddToCartSlow;

	@FindBy(xpath = "//input[@value='Go to cart']")
	private WebElement btnGoToCart;

	@FindBy(className = "loading-image")
	private WebElement imgLoading;

	public WebElement getBtnEmail(){ return btnEmail; }

	public WebElement getTxtSecondProductName(){ return txtSecondProductName; }

	public WebElement getTxtSecondProductPrice(){ return txtSecondProductPrice; }

	public WebElement getBtnAddToCartSecondItem(){ return btnAddToCartSecondItem; }

	public WebElement getTxtThirdProductName(){ return txtThirdProductName; }

	public WebElement getTxtThirdProductPrice(){ return txtThirdProductPrice; }

	public WebElement getBtnAddToCartThirdItem(){ return btnAddToCartThirdItem; }

	public WebElement getRdBtnSlow(){ return rdBtnSlow; }

	public WebElement getBtnAddToCartSlow(){ return btnAddToCartSlow; }

	public WebElement getBtnGoToCart(){ return btnGoToCart; }

	public WebElement getImgLoading(){ return imgLoading; }
}
