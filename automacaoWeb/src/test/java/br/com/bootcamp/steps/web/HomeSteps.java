package br.com.bootcamp.steps.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.BuildComputerFuncionalidade;
import br.com.bootcamp.funcionalidade.web.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class HomeSteps {

    private HomeFuncionalidade homeFuncionalidade;
    private BuildComputerFuncionalidade buildComputerFuncionalidade;

    public HomeSteps() {
        this.homeFuncionalidade = new HomeFuncionalidade();
        this.buildComputerFuncionalidade = new BuildComputerFuncionalidade();
    }

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String textoBotao){ SeleniumRobot.clicaBotaoPorTexto(textoBotao); }

    @Entao("^visualizo a tela inicial com meu usuario logado$")
    public void visualizoATelaInicialComMeuUsuarioLogado() { SeleniumRobot.clicaBotaoPorTexto("Teste"); }

    @Entao("^visualizo o email na tela$")
    public void visualizoAMensagemNaTela(){ homeFuncionalidade.validarEmail(); }

    @E("^adiciono os itens$")
    public void AdicionoOsItens(){
        homeFuncionalidade.gravarSegundoItem();
        homeFuncionalidade.clicarNoSegundoItem();
        homeFuncionalidade.clicarNoTerceiroItem();
        buildComputerFuncionalidade.testarIncrementos();
        buildComputerFuncionalidade.gravarTerceiroItem();
        buildComputerFuncionalidade.addToCart();
    }

    @E("^clico em Go to cart$")
    public void clicoEmGoToCart(){ homeFuncionalidade.goToCart(); }
}
