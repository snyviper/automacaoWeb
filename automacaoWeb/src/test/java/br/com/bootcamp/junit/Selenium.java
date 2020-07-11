package br.com.bootcamp.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Selenium {
	private static WebDriver driver = new ChromeDriver();
	private static WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		//driver.get("https://automacaocombatista.herokuapp.com/users/new");
		driver.get("https://automacaocombatista.herokuapp.com");
	}
	
	@Test
	public void criarUsuario() throws InterruptedException {
		driver.navigate().to("https://automacaocombatista.herokuapp.com/users/new");
		Random random = new Random();
		String email = "mizael"+random.nextInt(1000)+"@yaman.com.br";

		driver.findElement(By.id("user_name")).sendKeys("Mizael");

		driver.findElement(By.id("user_lastname")).sendKeys("Bragatti");

		driver.findElement(By.id("user_email")).sendKeys(email);

		driver.findElement(By.id("user_address")).sendKeys("R. S�o Celso, 71");

		driver.findElement(By.id("user_university")).sendKeys("FIAP");

		driver.findElement(By.id("user_profile")).sendKeys("Engenheiro de Testes I");

		driver.findElement(By.id("user_gender")).sendKeys("Masculino");

		driver.findElement(By.id("user_age")).sendKeys("31");

		driver.findElement(By.xpath("//input[@name=\"commit\"]")).click();

		String mensagem = driver.findElement(By.id("notice")).getText();

		assertEquals("Usu�rio Criado com sucesso", mensagem);
	}
	
	@Test
	public void radioCheckBox() {



		driver.findElement(By.xpath("//a[text()='Come�ar Automa��o Web']")).click();

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Busca de elementos']")).click();
		WebElement radio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Radio e Checkbox']")));
		radio.click();
		driver.findElement(By.xpath("//input[@id='red']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='yellow']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='purple']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='grey']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='black']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='white']/following-sibling::label")).click();
	}
	
	@Test
	public void dropDownSelect() {

		driver.findElement(By.xpath("//a[text()='Come�ar Automa��o Web']")).click();
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Busca de elementos']")).click();
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dropdown e Select']")));
		menu.click();
		
		driver.findElement(By.xpath("//label[text()='Desenho Favorito']/preceding-sibling::div[@class='select-wrapper']")).click();
		WebElement primeiroCombo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Naruto']")));
		primeiroCombo.click();
		
		WebElement segundoCombo1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Ronaldinho Gaucho']/ancestor::ul/preceding-sibling::input")));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", segundoCombo1);
		
		//segundoCombo1.click();
		WebElement segundoCombo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Ronaldinho Gaucho']")));
		segundoCombo.click();
		
		WebElement terceiroCombo1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Ronaldinho Gaucho']/ancestor::ul/preceding-sibling::input")));
		segundoCombo1.click();
		WebElement terceiroCombo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Ronaldinho Gaucho']")));
		segundoCombo.click();
		driver.findElement(By.xpath("//div[@class='select-wrapper']//following-sibling::ul/child::li/child::span[text()='Naruto']")).click();
		driver.findElement(By.xpath("//input[@id='yellow']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='purple']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='grey']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='black']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='white']/following-sibling::label")).click();
	}
	@After
	public void fecharBrowser() {
		driver.quit();
	}
	
}
