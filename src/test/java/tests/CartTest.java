package tests;

import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void adding1ProductToCart(){
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();
        inventoryPage.clickAddToCartBackpack()
                .clickButtonCart();

    }

}
