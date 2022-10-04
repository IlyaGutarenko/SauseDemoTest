package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PriceMatchingPage;

import static org.testng.Assert.*;

public class PriceMatchingTest extends BaseTest {

    @Test
    public void priceMatch1Product(){
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
                .clickButtonContinue();
        assertEquals(priceMatchingPage.resultTotal(), "Total: $32.39");
    }

    @Test
    public void priceMatch2Product(){
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickAddToCartBackpack()
                .clickAddToCartBikeLight()
                .clickButtonCart();
        buyPage.clickButtonCheckout()
                .inputFirstName("test")
                .inputLastName("test")
                .inputZipCode("test")
                .clickButtonContinue();
        assertEquals(priceMatchingPage.resultTotal(), "Total: $43.18");
    }
}
