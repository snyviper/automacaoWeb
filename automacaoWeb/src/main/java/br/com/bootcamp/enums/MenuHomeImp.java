package br.com.bootcamp.enums;

import br.com.bootcamp.interfaces.MenuHome;
import br.com.bootcamp.pages.mobile.HomePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

public enum MenuHomeImp implements MenuHome {

    FORMULARIO {
        @Override
        public MobileElement getElement(HomePage menuHome) {
            return menuHome.getMenuFormulario();
        }

       },

    ABOUT {
        @Override
        public MobileElement getElement(HomePage menuHome) {
            return menuHome.getMenuAbout();
        }

    };
}
