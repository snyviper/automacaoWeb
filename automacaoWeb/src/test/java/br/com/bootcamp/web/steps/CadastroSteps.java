package br.com.bootcamp.web.steps;

import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.CadastroFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class CadastroSteps {

    private SeleniumRobot seleniumRobot;
    private CadastroFuncionalidade cadastroFuncionalidade;

    public CadastroSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.cadastroFuncionalidade = new CadastroFuncionalidade();
    }

    @E("^realizo o cadastro do cliente$")
    public void realizoCadastroDoCliente() {
        this.cadastroFuncionalidade.preencheDadosERegistra();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\" na tela$")
    public void visualizoAMensagemNaTela(String mensagem){
        this.seleniumRobot.validaTexto(this.cadastroFuncionalidade.retornaMensagem(),mensagem);
    }
}
