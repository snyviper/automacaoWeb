package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.statics.Credentials;
import br.com.bootcamp.pages.web.CadastroPage;
import br.com.bootcamp.settings.BaseTest;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CadastroFuncionalidade extends BaseTest {

    private CadastroPage cadastroPage;
    private Faker faker;

    public CadastroFuncionalidade() {
        this.cadastroPage = new CadastroPage(webDriver);
        this.faker = new Faker();
    }

    public void preencheDadosERegistra(){
        Credentials.setCredentials(faker.internet().emailAddress(), faker.internet().password());
        wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getBtnRegister()));
        cadastroPage.getRbGenderM().click();
        cadastroPage.getTxtFirstName().sendKeys(faker.name().firstName());
        cadastroPage.getTxtLastName().sendKeys(faker.name().lastName());
        cadastroPage.getTxtEmail().sendKeys(Credentials.getEmail());
        cadastroPage.getTxtPassword().sendKeys(Credentials.getSenha());
        cadastroPage.getTxtConfirmPassword().sendKeys(Credentials.getSenha());
        cadastroPage.getBtnRegister().click();
    }

    public void verificaMensagem(String mensagem){ Assert.assertEquals(cadastroPage.getMsgResult(), mensagem); }

    public void voltarParaHomePage(){ cadastroPage.getImgHome().click(); }
}
