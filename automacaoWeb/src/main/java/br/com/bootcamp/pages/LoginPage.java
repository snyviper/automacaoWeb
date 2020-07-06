package br.com.bootcamp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id="Email")
	private WebElement txtEmail;
	
	@FindBy(id="Senha")
	private WebElement txtSenha;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtSenha() {
		return txtSenha;
	}
	
	
}
