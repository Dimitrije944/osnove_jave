package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TablePage {
    private WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEditButtonByRowIndex(int index) {
        return driver.findElements(By.className("update")).get(index);
    }

    public WebElement getDeleteButtonByRowIndex(int index) {
        return driver.findElements(By.className("delete")).get(index);
    }

    public WebElement getTableCell(int rowIndex, int columnIndex) {
        return driver
                .findElement(By.xpath(
                        "//tbody/tr["+rowIndex +"]/td["+ columnIndex +"]"));
    }

    public List<WebElement> getRows() {
        return driver.findElements(By.tagName("tr"));
    }

    public void waitForNumberOfRowsToBe(int rowNum) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("tr"), rowNum));
    }
}
