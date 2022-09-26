package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyPage extends BasePage {

    public BuyPage(WebDriver driver) {
        super(driver);
    }

    public static final By CHECKOUT_BUTTON = By.id("checkout");

    public static final By FIRST_NAME = By.xpath("//input[@name='firstName']");
    public static final By LAST_NAME = By.xpath("//input[@name='lastName']");
    public static final By ZIP_POSTAL_CODE = By.xpath("//input[@name='postalCode']");
    public static final By CONTINUE_BUTTON = By.id("continue");

    public static final By FINISH_BUTTON = By.id("finish");

    public static final By TEXT_IS_COMPLETE = By.xpath("//h2[@class ='complete-header']");

    public BuyPage clickButtonCheckout() {
        driver.findElement(CHECKOUT_BUTTON).click();
        return this;
    }


    public BuyPage inputFirstName(String firstName) {
        driver.findElement(FIRST_NAME).sendKeys(firstName);
        return this;
    }

    public BuyPage inputLastName(String lastName) {
        driver.findElement(LAST_NAME).sendKeys(lastName);
        return this;
    }

    public BuyPage inputZipCode(String zipCode) {
        driver.findElement(ZIP_POSTAL_CODE).sendKeys(zipCode);
        return this;

    }

    public BuyPage clickButtonContinue() {
        driver.findElement(CONTINUE_BUTTON).click();
        return this;
    }

    public BuyPage clickButtonFinish() {
        driver.findElement(FINISH_BUTTON).click();
        return this;
    }

    public String textIsComplete() {
        return driver.findElement(TEXT_IS_COMPLETE).getText();
    }
}
