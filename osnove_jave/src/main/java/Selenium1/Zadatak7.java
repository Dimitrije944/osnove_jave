package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        Select select = new Select(driver.findElement(By.name("_sacat")));
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("267");
        Thread.sleep(2000);
        select.selectByVisibleText("Business & Industrial");
        Thread.sleep(2000);
        driver.quit();

    }
}
