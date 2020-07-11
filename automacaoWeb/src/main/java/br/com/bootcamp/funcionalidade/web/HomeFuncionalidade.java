package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.pages.web.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest{
	
	@SuppressWarnings("unused")
	private HomePage homePage;
	
	public HomeFuncionalidade() {
		this.homePage = new HomePage(webDriver);
	}

}
