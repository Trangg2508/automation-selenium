package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.utils.LocatorReader;


public class LoginPage extends BasePage {
    private final String locatorPath = "src/main/resources/locators/LoginPage.json";
    LocatorReader loginLocators = new LocatorReader(locatorPath);

    // Locators
//    private By usernameField = By.id("username");
//    private By passwordField = By.id("password");
//    private By submitButton = By.id("submit");

    private By usernameField = By.xpath(loginLocators.getLocator("usernameTextbox"));
    private By passwordField = By.xpath(loginLocators.getLocator("passwordTextbox"));
    private By submitButton = By.xpath(loginLocators.getLocator("loginButton"));

    // Constructor: nhận WebDriver từ BaseTest
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public void login(String username, String password) {
        input(usernameField, username);
        input(passwordField, password);
        click(submitButton);
    }
}
