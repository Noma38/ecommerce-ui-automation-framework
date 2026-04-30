package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;


@Listeners(utils.ExtentListener.class)

public class EcommerceFlowTest extends BaseTest {

    @Test
    public void addToCartFlow() {

        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Step 2: Verify Products page
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue(productsPage.isOnProductsPage(), "Not on Products page");

        // Step 3: Add product to cart
        productsPage.addFirstProductToCart();

        // Step 4: Go to cart
        productsPage.clickCart();

        // Step 5: Verify item in cart
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isItemDisplayedInCart(), "Item not found in cart");
    }
}