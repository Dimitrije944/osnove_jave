package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        driver.get("https://www.file.io/");
        driver
                .findElement(By.id("upload-button"))
                .sendKeys(
                        new File("src/main/resources/IT_IMG.jpg")
                                .getAbsolutePath());

        Thread.sleep(10000);
        driver.quit();
    }
}
