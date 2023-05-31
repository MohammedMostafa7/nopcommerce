package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.time.Duration;

public class Hooks {
    static WebDriver driver;
    static P01_register registerPage;
    static P02_login loginPage;
    static P03_homePage homePage;
    static P04_searchResult searchResult;
    static P05_searchResultDetails searchResultDetails;
    static P06_subCategoryDetails subCategoryDetails;
    static Actions actions;
    static SoftAssert softAssert;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        registerPage = new P01_register(driver);
        loginPage = new P02_login(driver);
        homePage = new P03_homePage(driver);
        searchResult = new P04_searchResult(driver);
        searchResultDetails = new P05_searchResultDetails(driver);
        subCategoryDetails = new P06_subCategoryDetails(driver);
        actions = new Actions(driver);
        softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
