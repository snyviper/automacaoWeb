package automacaoWeb;

import java.util.Random;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	@Test
	public void criarUsuario() throws InterruptedException {
		Random random = new Random();
		String email = "mizael"+random.nextInt(1000)+"@yaman.com.br";
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automacaocombatista.herokuapp.com/users/new");
		
		driver.findElement(By.id("user_name")).sendKeys("Mizael");
		
		driver.findElement(By.id("user_lastname")).sendKeys("Bragatti");
		
		driver.findElement(By.id("user_email")).sendKeys(email);
		
		driver.findElement(By.id("user_address")).sendKeys("R. São Celso, 71");
		
		driver.findElement(By.id("user_university")).sendKeys("FIAP");
		
		driver.findElement(By.id("user_profile")).sendKeys("Engenheiro de Testes I");
		
		driver.findElement(By.id("user_gender")).sendKeys("Masculino");
		
		driver.findElement(By.id("user_age")).sendKeys("31");
		
		driver.findElement(By.xpath("//input[@name=\"commit\"]")).click();
		
		String mensagem = driver.findElement(By.id("notice")).getText();

		Assertions.assertEquals("Usuário Criado com sucesso", mensagem);
		//driver.quit();
	}
}
