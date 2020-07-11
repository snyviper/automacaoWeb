package br.com.bootcamp.enums;

import br.com.bootcamp.interfaces.MobileApplicationImp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Scanner;

public enum App implements MobileApplicationImp {

    APK_APPIUM {
        @Override
        public AndroidDriver<MobileElement> getDriver() {
                return getDriver(
                        "com.ctappium",
                        "com.ctappium.MainActivity");
        }
    };

    private AndroidDriver<MobileElement> driver;

    public AndroidDriver<MobileElement> getDriver(String appPackage, String appActivity) {
        try {
            driver = new AndroidDriver<MobileElement>(getCapabilities(appPackage, appActivity));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return driver;
    }


    public DesiredCapabilities getCapabilities(String appPackage, String appActivity) throws IOException {
        Scanner scanner = new Scanner(Runtime.getRuntime()
                .exec(new String[]{"/bin/bash", "-l", "-c", "adb get-serialno"}).getInputStream());
        String deviceSerialNumber = (scanner != null && scanner.hasNext() ? scanner.next() : "");
        scanner.close();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy Tab");
        capabilities.setCapability("platformName", MobilePlatform.ANDROID);
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("udid",deviceSerialNumber);
        capabilities.setCapability("appPackage",appPackage);
        capabilities.setCapability("appActivity",appActivity);
        capabilities.setCapability("autoGrantPermissions",true);
        capabilities.setCapability("newCommandTimeOut", 120);
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("systemPort", 8205);
        return capabilities;
    }
}
