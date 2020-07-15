package br.com.bootcamp.funcionalidade.web;


//import br.com.bootcamp.enums.Credentials;
import br.com.bootcamp.statics.Credentials;
import br.com.bootcamp.pages.web.LoginPage;
import br.com.bootcamp.settings.BaseTest;

public class LoginFuncionalidade extends BaseTest {
	private LoginPage loginPage;

	public LoginFuncionalidade() {
		this.loginPage = new LoginPage(webDriver);
	}

	/*public void preencheCredenciais(String tipoUsuario){
		this.loginPage.getTxtEmail().sendKeys(Credentials.valueOf(tipoUsuario.toUpperCase()).usuarioCliente());
		this.loginPage.getTxtSenha().sendKeys(Credentials.valueOf(tipoUsuario.toUpperCase()).senhaCliente());
	}*/
	public void preencheCredenciais(){
		this.loginPage.getTxtEmail().sendKeys(Credentials.getEmail());
		this.loginPage.getTxtSenha().sendKeys(Credentials.getSenha());
	}

	public void clickLogIn(){
		this.loginPage.getBtnLogIn().click();
	}

}
