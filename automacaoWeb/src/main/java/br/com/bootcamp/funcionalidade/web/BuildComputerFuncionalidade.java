package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.BuildComputerPage;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.statics.Products;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class BuildComputerFuncionalidade extends BaseTest {

    private static final String funcionalidade = "Build Computer";
    private BuildComputerPage buildComputerPage;

    public BuildComputerFuncionalidade() { this.buildComputerPage = new BuildComputerPage(webDriver); }

    private float getPriceFromString(String value) {
        int st = 0;
        char[] val = value.toCharArray();    /* avoid getfield opcode */

        while ((st < value.length() - 1) && val[st] != '[') {
            st++;
        }
        return val[st] == '[' && val[value.length() - 1] == ']' ? Float.parseFloat(substring(value, st + 1, value.length() - 1)) : 0;
    }

    private void softAssertPrice(float expected, float actual, String attribute){
        SeleniumRobot.softAssertPrice(expected, actual, funcionalidade, attribute);
    }

    public void testarIncrementos(){
        wait.until(ExpectedConditions.elementToBeClickable(buildComputerPage.getTxtPrice()));
        final float price = Float.parseFloat(buildComputerPage.getTxtPrice().getText());
        softAssertPrice(price + getPriceFromString(buildComputerPage.getTxtProcessorMedium().getText()),
                Float.parseFloat(buildComputerPage.getTxtPrice().getText()), "medium processor");
        buildComputerPage.getRdBtnProcessorFast().click();
        softAssertPrice(price + getPriceFromString(buildComputerPage.getTxtProcessorFast().getText()),
                Float.parseFloat(buildComputerPage.getTxtPrice().getText()), "fast processor");
        buildComputerPage.getRdBtnProcessorSlow().click();
        buildComputerPage.getRdBtnRam8GB().click();
        softAssertPrice(price + getPriceFromString(buildComputerPage.getTxtRam8GB().getText()),
                Float.parseFloat(buildComputerPage.getTxtPrice().getText()), "8GB RAM");
        buildComputerPage.getRdBtnRam4GB().click();
        softAssertPrice(price + getPriceFromString(buildComputerPage.getTxtRam4GB().getText()),
                Float.parseFloat(buildComputerPage.getTxtPrice().getText()), "4GB RAM");
        buildComputerPage.getRdBtnRam2GB().click();
        buildComputerPage.getRdBtnHdd400GB().click();
        softAssertPrice(price + getPriceFromString(buildComputerPage.getTxtHdd400GB().getText()),
                Float.parseFloat(buildComputerPage.getTxtPrice().getText()), "400GB HD");
        buildComputerPage.getRdBtnProcessorFast().click();
        buildComputerPage.getRdBtnRam8GB().click();
        buildComputerPage.getCkBxImageViewer().click();
        buildComputerPage.getCkBxOfficeSuite().click();
        buildComputerPage.getCkBxOtherOfficeSuite().click();
        softAssertPrice(price + getPriceFromString(buildComputerPage.getTxtProcessorFast().getText()) +
                getPriceFromString(buildComputerPage.getTxtRam8GB().getText()) +
                getPriceFromString(buildComputerPage.getTxtHdd400GB().getText()) +
                getPriceFromString(buildComputerPage.getTxtImageViewer().getText()) +
                getPriceFromString(buildComputerPage.getTxtOfficeSuite().getText()) +
                getPriceFromString(buildComputerPage.getTxtOtherOfficeSuite().getText()),
                Float.parseFloat(buildComputerPage.getTxtPrice().getText()), "all increments");
        buildComputerPage.getRdBtnProcessorSlow().click();
        buildComputerPage.getRdBtnRam2GB().click();
        buildComputerPage.getRdBtnHdd320GB().click();
        buildComputerPage.getCkBxImageViewer().click();
        buildComputerPage.getCkBxOfficeSuite().click();
        buildComputerPage.getCkBxOtherOfficeSuite().click();
        softAssertPrice(price, Float.parseFloat(buildComputerPage.getTxtPrice().getText()), "no increments");
    }

    public void gravarTerceiroItem(){
        Products.addSecondProduct(buildComputerPage.getTxtName().getText(),
                Float.parseFloat(buildComputerPage.getTxtPrice().getText()));
    }

    public void addToCart(){
        buildComputerPage.getBtnAddToCart().click();
        wait.until(ExpectedConditions.invisibilityOf(buildComputerPage.getImgLoading()));
    }
}
