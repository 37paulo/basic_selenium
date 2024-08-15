package br.com.automation.web;

import br.com.automation.web.common.Common;
import br.com.automation.web.configuration.BaseTest;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegisterTest extends Common {

    Faker faker = new Faker();

    String name = faker.name().fullName();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String streetAddress = faker.address().fullAddress();
    String email = faker.internet().emailAddress();
    String phone = faker.phoneNumber().phoneNumber();

    @Test
    public void register(){
     //   System.setProperty("chromedriver.driver.chrome","C:\\drivers\\chromedriver.exe");
        super.acessPage("https://demo.automationtesting.in/Register.html");
        super.xpathSendKeys("//input[@placeholder='First Name']",firstName);

        super.xpathSendKeys("//input[@placeholder='Last Name']",lastName);
        super.xpathSendKeys("//textarea[@ng-model='Adress']",streetAddress);
        super.xpathSendKeys("//input[@type='email']",email);
        super.xpathSendKeys("//input[@type='tel']",phone);
        super.xpathClick("//input[@value='Male']");
        super.xpathClick("//input[@value='Movies']");
        super.scrollPage();
        super.idClick("msdd");
        super.xpathClick("//a[@class=\"ui-corner-all\" and text()=\"Portuguese\"]");
        super.selectId("Skills","Java");
        super.xpathClick("//span[@class=\"select2-selection select2-selection--single\"]");
        super.xpathSendKeys("//input[@class=\"select2-search__field\"]","Austra");
        super.xpathClick("//li[@class=\"select2-results__option select2-results__option--highlighted\"]");
        super.selectId("yearbox", "1985");
        super.selectXpath("//select[@placeholder=\"Month\"]","June");
        super.selectId("daybox", "26");
        super.idSendKeys("firstpassword", "123456");
        super.idSendKeys("secondpassword","123456");
        super.uploadFile("imagesrc","C:\\image\\testeIMG.jpg");

    }
    @After
    public void close(){
        driver.quit();
    }

}
