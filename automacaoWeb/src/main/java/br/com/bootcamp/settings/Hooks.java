package br.com.bootcamp.settings;

import br.com.bootcamp.enums.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseTest{
	
	@Before(value = "@web")
	public void beforeWeb() {
		System.out.println("Iniciando Browser Web");
		initializeWebApplication(Browser.CHROME);
	}
	
	@After(value = "@web")
	public void afterWeb() {
		System.out.println("Fechando Web");
		closeWeb();
	}

}
