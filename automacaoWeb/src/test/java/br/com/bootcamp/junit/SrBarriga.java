package br.com.bootcamp.junit;

import java.util.Random;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrBarriga {
	private static WebDriver driver = new ChromeDriver();

	@Test
	public void dropDownSelect() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver.get("https://srbarriga.herokuapp.com/login");
		driver.manage().window().maximize();
		Random r = new Random();
		String email = "" + r.nextInt(100);

		// Clica no botão para cadastro
		driver.findElement(By.xpath("//a[text()='Novo usuário?']")).click();

		// Clica e preenche os campos Nome, Email e Senha
		WebElement campoNome = driver.findElement(By.id("nome"));
		campoNome.click();
		campoNome.sendKeys("Mizael Bragatti do Nascimento");

		WebElement campoEmail = driver.findElement(By.id("email"));
		campoEmail.click();
		campoEmail.sendKeys("mizael.bragatti" + email + "@yaman.com.br");

		WebElement campoSenha = driver.findElement(By.id("senha"));
		campoSenha.click();
		campoSenha.sendKeys("yaman#123");

		// Clicar no botão Cadastrar
		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();

		// Clica no botão para cadastro
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		WebElement campoEmailLogin = driver.findElement(By.id("email"));
		campoEmailLogin.click();
		campoEmailLogin.sendKeys("mizael.bragatti" + email + "@yaman.com.br");

		WebElement campoSenhaLogin = driver.findElement(By.id("senha"));
		campoSenhaLogin.click();
		campoSenhaLogin.sendKeys("yaman#123");

		// Clicar no botão Cadastrar
		driver.findElement(By.xpath("//button[text()='Entrar']")).click();

//		
//		driver.quit();
//		

	}

}
