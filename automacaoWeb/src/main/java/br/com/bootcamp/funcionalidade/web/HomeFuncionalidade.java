package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.pages.web.HomePage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.statics.Products;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFuncionalidade extends BaseTest{
	
	//@SuppressWarnings("unused")
	private SeleniumRobot seleniumRobot;
	private HomePage homePage;
	
	public HomeFuncionalidade() {
		this.homePage = new HomePage(webDriver);
		this.seleniumRobot = new SeleniumRobot();
	}

	public void gravarSegundoItem(){
		seleniumRobot.scrollAteOElementoJS(homePage.getTxtSecondProductPrice());
		new Products(homePage.getTxtSecondProductName().getText(),
				Float.parseFloat(homePage.getTxtSecondProductPrice().getText()));
	}
	public void clicarNoSegundoItem(){
		seleniumRobot.scrollAteOElementoJS(homePage.getBtnAddToCartSecondItem());
		homePage.getBtnAddToCartSecondItem().click();
	}

	public void gravarTerceiroItem(){
		seleniumRobot.scrollAteOElementoJS(homePage.getTxtThirdProductPrice());
		Products.addSecondProduct(homePage.getTxtThirdProductName().getText(),
				Float.parseFloat(homePage.getTxtThirdProductPrice().getText()));
	}
	public void clicarNoTerceiroItem(){
		seleniumRobot.scrollAteOElementoJS(homePage.getBtnAddToCartThirdItem());
		wait.until(ExpectedConditions.invisibilityOf(homePage.getImgLoading()));
		homePage.getBtnAddToCartThirdItem().click();
		seleniumRobot.esperaElementoSerClicavel(homePage.getRdBtnSlow());
		homePage.getRdBtnSlow().click();
		seleniumRobot.scrollAteOElementoJS(homePage.getBtnAddToCartSlow());
		homePage.getBtnAddToCartSlow().click();
	}
	public String getBtnEmail(){
		return homePage.getBtnEmail().getText();
	}

	public WebElement getBtnGoToCart(){
		return homePage.getBtnGoToCart();
	}
}
