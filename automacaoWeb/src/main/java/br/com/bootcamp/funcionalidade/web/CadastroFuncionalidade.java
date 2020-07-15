package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
//import br.com.bootcamp.enums.Credentials;
import br.com.bootcamp.statics.Credentials;
import br.com.bootcamp.pages.web.CadastroPage;
import br.com.bootcamp.settings.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CadastroFuncionalidade extends BaseTest {

    private CadastroPage cadastroPage;
    private Faker faker;
    private SeleniumRobot seleniumRobot;

    public CadastroFuncionalidade() {
        this.cadastroPage = new CadastroPage(webDriver);
        this.faker = new Faker();
        this.seleniumRobot = new SeleniumRobot();
    }

    public void preencheDadosERegistra(){
        new Credentials(this.faker.internet().emailAddress(), this.faker.internet().password());
        wait.until(ExpectedConditions.elementToBeClickable(this.cadastroPage.getBtnRegister()));
        this.cadastroPage.getRbGenderM().click();
        this.cadastroPage.getTxtFirstName().sendKeys(this.faker.name().firstName());
        this.cadastroPage.getTxtLastName().sendKeys(this.faker.name().lastName());
        this.cadastroPage.getTxtEmail().sendKeys(Credentials.getEmail());
        this.cadastroPage.getTxtPassword().sendKeys(Credentials.getSenha());
        this.cadastroPage.getTxtConfirmPassword().sendKeys(Credentials.getSenha());
        this.cadastroPage.getBtnRegister().click();
    }

    public String retornaMensagem(){
       return this.seleniumRobot.pegarValorTexto(this.cadastroPage.getMsgResult());
    }

    public void voltarParaHomePage(){ this.cadastroPage.getImgHome().click(); }
}
