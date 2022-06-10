package selenium_uvod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Primeri {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ArrayList<String>nizStringova = new ArrayList<>();
        nizStringova.add("https://google.com/");
        nizStringova.add("https://youtube.com/");
        nizStringova.add("https://www.ebay.com/");
        nizStringova.add("https://www.kupujemprodajem.com");

        for(int i=0; i < nizStringova.size(); i++){
            driver.get(nizStringova.get(i));
            System.out.println(driver.getTitle());
        }
        driver.quit();
    }
}
