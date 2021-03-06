package br.com.bootcamp.steps.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.CadastroFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class CadastroSteps {

    private CadastroFuncionalidade cadastroFuncionalidade;

    public CadastroSteps() { this.cadastroFuncionalidade = new CadastroFuncionalidade(); }

    @E("^realizo o cadastro do cliente$")
    public void realizoCadastroDoCliente() { cadastroFuncionalidade.preencheDadosERegistra(); }

    @Entao("^visualizo a mensagem \"([^\"]*)\" na tela$")
    public void visualizoAMensagemNaTela(String mensagem){ cadastroFuncionalidade.verificaMensagem(mensagem); }

    @E("^deslogo$")
    public void deslogo(){ SeleniumRobot.clicaBotaoPorTexto("Log out"); }

    @E("^volto para a home page$")
    public void voltoParaHomePage(){ cadastroFuncionalidade.voltarParaHomePage(); }
}
