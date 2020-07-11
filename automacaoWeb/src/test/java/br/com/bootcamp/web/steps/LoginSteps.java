package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
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

	@E("^preencho os dados de login com usuário \"([^\"]*)\"$")
	public void preenchoOsDadosDeLoginComUsuário(String tipoUsuario) {
		this.loginFuncionalidade.preencheCredenciais(tipoUsuario);
	}

	@Quando("^clico em \"([^\"]*)\"$")
	public void clicoEm(String textoBotao) {
		this.seleniumRobot.clicaBotaoPorTexto(textoBotao);
	}
}