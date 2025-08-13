package web.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.pages.LoginPage;
import web.utils.ConfigReader;
import web.utils.LocatorReader;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;
    private LocatorReader loginLocator = new LocatorReader("src/main/resources/locators/LoginPage.json");

    @BeforeMethod
    public void pageSetup() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );
//        loginPage.waitForElementVisible(By.xpath(loginLocator.getLocator("welcomeText")));
//        String actualText = driver.findElement(By.xpath(loginLocator.getLocator("welcomeText"))).getText();
//        Assert.assertEquals(actualText,"Logged In Successfully");
    }

}
