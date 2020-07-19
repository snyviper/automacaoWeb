package br.com.bootcamp.steps.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.BuildComputerFuncionalidade;
import br.com.bootcamp.statics.Credentials;
import br.com.bootcamp.funcionalidade.web.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class HomeSteps {

    private SeleniumRobot seleniumRobot;
    private HomeFuncionalidade homeFuncionalidade;
    private BuildComputerFuncionalidade buildComputerFuncionalidade;

    public HomeSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.homeFuncionalidade = new HomeFuncionalidade();
        this.buildComputerFuncionalidade = new BuildComputerFuncionalidade();
    }

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String textoBotao){
        this.seleniumRobot.clicaBotaoPorTexto(textoBotao);
    }

    @Entao("^visualizo a tela inicial com meu usuario logado$")
    public void visualizoATelaInicialComMeuUsuarioLogado() {
        seleniumRobot.clicaBotaoPorTexto("Teste");
    }

    @Entao("^visualizo o email na tela$")
    public void visualizoAMensagemNaTela(){
        seleniumRobot.validaTexto(homeFuncionalidade.getBtnEmail(), Credentials.getEmail());
    }

    @E("^adiciono os itens$")
    public void AdicionoOsItens(){
        homeFuncionalidade.gravarSegundoItem();
        homeFuncionalidade.clicarNoSegundoItem();
        homeFuncionalidade.clicarNoTerceiroItem();
        buildComputerFuncionalidade.testaIncrementos();
        buildComputerFuncionalidade.gravarTerceiroItem();
        buildComputerFuncionalidade.addToCart();
    }

    @E("^clico em Go to cart$")
    public void clicoEmGoToCart(){ seleniumRobot.clicaBotaoJS(homeFuncionalidade.getBtnGoToCart()); }
}
