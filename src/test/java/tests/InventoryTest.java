package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class InventoryTest extends BaseTest {

    @Test
    public void openSideMenu() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickButtonSideMenu();
        inventoryPage.waitLoader();
        waitForPageLoaded();

        assertTrue(inventoryPage.elementAllItems());
    }
}
