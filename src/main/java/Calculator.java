import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Calculator extends WebDriverSettings{

    @Test
    public void wholeNumber() {
        CaseOne caseOne = PageFactory.initElements(driver, CaseOne.class);
        caseOne.integerInputCaseOne();
        caseOne.checkCaseOne();
    }

    @Test
    public void divisionByZero() {
        CaseTwo caseTwo = PageFactory.initElements(driver, CaseTwo.class);
        caseTwo.integerInputCaseTwo();
        caseTwo.checkCaseTwo();
    }

    @Test
    public void lackOfMeaning() {
        CaseTree caseTree = PageFactory.initElements(driver, CaseTree.class);
        caseTree.integerInputCaseTree();
        caseTree.checkCaseTree();
    }
}

