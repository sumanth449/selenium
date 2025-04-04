package base;

import factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        String browser = ConfigReader.getProperty("browser"); // Fetch browser from config
        driver = WebDriverFactory.getDriver(browser);
        driver.get(ConfigReader.getProperty("url")); // Open the application URL
    }

    @AfterMethod
    public void tearDown() {
        WebDriverFactory.quitDriver();
    }
}
