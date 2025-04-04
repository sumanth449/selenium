package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://www.amazon.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testuser@example.com");
        loginPage.enterPassword("password123");
        loginPage.clickLogin();
    }
}