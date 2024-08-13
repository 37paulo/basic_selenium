import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

    WebDriver driver = new ChromeDriver();

    @Test
    public void register(){
     //   System.setProperty("chromedriver.driver.chrome","C:\\drivers\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("first");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("test");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("automation@test.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("12345678910");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='Movies']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0, 350);");
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//a[@class=\"ui-corner-all\" and text()=\"Portuguese\"]")).click();
        Select select = new Select(driver.findElement(By.id("Skills")));
        select.selectByValue("Java");
        driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("Austra");
        driver.findElement(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]")).click();
        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByValue("1985");
        Select month = new Select(driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")));
        month.selectByValue("June");
        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByValue("26");
        driver.findElement(By.id("firstpassword")).sendKeys("123456");
        driver.findElement(By.id("secondpassword")).sendKeys("123456");

    }
    @After
    public void close(){
        driver.quit();
    }

}
