import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    WebDriver driver;

    @BeforeMethod
    public void beginning() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DENIS\\Desktop\\tools\\chromedriver_94\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Калькулятор", Keys.ENTER);
    }

    @AfterMethod
    public void completion () {
        driver.quit();
    }
}
