package br.com.bootcamp.steps.web;

import br.com.bootcamp.funcionalidade.web.CartFuncionalidade;
import cucumber.api.java.pt.E;

public class CartSteps {
    private CartFuncionalidade cartFuncionalidade;

    public CartSteps() { this.cartFuncionalidade = new CartFuncionalidade(); }

    @E("^verifico se o subtotal esta correto$")
    public void verificoSubtotal(){ cartFuncionalidade.compararPrecoTotal(); }

    @E("^testo e aceito os termos de servico e faco checkout$")
    public void aceitoOsTermosEFacoCheckout(){
        cartFuncionalidade.testarTermsOfService();
        cartFuncionalidade.aceitarEFazerCheckout();
    }

}
