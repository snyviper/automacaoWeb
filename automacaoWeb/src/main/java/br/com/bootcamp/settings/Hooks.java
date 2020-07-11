package br.com.bootcamp.settings;

import br.com.bootcamp.enums.App;
import br.com.bootcamp.enums.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseTest{
	
	@Before(value = "@web")
	public void beforeWeb() {
		System.out.println("Iniciando Browser Web");
		initializeWebApplication(Browser.CHROME);
	}

	@Before(value = "@mobile")
	public void beforeMobile() {
		System.out.println("Iniciando Appium");
		initializeMobileApplication(App.APK_APPIUM);
	}

	@After(value = "@mobile")
	public void afterMobile() {
		System.out.println("Encerrando testes mobile");
		closeMobile();
	}

	@After(value = "@web")
	public void afterWeb() {
		System.out.println("Fechando Web");
		closeWeb();
	}

}
