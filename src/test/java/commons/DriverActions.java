package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class DriverActions {

	WebDriverWait wait;
	WebDriver driver;

	public DriverActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Click
	public void click(By locator) {
	    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	// Type
	public void type(By locator, String text) {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
	}

	// Get Text
	public String getText(By locator) {
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
	}

	// Check visibility
	public boolean isDisplayed(By locator) {
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
	}
	
	
}