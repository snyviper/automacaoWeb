package br.com.bootcamp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//td[contains(text(),'MENU GERENTE')]")
    private WebElement btnMenuGerente;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getBtnMenuGerente() {
        return btnMenuGerente;
    }

}
