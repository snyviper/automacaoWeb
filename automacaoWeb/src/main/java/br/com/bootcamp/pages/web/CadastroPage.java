package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

    public CadastroPage(WebDriver webDriver) { PageFactory.initElements(webDriver,this); }

    @FindBy(id = "gender-male")
    private WebElement rbGenderM;

    @FindBy(id = "FirstName")
    private WebElement txtFirstName;

    @FindBy(id = "LastName")
    private WebElement txtLastName;

    @FindBy(id = "Email")
    private WebElement txtEmail;

    @FindBy(id = "Password")
    private WebElement txtPassword;

    @FindBy(id = "ConfirmPassword")
    private WebElement txtConfirmPassword;

    @FindBy(id = "register-button")
    private WebElement btnRegister;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement msgResult;

    @FindBy(xpath = "//a[@href='/']")
    private WebElement imgHome;

    public WebElement getMsgResult() { return msgResult; }

    public WebElement getRbGenderM() { return rbGenderM; }

    public WebElement getTxtFirstName() { return txtFirstName; }

    public WebElement getTxtLastName() { return txtLastName; }

    public WebElement getTxtEmail() { return txtEmail; }

    public WebElement getTxtPassword() { return txtPassword; }

    public WebElement getTxtConfirmPassword() { return txtConfirmPassword; }

    public WebElement getBtnRegister() { return btnRegister; }

    public WebElement getImgHome() { return imgHome; }
}
