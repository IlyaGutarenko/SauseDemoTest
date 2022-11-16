package utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public Logger log;

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test " + result.getName() + " success");
    }

    public void onStart(ITestContext context) {
        System.out.println("Test started");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test finished");
    }

    public void onTestFailure(ITestResult result){
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        AllureUtils.takeScreenshot(driver);
        log.error(String.format("Test %s failure", result.getName()));
    }
}
