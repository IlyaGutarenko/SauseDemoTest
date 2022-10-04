package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CartTest extends BaseTest {

    @Test
    public void adding1ProductToCart() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickAddToCartBackpack()
                .clickButtonCart();

        assertTrue(cartPage.Product1InCart());
    }

    @Test
    public void adding2ProductToCart() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickAddToCartBackpack()
                .clickAddToCartBikeLight()
                .clickButtonCart();

        assertTrue(cartPage.Product1InCart() && cartPage.Product2InCart());
    }

    @Test
    public void adding1ItemToCartAndCheckCartIcon() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickAddToCartBackpack();

        assertEquals(inventoryPage.cartIconNumber(), "1");
    }

    @Test
    public void adding2ItemToCartAndCheckCartIcon() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickAddToCartBackpack()
                .clickAddToCartBikeLight();

        assertEquals(inventoryPage.cartIconNumber(), "2");

    }


}
