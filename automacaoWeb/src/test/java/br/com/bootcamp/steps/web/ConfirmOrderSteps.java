package br.com.bootcamp.steps.web;

import br.com.bootcamp.funcionalidade.web.ConfirmOrderFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class ConfirmOrderSteps {

    private ConfirmOrderFuncionalidade confirmOrderFuncionalidade;

    public ConfirmOrderSteps() { this.confirmOrderFuncionalidade = new ConfirmOrderFuncionalidade(); }

    @E("^verifico o endereco e o metodo de pagamento e o metodo de entrega$")
    public void verificoEnderecoEPagamento(){
        confirmOrderFuncionalidade.verifyBillingColumn();
        confirmOrderFuncionalidade.verifyShippingColumn();
        confirmOrderFuncionalidade.verifyPaymentMethod();
        confirmOrderFuncionalidade.verifyShippingMethod();
    }

    @E("^verifico os produtos$")
    public void verificoOsProdutos(){ confirmOrderFuncionalidade.verifyProducts(); }

    @Entao("^clico em Continue para confirmar o pedido$")
    public void clicoEmContinueParaConfirmar(){ confirmOrderFuncionalidade.confirmOrder(); }

    @E("^visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoAMensagemNaTela(String mensagem){ this.confirmOrderFuncionalidade.verifySuccess(mensagem); }
}
