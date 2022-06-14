package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class Zadatak2 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",
                    "src/main/resources/chromedriver.exe");

            File slika = new File("src/main/resources/IT_IMG.jpg");


            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://crop-circle.imageonline.co/#circlecropresult");
            driver.manage().window().maximize();
            new Actions(driver)
                    .scrollToElement(driver.findElement(By.id("photobutton")))
                    .perform();

            driver.findElement(By.name("file")).sendKeys(slika.getAbsolutePath());

            Thread.sleep(2000);
            driver.quit();

        }



    }
