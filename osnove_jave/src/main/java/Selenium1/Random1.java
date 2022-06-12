package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Random1 {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",
            "src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

    Select select = new Select(driver.findElement(By.name("_sacat")));
    List<WebElement> options = select.getOptions();
    Random random = new Random();
    int randomIndex = random.nextInt(options.size());
        select.selectByIndex(randomIndex);
        Thread.sleep(2000);
    randomIndex = random.nextInt(options.size());
    String text = options.get(randomIndex).getText();
        select.selectByVisibleText(text);
        driver.quit();

    }

}
