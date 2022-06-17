package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.NavPage;
import pages.ProductPage;

import java.time.Duration;

public abstract class BasicTest {
    protected WebDriver driver;
    protected String baseUrl = "https://cms.demo.katalon.com";
    protected NavPage navPage;
    protected ProductPage productPage;
    protected CartPage cartPage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cartPage = new CartPage(driver);
        productPage = new ProductPage(driver);
        navPage = new NavPage(driver);

    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
