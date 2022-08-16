package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    public static final By PRODUCTS_TITLE = By.xpath("//span[text()='Products']");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean inventoryPageIsOpen() {
        return driver.findElement(PRODUCTS_TITLE).isDisplayed();
    }


}
