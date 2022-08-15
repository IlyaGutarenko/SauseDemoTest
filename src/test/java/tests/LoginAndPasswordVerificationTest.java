package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import static org.testng.Assert.*;

public class LoginAndPasswordVerificationTest extends BaseTest {

    @Test
    public void enteringTheCorrectUsernameAndPassword() {
        loginAndPasswordVerificationPage.openSauceDemo();
        loginAndPasswordVerificationPage.enteringTheCorrectLogin();
        loginAndPasswordVerificationPage.enteringTheCorrectPassword();
        loginAndPasswordVerificationPage.clickTheLoginButton();
        loginAndPasswordVerificationPage.textProduct();

        assertTrue(loginAndPasswordVerificationPage.textProduct());

    }

    @Test
    public void clickTheLoginButtonWithEmptyFields(){
        loginAndPasswordVerificationPage.openSauceDemo();
        loginAndPasswordVerificationPage.clickTheLoginButton();
        loginAndPasswordVerificationPage.authorisationError();

        assertEquals(loginAndPasswordVerificationPage.authorisationError(),"Epic sadface: Username is required", "Enter login");
    }

    @Test
    public void enterYourUsernameAndClickTheLoginButton () {
        loginAndPasswordVerificationPage.openSauceDemo();
        loginAndPasswordVerificationPage.enteringTheCorrectLogin();
        loginAndPasswordVerificationPage.clickTheLoginButton();
        loginAndPasswordVerificationPage.authorisationError();

        assertEquals(loginAndPasswordVerificationPage.authorisationError(), "Epic sadface: Password is required", "Enter password");
    }

    @Test
    public void enterYourPasswordAndClickTheLoginButton(){
        loginAndPasswordVerificationPage.openSauceDemo();
        loginAndPasswordVerificationPage.enteringTheCorrectPassword();
        loginAndPasswordVerificationPage.clickTheLoginButton();
        loginAndPasswordVerificationPage.authorisationError();

        assertEquals(loginAndPasswordVerificationPage.authorisationError(),"Epic sadface: Username is required", "Enter login");

    }

    @Test
    public void enterBlockedLoginAndCorrectPassword(){
        loginAndPasswordVerificationPage.openSauceDemo();
        loginAndPasswordVerificationPage.enteringTheBlockedLogin();
        loginAndPasswordVerificationPage.enteringTheCorrectPassword();
        loginAndPasswordVerificationPage.clickTheLoginButton();
        loginAndPasswordVerificationPage.authorisationError();

        assertEquals(loginAndPasswordVerificationPage.authorisationError(),"Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void enteringTheCorrectUsernameAndAnIncorrectPassword(){
        loginAndPasswordVerificationPage.openSauceDemo();
        loginAndPasswordVerificationPage.enteringTheCorrectLogin();
        loginAndPasswordVerificationPage.enteringAnIncorrectPassword();
        loginAndPasswordVerificationPage.clickTheLoginButton();
        loginAndPasswordVerificationPage.authorisationError();

        assertEquals(loginAndPasswordVerificationPage.authorisationError(), "Epic sadface: Username and password do not match any user in this service");
    }







}
