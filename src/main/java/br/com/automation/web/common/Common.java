package br.com.automation.web.common;

import br.com.automation.web.configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Common extends BaseTest {


    /**
     *
     * @param url insert page url
     */
    public void acessPage(String url){

        driver.get(url);
    }
    /**
     *
     * @param element
     * @param text
     */
    public void xpathSendKeys(String element, String text){
        driver.findElement(By.xpath(element)).sendKeys(text);
    }
    /**
     *
     * @param element
     */
    public void xpathClick(String element){
        driver.findElement(By.xpath(element)).click();
    }
    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0, 350);");
    }
    /**
     *
     * @param element
     */
    public void idClick(String element){
        driver.findElement(By.id(element)).click();
    }
    /**
     *
     * @param element
     */
    public void idSendKeys(String element, String value){
        driver.findElement(By.id(element)).sendKeys(value);
    }
    /**
     *
     * @param element
     * @param value
     */
    public void selectId(String element, String value){
        Select select = new Select(driver.findElement(By.id(element)));
        select.selectByValue(value);
    }
    /**
     *
     * @param element
     * @param value
     */
    public void selectXpath(String element, String value){
        Select select = new Select(driver.findElement(By.xpath(element)));
        select.selectByValue(value);
    }
    /**
     *
     * @param element
     * @param value
     */
    public void uploadFile(String element, String value){
        WebElement upload = driver.findElement(By.id(element));
        upload.sendKeys(value);
    }

}
