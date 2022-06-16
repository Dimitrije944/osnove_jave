package d13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        File slikaFront = new File("src/main/resources/front_it_img.jpg");
        File slikaBack = new File("src/main/resources/back_it_img.jpg");
        File slikaLeft = new File("src/main/resources/left_it_img.jpg");
        File slikaRight = new File("src/main/resources/right_it_img.jpg");

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@alt='image 1']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.id("imageUpload")).sendKeys(slikaFront.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                        "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                1));

        driver.findElement(By.id("imageUpload")).sendKeys(slikaBack.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                        "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                2));

        driver.findElement(By.id("imageUpload")).sendKeys(slikaLeft.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                        "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                3));

        driver.findElement(By.id("imageUpload")).sendKeys(slikaRight.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                        "//div[contains(@class,'sc-ftvSup kAzmBp')]/div/div/img"),
                4));

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[4]/div/img")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-iXxrte")));  //?????? postojanje dialoga

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//*[@alt='image 2']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[3]/div/img"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sc-iXxrte")));

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//*[@alt='image 3']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[2]/div/img"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sc-iXxrte")));

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//*[@alt='image 4']")).click();

        driver.findElement(By.xpath("//*[@alt='+ Add photo']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'sc-ftvSup kAzmBp')]/div[1]/div/img")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sc-iXxrte")));

        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.name("1")).click();

        driver.findElement(By.xpath("//button[text()='Add to cart ']")).click();

        WebElement error = driver.findElement(By.xpath("//*[@action='error']"));
        if (elementExist(driver,By.xpath("//*[@action='error']"))){
            System.out.println("ERROR: " + error.getAttribute("innerText"));
        }else {
            System.out.println("sve ok");
        }

        driver.quit();

    }
    public static boolean elementExist (WebDriver driver, By by){
        boolean elementExist = true;
        try {
            driver.findElement(by);
        }catch (Exception e){
            elementExist = false;
        }
        return elementExist;
    }
}
