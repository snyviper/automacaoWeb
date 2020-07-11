package br.com.bootcamp.interfaces;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public interface MobileApplicationImp {
    AndroidDriver<MobileElement> getDriver();
}
