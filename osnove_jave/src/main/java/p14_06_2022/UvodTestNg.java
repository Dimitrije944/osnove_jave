package p14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class UvodTestNg {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://www.google.com/");
    }


    @Test(priority = 10)
    public void googleTitleTest() {
        Assert.assertTrue(driver.getTitle().contains("Google1"),
                "[ERROR] Page title does not contain 'Google1'");
//        Assert.assertEquals(
//                driver.getTitle(),
//                "Google",
//                "[ERROR] Page title is not valid.");
        String actualSearchType = driver.findElement(By.name("q")).getAttribute("type");

        Assert.assertEquals(
                actualSearchType,
                "text",
                "[ERROR] Input search is not type text.");

    }
    @Test(priority = 20)
    public void googleUrlTest() {

        if (driver.getCurrentUrl().contains("google.com")) {
            System.out.println("OK");
        } else {
            System.out.println("Nije ok.");
        }


    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AFTER METHOD");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
