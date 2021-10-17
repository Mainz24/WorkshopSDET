import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CaseOne {
    WebDriver driver;

    public CaseOne(WebDriver driver) {
        this.driver = driver;
    }

    public void integerInputCaseOne() {
        driver.findElement(By.xpath("//div[@jsname='j93WEe']")).click();
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        driver.findElement(By.xpath("//div[@jsname='qCp9A']")).click();
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
        driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
    }
    public void checkCaseOne() {
        String validFormula = driver.findElement(By.xpath("//span[@jsname='ubtiRe']")).getText();
        Assert.assertEquals(validFormula, "(1 + 2) × 3 - 40 ÷ 5 =");

        String validAnswer = driver.findElement(By.xpath("//span[@jsname='VssY5c']")).getText();
        Assert.assertEquals(validAnswer, "1");
    }
}

