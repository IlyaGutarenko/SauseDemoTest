package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAndPasswordVerificationPage extends BasePage {


    String loginValid = "standard_user";
    String passwordValid = "secret_sauce";
    String xpathUsernameLocator = "//input[@placeholder='Username']";
    String xpathPasswordLocator = "//input[@placeholder='Password']";
    String buttonLoginLocator = "//input[@type='submit']";
    String productTextLocator = "//span[@class='title']";
    String errorTextLocator = "//div[@class='error-message-container error']";
    String loginBlocked = "locked_out_user";

    public LoginAndPasswordVerificationPage(WebDriver driver) {
        super(driver);
    }

    public void openSauceDemo() {
        driver.get(URL);
    }

    public void enteringTheCorrectLogin(){
        WebElement login = driver.findElement(By.xpath(xpathUsernameLocator));
        login.sendKeys(loginValid);
    }

    public void enteringTheBlockedLogin(){
        WebElement login = driver.findElement(By.xpath(xpathUsernameLocator));
        login.sendKeys(loginBlocked);
    }

    public void enteringTheCorrectPassword(){
        WebElement password = driver.findElement(By.xpath(xpathPasswordLocator));
        password.sendKeys(passwordValid);
    }

    public void clickTheLoginButton (){
        WebElement button = driver.findElement(By.xpath(buttonLoginLocator));
        button.click();
    }

    public boolean textProduct() {
        WebElement product = driver.findElement(By.xpath(productTextLocator));
        return product.isDisplayed();
    }

    public String authorisationError(){
        WebElement element = driver.findElement(By.xpath(errorTextLocator));
        return element.getText();
    }

    public void enteringAnIncorrectPassword(){
        WebElement password = driver.findElement(By.xpath(xpathPasswordLocator));
        password.sendKeys("test");
    }

}
