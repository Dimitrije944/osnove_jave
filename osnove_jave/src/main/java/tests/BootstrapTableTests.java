package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DeleteDialogPage;
import pages.EditDialogPage;
import pages.TablePage;

import java.time.Duration;

public class BootstrapTableTests {
    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com/iframe/K5yrx";
    private TablePage tablePage;
    private EditDialogPage editDialogPage;
    private DeleteDialogPage deleteDialogPage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        tablePage = new TablePage(driver);
        editDialogPage = new EditDialogPage(driver);
        deleteDialogPage = new DeleteDialogPage(driver);

    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);    }

    @Test(priority = 1)
    public void editRow() {
        Assert.assertEquals(
                driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com");

        tablePage.getEditButtonByRowIndex(0).click();
        editDialogPage.waitForDialogToBeVisible();
        editDialogPage.getFirstNameInput().clear();
        editDialogPage.getFirstNameInput().sendKeys("Milan");
        editDialogPage.getLastNameInput().clear();
        editDialogPage.getLastNameInput().sendKeys("Jovanovic");
        editDialogPage.getMiddleNameInput().clear();
        editDialogPage.getMiddleNameInput().sendKeys("Nebojsa");
        editDialogPage.getUpdateButton().click();
        editDialogPage.waitForDialogToBeInvisible();


        Assert.assertEquals(
                tablePage.getTableCell(1, 2).getText(),
                "Milan",
                "");

        Assert.assertEquals(
                tablePage.getTableCell(1, 3).getText(),
                "Jovanovic");

        Assert.assertEquals(
                tablePage.getTableCell(1, 4).getText(),
                "Nebojsa");



    }

    @Test(priority = 2)
    public void deleteRow() {
        Assert.assertEquals(
                driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com");
        int beforeDelete = tablePage.getRows().size();

        tablePage.getDeleteButtonByRowIndex(0).click();
        deleteDialogPage.waitForDialogToBeVisible();
        deleteDialogPage.getDeleteButton().click();
        deleteDialogPage.waitForDialogToBeInvisible();

        int afterDelete = tablePage.getRows().size();

        Assert.assertEquals(
                afterDelete,
                beforeDelete - 1);

//        tablePage.waitForNumberOfRowsToBe(1);
    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() {
       driver.quit();
    }

}
