package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.CartFuncionalidade;
import cucumber.api.java.pt.E;

public class CartSteps {
    private SeleniumRobot seleniumRobot;
    private CartFuncionalidade cartFuncionalidade;

    public CartSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.cartFuncionalidade = new CartFuncionalidade();
    }

    @E("^verifico se o subtotal esta correto$")
    public void verificoSubtotal(){
        cartFuncionalidade.compararPrecoTotal();
    }

    @E("^testo e aceito os termos de servico e faco checkout$")
    public void aceitoOsTermosEFacoCheckout(){
        cartFuncionalidade.testarTermsOfService();
        cartFuncionalidade.aceitarEFazerCheckout();
    }

}
