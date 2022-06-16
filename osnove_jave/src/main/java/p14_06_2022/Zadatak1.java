package p14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Zadatak1 {
    private WebDriver driver;
    private String baseUrl = "https://cms.demo.katalon.com";

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
        driver.get(baseUrl);
    }

    @Test (priority = 10)
    public void visitLoginPageFromNavBar() {
//        //*[contins(text(), 'MY ACCOUNT')]
        driver.findElement(By.linkText("MY ACCOUNT")).click();
        Assert.assertEquals(
                driver.getTitle(),
                "My account – Katalon Shop",
                "Page title does not contain 'My account – Katalon Shop'");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/my-account"),
                "Url does not contain '/my-account'");

    }

    @Test (priority = 20)
    public void checkInputTypes() {
        driver.get(baseUrl + "/my-account");

        Assert.assertEquals(
                driver.findElement(By.id("username")).getAttribute("type"),
                "text",
                "Email input does not have valid type.");


        Assert.assertEquals(
                driver.findElement(By.id("password")).getAttribute("type"),
                "password",
                "Password input does not have valid type.");


        Assert.assertEquals(
                driver.findElement(By.id("rememberme")).getAttribute("type"),
                "checkbox",
                "Remember me checkbox does not have valid type.");

        Assert.assertFalse(
                driver.findElement(By.id("rememberme")).isSelected(),
                "Remeber me checkbox should be unchecked.");



    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
