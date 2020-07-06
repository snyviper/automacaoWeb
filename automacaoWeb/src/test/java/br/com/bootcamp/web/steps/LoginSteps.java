package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.LoginFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	private LoginFuncionalidade loginFuncionalidade;
	@SuppressWarnings("unused")
	private SeleniumRobot seleniumRobot;
	
	public LoginSteps() {
		this.loginFuncionalidade = new LoginFuncionalidade();
		this.seleniumRobot = new SeleniumRobot();
	}
    @Dado("^preencho os dados de login com usuario \"([^\"]*)\"$")
    public void preenchoOsDadosDeLoginComUsuário(String arg0) {
    	this.loginFuncionalidade.preencherCredenciais();
        
    }

    @Quando("^clico em \"([^\"]*)\"$")
    public void clicoEm(String arg0){
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }



}
