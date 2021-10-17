import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CaseTwo {
    WebDriver driver;

    public CaseTwo(WebDriver driver) {
        this.driver = driver;
    }

    public void integerInputCaseTwo() {
        driver.findElement(By.xpath("//div[@jsname='abcgof']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
    }
    public void checkCaseTwo() {
        String validFormula = driver.findElement(By.xpath("//span[@jsname='ubtiRe']")).getText();
        Assert.assertEquals(validFormula, "6 ÷ 0 =");

        String validAnswer = driver.findElement(By.xpath("//span[@jsname='VssY5c']")).getText();
        Assert.assertEquals(validAnswer, "Infinity");
    }
}
