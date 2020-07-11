package br.com.bootcamp.enums;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import br.com.bootcamp.interfaces.BrowserImp;

public enum Browser implements BrowserImp {
	CHROME {
		@Override
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			return new ChromeDriver(options);

		}

	};
}
