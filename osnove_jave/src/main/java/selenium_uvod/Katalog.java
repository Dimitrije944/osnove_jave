package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Katalog {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cms.demo.katalon.com/");

        driver
                .findElement(By.xpath("//input[@name='s']"))
                .sendKeys("Flying Ninja");

        driver
                .findElement(By.xpath("//button[contains(@class, 'search-submit')]"))
                .click();
        Thread.sleep(5000);
        driver.quit();
    }
}
