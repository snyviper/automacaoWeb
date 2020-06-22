import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Selenium {
    //Criar instancia do driver do chrome
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setup(){
        //Setar as propriedades do chrome Driver
        System.setProperty("./src/main/resources/chromedriver","chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,100);
        //Abrir browser e acessar a URL
        driver.get("https://automacaocombatista.herokuapp.com");
        //Maximizando o Browser Windows
        //driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Começar Automação Web']")).click();
        //Maximizando o Browser Mac/Linux
        driver.manage().window().fullscreen();
    }

    @Test
    public void criarUsuario(){

        Random random = new Random();
        String email = random.nextInt(10000)+"@bootcamp.com.br";

        //Identificando um elemento e preenchendo o campo com um texto
        driver.findElement(By.xpath("//a[text()='Formulário']")).click();
        driver.findElement(By.xpath("//a[text()='Criar Usuários']")).click();
        driver.findElement(By.id("user_name")).sendKeys("Marcos");
        driver.findElement(By.id("user_lastname")).sendKeys("Barbosa");
        driver.findElement(By.id("user_email")).sendKeys(email);
        driver.findElement(By.id("user_address")).sendKeys("Avenida Trindade");
        driver.findElement(By.id("user_university")).sendKeys("Nenhuma");
        driver.findElement(By.id("user_profile")).sendKeys("Qa");
        driver.findElement(By.id("user_gender")).sendKeys("M");
        driver.findElement(By.id("user_age")).sendKeys("18");

        //Clicando no botao Criar
        driver.findElement(By.name("commit")).click();

        //Atribuindo o texto da mensagem na tela para a variável
        String mensagem = driver.findElement(By.xpath("//p[@id='notice']")).getText();

        //Validando se a mensagem que eu necessito está sendo exibida na tela
        Assertions.assertEquals("Usuário Criado com sucesso", mensagem);
    }

    @Test
    public void radioCheckBox(){

        driver.findElement(By.xpath("//a[text()='Busca de elementos']")).click();

        WebElement link = driver.findElement(By.xpath("//a[text()='Radio e Checkbox']"));
        wait.until(ExpectedConditions.visibilityOf(link));
        link.click();

    }

    @AfterAll
    public static void fecharBrowser(){
        //Fechando meu navagador
        driver.quit();
    }
}
