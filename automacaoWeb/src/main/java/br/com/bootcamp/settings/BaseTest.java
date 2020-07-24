package br.com.bootcamp.settings;

import br.com.bootcamp.interfaces.MobileApplicationImp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.bootcamp.interfaces.BrowserImp;

public class BaseTest {

	protected static AndroidDriver<MobileElement> mobileDriver;
	protected static WebDriver webDriver;
	protected static WebDriverWait wait;
	protected static SoftAssertions softly;
	protected static final float deltaFloat = 0.00001f;
	protected static final double deltaDouble = 0.000001;

	protected void initializeWebApplication(BrowserImp webApplication) {
		if (webDriver != null)
			webDriver.close();

		webDriver = webApplication.getDriver();
		webDriver.get("http://demowebshop.tricentis.com/");
		webDriver.manage().window().maximize();
		wait = new WebDriverWait(webDriver, 60);
		softly = new SoftAssertions();
	}

	protected void initializeMobileApplication(MobileApplicationImp mobileApplicationImp){
		mobileDriver = mobileApplicationImp.getDriver();
		wait = new WebDriverWait(mobileDriver, 60);
	}



	protected static void closeWeb() {
		webDriver.quit();
	}

	protected static void closeMobile() {
		mobileDriver.quit();
	}
}
