package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class HomeSteps {

        private SeleniumRobot seleniumRobot;

    public HomeSteps() {
        this.seleniumRobot = new SeleniumRobot();
    }

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String textoBotao){
        this.seleniumRobot.clicaBotaoPorTexto(textoBotao);
    }

    @Entao("^visualizo a tela inicial com meu usuario logado$")
    public void visualizoATelaInicialComMeuUsuarioLogado() {
        seleniumRobot.clicaBotaoPorTexto("Teste");
    }

}
