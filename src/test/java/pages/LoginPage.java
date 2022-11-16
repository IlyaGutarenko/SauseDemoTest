package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final By USERNAME_FIELD = By.xpath("//input[@placeholder='Username']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@placeholder='Password']");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.xpath("//h3[@data-test='error']");


    public LoginPage open() {
        driver.get(URL);
        return this;
    }

    public LoginPage inputLogin(String login) {
        driver.findElement(USERNAME_FIELD).sendKeys(login);
        return this;
    }

    public LoginPage inputPassword(String pass) {
        driver.findElement(PASSWORD_FIELD).sendKeys(pass);
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

    public String getErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public boolean buttonLogout() {
        return driver.findElement(LOGIN_BUTTON).isDisplayed();
    }


}
