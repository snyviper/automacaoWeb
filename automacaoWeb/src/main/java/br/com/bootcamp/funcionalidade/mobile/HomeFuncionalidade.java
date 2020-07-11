package br.com.bootcamp.funcionalidade.mobile;

import br.com.bootcamp.enums.MenuHomeImp;
import br.com.bootcamp.interfaces.MenuHome;
import br.com.bootcamp.pages.mobile.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;

    public HomeFuncionalidade() {
        this.homePage = new HomePage(driver);
    }

    public void selecionaMenu(String menu){
        MenuHome opcao = MenuHomeImp.valueOf(menu.replace(" ", "_").toUpperCase());
        opcao.getElement(this.homePage).click();
    }
}
