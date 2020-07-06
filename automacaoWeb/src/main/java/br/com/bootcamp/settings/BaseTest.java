package br.com.bootcamp.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.bootcamp.interfaces.BrowserImp;

public class BaseTest {

	protected static WebDriver webDriver;
	protected static WebDriverWait wait;

	protected void initializeWebApplication(BrowserImp webApplication) {
		if (webDriver != null)
			webDriver.close();

		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://www.casasbahia.com.br/");
		wait = new WebDriverWait(webDriver, 60);

	}

	protected static void closeWeb() {
		webDriver.quit();
	}
}
