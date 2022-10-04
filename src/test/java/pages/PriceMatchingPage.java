package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PriceMatchingPage extends BasePage {

    public PriceMatchingPage(WebDriver driver) {
        super(driver);
    }

    public static final By TOTAL = By.xpath("//div[@class ='summary_total_label']");


    public String resultTotal() {
        return driver.findElement(TOTAL).getText();

    }

}
