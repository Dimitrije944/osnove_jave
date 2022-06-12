package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Katalog {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://cms.demo.katalon.com/my-account/");

        driver
                .findElement(By.xpath("//input[@name='rememberme']"))
                .click();

        driver.quit();
    }
}
