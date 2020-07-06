package br.com.bootcamp.funcionalidade;

import br.com.bootcamp.pages.LoginPage;
import br.com.bootcamp.settings.BaseTest;

public class LoginFuncionalidade extends BaseTest{
	@SuppressWarnings("unused")
	private LoginPage loginPage;

	public LoginFuncionalidade() {
		this.loginPage = new LoginPage(webDriver);
	}

	public void preencherCredenciais() {
		
	}
	
	
}
