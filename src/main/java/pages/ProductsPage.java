package pages;

import commons.DriverActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    DriverActions actions;

    public ProductsPage(WebDriver driver) {
        actions = new DriverActions(driver);
    }

    // ===== UI Elements (Locators) =====
    By pageTitle = By.className("title");
    By firstProductAddBtn = By.name("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");

    // ===== Actions =====

    // Verify user is on Products page
    public boolean isOnProductsPage() {
        return actions.getText(pageTitle).equalsIgnoreCase("Products");
    }

    // Add first product to cart
    public void addFirstProductToCart() {
        actions.click(firstProductAddBtn);
    }

    // Go to cart page
    public void clickCart() {
        actions.click(cartIcon);
    }
}