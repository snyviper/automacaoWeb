package br.com.bootcamp.mobile.steps;

import br.com.bootcamp.funcionalidade.mobile.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;

public class HomeSteps {

    private HomeFuncionalidade homeFuncionalidade;

    public HomeSteps() {
        this.homeFuncionalidade = new HomeFuncionalidade();
    }

    @Dado("^que toco na opção \"([^\"]*)\"$")
    public void queTocoNaOpção(String menu) {
        this.homeFuncionalidade.selecionaMenu(menu);

    }
}
