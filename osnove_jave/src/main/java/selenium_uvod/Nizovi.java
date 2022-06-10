package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Nizovi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/login");

        driver.manage().window().maximize();

        List<WebElement> liste = driver.findElements(By.xpath("//ul[contains(@class, 'pagination')]/li"));
        for (int i=0; i< liste.size(); i++){
            liste.get(i).click();
            Thread.sleep(1000);

        }
        driver.quit();
    }
}
