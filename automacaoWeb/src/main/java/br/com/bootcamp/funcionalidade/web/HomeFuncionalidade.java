package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.pages.web.HomePage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.Products;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFuncionalidade extends BaseTest {
	
	//@SuppressWarnings("unused")
	private HomePage homePage;
	
	public HomeFuncionalidade() {
		this.homePage = new HomePage(webDriver);
	}

	public void gravarSegundoItem(){
		new Products(homePage.getTxtSecondProductName().getText(),
				Float.parseFloat(homePage.getTxtSecondProductPrice().getText()));
	}
	public void clicarNoSegundoItem(){
		//wait.until(ExpectedConditions.invisibilityOf(homePage.getImgLoading()));
		homePage.getBtnAddToCartSecondItem().click();
	}

	public void clicarNoTerceiroItem(){
		wait.until(ExpectedConditions.invisibilityOf(homePage.getImgLoading()));
		homePage.getBtnAddToCartThirdItem().click();
	}
	public String getBtnEmail(){ return homePage.getBtnEmail().getText(); }

	public WebElement getBtnGoToCart(){
		return homePage.getBtnGoToCart();
	}
}
