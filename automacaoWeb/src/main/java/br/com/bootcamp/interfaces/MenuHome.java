package br.com.bootcamp.interfaces;

import br.com.bootcamp.pages.mobile.HomePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

public interface MenuHome {
    MobileElement getElement(HomePage menuHome);

}
