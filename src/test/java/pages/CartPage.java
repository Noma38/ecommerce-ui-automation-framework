package pages;

import commons.DriverActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	DriverActions actions;

	public CartPage(WebDriver driver) {
		actions = new DriverActions(driver);
	}

	// UI Element
	By cartItem = By.className("cart_item");

	// Action
	public boolean isItemDisplayedInCart() {
		return actions.isDisplayed(cartItem);
	}
}