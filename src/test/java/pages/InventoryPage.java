package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage {

    public static final By PRODUCTS_TITLE = By.xpath("//span[text()='Products']");
    public static final By BUTTON_SIDE_MENU = By.id("react-burger-menu-btn");
    public static final By ALL_ITEMS = By.id("inventory_sidebar_link");
    public static final By ADD_TO_BACKPACK = By.id("add-to-cart-sauce-labs-backpack");
    public static final By ADD_TO_BIKE_LIGHT = By.id("add-to-cart-sauce-labs-bike-light");
    public static final By BUTTON_CART = By.id("shopping_cart_container");
    public static final By ELEMENT_LOGOUT = By.id("logout_sidebar_link");
    public static final By CART_ICON = By.xpath("//span[text()='1']");
    public static final By CART_ICON_NUMBER = By.xpath("//span[@class='shopping_cart_badge']");

//    public static final By BUTTON_PRODUCT_SORT = By.xpath("//span[@class='select_container']");
//    public static final By FILTER_ALPHABETICALLY = By.xpath("//span[text()='Name (A to Z)']");
//    public static final By FILTER_ALPHABETICALLY_REVERS = By.xpath("//span[text()='Name (Z to A)']");
//    public static final By PRODUCT_BACKPACK = By.xpath("//div[text()='Sauce Labs Backpack']");
//    public static final By PRODUCT_T_SHIRTS = By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']");


    public InventoryPage(WebDriver driver) {
        super(driver);
    }


    public InventoryPage clickLogout(){
        driver.findElement(ELEMENT_LOGOUT).click();
        return this;
    }

//-----------------------------------------------------------------------------элемент корзины

    public String cartIconNumber(){
       return driver.findElement(CART_ICON_NUMBER).getText();
    }


//------------------------------------------------------------------------------- Добавление товара

    public InventoryPage clickAddToCartBackpack(){
        driver.findElement(ADD_TO_BACKPACK).click();
        return this;
    }

    public InventoryPage clickAddToCartBikeLight(){
        driver.findElement(ADD_TO_BIKE_LIGHT).click();
        return this;
    }

    public InventoryPage clickButtonCart(){
        driver.findElement(BUTTON_CART).click();
        return this;
    }

//------------------------------------------------------------------------------ Боковое меню
    public boolean inventoryPageIsOpen() {
        return driver.findElement(PRODUCTS_TITLE).isDisplayed();
    }

    public InventoryPage clickButtonSideMenu() {
        driver.findElement(BUTTON_SIDE_MENU).click();
        return this;
    }

    public boolean elementAllItems() {
        return driver.findElement(ALL_ITEMS).isDisplayed();
    }

    public InventoryPage waitLoader() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ALL_ITEMS));
        return this;
    }

//-----------------------------------------------------------------сортировка

    //    public InventoryPage clickButtonProductSort(){
//        driver.findElement(BUTTON_PRODUCT_SORT).isSelected();
//        return this;
//    }
//    public InventoryPage clickSortAlphabetically(){
//        driver.findElement(FILTER_ALPHABETICALLY).click();
//        return this;
//    }
//    public boolean firstProductAlphabetically(){
//        return driver.findElement(PRODUCT_BACKPACK).isDisplayed();
//    }
//    public boolean lastProductAlphabetically(){
//        return driver.findElement(PRODUCT_T_SHIRTS).isDisplayed();
//    }


}
