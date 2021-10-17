import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CaseTree {
    WebDriver driver;

    public CaseTree(WebDriver driver) {
        this.driver = driver;
    }

    public void integerInputCaseTree() {
        driver.findElement(By.xpath("//div[@jsname='aN1RFf']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
    }
    public void checkCaseTree() {
        String validFormula = driver.findElement(By.xpath("//span[@jsname='ubtiRe']")).getText();
        Assert.assertEquals(validFormula, "sin() =");

        String validAnswer = driver.findElement(By.xpath("//span[@jsname='VssY5c']")).getText();
        Assert.assertEquals(validAnswer, "Error");
    }
}
