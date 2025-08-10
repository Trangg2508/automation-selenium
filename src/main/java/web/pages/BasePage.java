package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*Create a BasePage class to store common methods/ actions which can reusable (click, type, wait…).
All Page Object classes extend BasePage.
*/

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void input(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }
}

