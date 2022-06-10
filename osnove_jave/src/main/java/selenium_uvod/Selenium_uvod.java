package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium_uvod {
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

        driver
                .findElement(By.xpath("//button[contains(text(), 'Log out')]"))
                .click();

        driver.quit();



    }

    }
