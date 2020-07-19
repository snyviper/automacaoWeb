package br.com.bootcamp.steps.web;

import br.com.bootcamp.funcionalidade.web.LoginFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	private LoginFuncionalidade loginFuncionalidade;

	public LoginSteps() {
		this.loginFuncionalidade = new LoginFuncionalidade();
	}

	@E("^preencho os dados de login com Credentials$")
	public void preenchoOsDadosDeLoginComUsuário() { loginFuncionalidade.preencheCredenciais(); }

	@Quando("^clico no botao Log in$")
	public void clicoEmLogIn() { loginFuncionalidade.clickLogIn(); }
}