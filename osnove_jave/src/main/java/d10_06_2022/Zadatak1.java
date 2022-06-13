package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
//    Napisati program koji:
//    Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//    Klikce na svaki iks da ugasi obavestenje i proverava
//    da li se nakon klika element obrisao sa stranice
//    i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//    POMOC: Brisite elemente odozdo.
//            (ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        List<WebElement> zatvarajuceDugme = driver.findElements(By.xpath("//div/button[@type='button']"));

        for (int i = zatvarajuceDugme.size(); i > 0; i--) {
            if (elementExist(driver, By.xpath("//div[last()]/button[@type='button']"))) {
                driver.findElement(By.xpath("//div[last()]/button[@type='button']")).click();
                System.out.println("Element " + (i) + " je obrisan");
            } else {
                System.out.println("Element " + (i + 1) + " nije obrisan");
            }
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
