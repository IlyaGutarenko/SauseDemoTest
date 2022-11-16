package utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public Logger log;

    public void onTestFailure(ITestResult result){
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        AllureUtils.takeScreenshot(driver);
        log.error(String.format("Test %s failure", result.getName()));
    }
}
