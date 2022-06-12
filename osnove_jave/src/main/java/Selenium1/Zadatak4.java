package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/login");
        driver.manage().window().maximize();

        driver
                .findElement(By.xpath("//input[contains(@id, 'userName')]"))
                .sendKeys("itbootcamp");


        driver
                .findElement(By.xpath("//input[contains(@placeholder, 'Password')]"))
                .sendKeys("ITBootcamp2021!");


        driver
                .findElement(By.xpath("//button[contains(@id, 'login')]"))
                .click();

        Thread.sleep(5000);


        List<WebElement> elements = driver.findElements(By.xpath("//button[contains(text(), 'Log out')]"));
        if (elements.size() > 0) {
            System.out.println("Element postoji");
        } else {
            System.out.println("Ne postoji");
        }
        driver
                .findElement(By.xpath("//button[contains(text(), 'Log out')]"))
                .click();

        driver.quit();

    }
}
