package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/modal-dialogs");

        driver
                .findElement(By.xpath("//button[contains(@class, 'mt-2 btn btn-primary')]"))
                .click();

        List<WebElement> elements = driver.findElements(By.xpath("//button[contains(@class, 'mt-2 btn btn-primary')]"));
        if (elements.size() > 0) {
            System.out.println("Element postoji");
        } else {
            System.out.println("Ne postoji");
        }
        driver.quit();
    }

}
