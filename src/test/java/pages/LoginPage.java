package pages;

import commons.DriverActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    DriverActions actions;

    public LoginPage(WebDriver driver) {
        actions = new DriverActions(driver);
    }

    // Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    // Actions
    public void enterUsername(String user) {
        actions.type(username, user);
    }

    public void enterPassword(String pass) {
        actions.type(password, pass);
    }

    public void clickLogin() {
        actions.click(loginBtn);
    }

    // Combined method (best practice)
    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}