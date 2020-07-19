package br.com.bootcamp.steps.web;

import br.com.bootcamp.funcionalidade.web.CheckoutFuncionalidade;
import cucumber.api.java.pt.E;

public class CheckoutSteps {

    private CheckoutFuncionalidade checkoutFuncionalidade;

    public CheckoutSteps() {
        this.checkoutFuncionalidade = new CheckoutFuncionalidade();
    }

    @E("^preencho o endereco e continuo$")
    public void preenchoOEnderecoEContinuo(){
        checkoutFuncionalidade.preencherEnderecoEContinuar();
    }

    @E("^testo o pick up in store e continuo$")
    public void testoOPickUpEContinuo(){
        checkoutFuncionalidade.testarPickUpInStoreEContinuar();
    }

    @E("^testo o shipping method e continuo$")
    public void testoOShippingMethodEContinuo(){
        checkoutFuncionalidade.testarShippingMethodEContinuar();
    }

    @E("^testo o payment method e continuo$")
    public void testoOPaymentMethodEContinuo(){
        checkoutFuncionalidade.testarPaymentMethodEContinuar();
    }

    @E("^preencho o payment information e continuo$")
    public void preenchoOPaymentInformationEContinuo(){
        checkoutFuncionalidade.preencherPaymentInformationEContinuar();
    }
}
