package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void inputValidLoginAndPass() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();

        assertTrue(inventoryPage.inventoryPageIsOpen());
    }

    @Test
    public void emptyLoginAndPassField() {
        loginPage.open()
                .clickLoginButton();

        assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void inputValidUsernameAndClickTheLoginButton() {
        loginPage.open()
                .inputLogin("standard_user")
                .clickLoginButton();

        assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required");
    }

    @Test
    public void inputValidPasswordAndClickTheLoginButton() {
        loginPage.open()
                .inputPassword("secret_sauce")
                .clickLoginButton();

        assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void inputBlockedLoginAndCorrectPassword() {
        loginPage.open()
                .inputLogin("locked_out_user")
                .inputPassword("secret_sauce")
                .clickLoginButton();

        assertEquals(loginPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void inputValidUsernameAndAnIncorrectPassword() {
        loginPage.open()
                .inputLogin("standard_user")
                .inputPassword("test")
                .clickLoginButton();

        assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }


}
