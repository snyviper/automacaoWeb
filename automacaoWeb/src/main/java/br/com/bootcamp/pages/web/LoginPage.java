package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver webDriver) { PageFactory.initElements(webDriver, this); }
	
	@FindBy(id="Email")
	private WebElement txtEmail;
	
	@FindBy(id="Senha")
	private WebElement txtSenha;

	@FindBy(className = "button-1 login-button")
	private WebElement btnLogIn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtSenha() {
		return txtSenha;
	}

	public WebElement getBtnLogIn() { return btnLogIn; }
}
