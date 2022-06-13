package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
//    Napisati program koji ucitava stranicu https://geodata.solutions/
//    Bira proizvoljan Country, State i City
//    Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//    I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//    Izabrerit Country, State i City tako da imate podatke da selektujete!

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        Random random = new Random();

        driver.navigate().to("https://geodata.solutions/");

        Select country = new Select(driver.findElement(By.xpath("//*[contains(@id, 'countryId')]")));
        List<WebElement> countryOptions = country.getOptions();
        int countryNumber = random.nextInt((countryOptions.size()));
        country.selectByIndex(countryNumber);
        Thread.sleep(1000);

        Select state = new Select(driver.findElement(By.xpath("//*[contains(@id, 'stateId')]")));
        List<WebElement> stateOptions = state.getOptions();
        int stateNumber = random.nextInt((stateOptions.size()));
        state.selectByIndex(stateNumber);
        Thread.sleep(1000);


        Select city = new Select(driver.findElement(By.xpath("//*[contains(@id, 'cityId')]")));
        List<WebElement> cityOptions = city.getOptions();
        int cityNumber = random.nextInt((cityOptions.size()));
        city.selectByIndex(cityNumber);
        Thread.sleep(1000);

        driver.quit();


    }

    }
