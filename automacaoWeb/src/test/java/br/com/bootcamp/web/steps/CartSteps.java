package br.com.bootcamp.web.steps;

//import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.CartFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class CartSteps {
    private SeleniumRobot seleniumRobot;
    private CartFuncionalidade cartFuncionalidade;

    public CartSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.cartFuncionalidade = new CartFuncionalidade();
    }

    @E("^verifico se o subtotal esta correto$")
    public void verificoSubtotal(){
        seleniumRobot.esperaElementoSerClicavel(cartFuncionalidade.getTxtSubTotal());
        cartFuncionalidade.compararPrecoTotal();
    }

    @E("^aceito os termos de servico e faco checkout$")
    public void aceitoOsTermosEFacoCheckout(){
        this.cartFuncionalidade.aceitarEFazerCheckout();
    }

}
