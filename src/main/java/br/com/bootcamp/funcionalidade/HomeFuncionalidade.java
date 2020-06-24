package br.com.bootcamp.funcionalidade;

import br.com.bootcamp.pages.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest {

    private HomePage home;

    public HomeFuncionalidade(){
        this.home = new HomePage(webDriver);
    }

}
