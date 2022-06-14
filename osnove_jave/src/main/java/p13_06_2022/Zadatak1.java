package p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.navigate().to("https://docs.katalon.com/");
        driver.manage().window().maximize();
        WebElement t =driver.findElement(By.xpath("/html"));
        if(t.getAttribute("data-theme").equals("light")){
            System.out.println("Tema je light");
        }else{
            System.out.println("Tema je dark");
        }
        driver.findElement(By.className("toggleButton_rCf9")).click();
        Thread.sleep(3000);
        if(t.getAttribute("data-theme").equals("light")){
            System.out.println("Tema je light");
        }else{
            System.out.println("Tema je dark");
        }
        Thread.sleep(3000);


        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();

        if(driver.findElement(By.id("docsearch-input")).getAttribute("type").equals("search")){
            System.out.println("Jeste");
        }else{
            System.out.println("Nije");
        }
        driver.quit();
    }
    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
