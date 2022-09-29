package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BuyTest extends BaseTest {

    @Test
    public void buy1Product() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickAddToCartBackpack()
                .clickButtonCart();
        buyPage.clickButtonCheckout()
                .inputFirstName("test")
                .inputLastName("test")
                .inputZipCode("test")
                .clickButtonContinue()
                .clickButtonFinish();
        assertEquals(buyPage.textIsComplete(), "THANK YOU FOR YOUR ORDER");
    }

}
