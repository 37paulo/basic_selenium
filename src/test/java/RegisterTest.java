import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    WebDriver driver = new ChromeDriver();

    @Test
    public void register(){
     //   System.setProperty("chromedriver.driver.chrome","C:\\drivers\\chromedriver.exe");
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("first");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("test");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("automation@test.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("12345678910");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='Movies']")).click();
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//a[@class=\"ui-corner-all\" and text()=\"Portuguese\"]")).click();

    }

    @After
    public void close(){
        driver.quit();
    }
}
