package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.LoginFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	private LoginFuncionalidade loginFuncionalidade;
	private SeleniumRobot seleniumRobot;

	public LoginSteps() {
		this.loginFuncionalidade = new LoginFuncionalidade();
		this.seleniumRobot = new SeleniumRobot();
	}

	@E("^preencho os dados de login com Credentials$")
	public void preenchoOsDadosDeLoginComUsuário() {
		this.loginFuncionalidade.preencheCredenciais();
	}

	@Quando("^clico no botao Log in$")
	public void clicoEmLogIn() {
		this.loginFuncionalidade.clickLogIn();
	}
}