package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public static final By PRODUCT_1_IN_CART = By.xpath("//div[text()='Sauce Labs Backpack']");
    public static final By PRODUCT_2_IN_CART = By.xpath("//div[text()='Sauce Labs Bike Light']");



    public boolean Product1InCart() {
        return driver.findElement(PRODUCT_1_IN_CART).isDisplayed();
    }

    public boolean Product2InCart() {
        return driver.findElement(PRODUCT_2_IN_CART).isDisplayed();
    }


}
