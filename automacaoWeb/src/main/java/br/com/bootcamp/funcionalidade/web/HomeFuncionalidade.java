package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.HomePage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.Credentials;
import br.com.bootcamp.statics.Products;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFuncionalidade extends BaseTest {
	
	//@SuppressWarnings("unused")
	private HomePage homePage;
	
	public HomeFuncionalidade() { this.homePage = new HomePage(webDriver); }

	public void gravarSegundoItem(){
		Products.addFirstProduct(homePage.getTxtSecondProductName().getText(),
				Float.parseFloat(homePage.getTxtSecondProductPrice().getText()));
	}
	public void clicarNoSegundoItem(){
		homePage.getBtnAddToCartSecondItem().click();
		wait.until(ExpectedConditions.invisibilityOf(homePage.getImgLoading()));
	}

	public void clicarNoTerceiroItem(){
		homePage.getBtnAddToCartThirdItem().click();
		//wait.until(ExpectedConditions.invisibilityOf(homePage.getImgLoading()));
	}

	public void validarEmail(){ Assert.assertEquals(homePage.getBtnEmail().getText(), Credentials.getEmail()); }

	public void goToCart(){
		SeleniumRobot.hoverMouseOver(homePage.getTxtShoppingCart());
		homePage.getBtnGoToCart().click();
	}
}
