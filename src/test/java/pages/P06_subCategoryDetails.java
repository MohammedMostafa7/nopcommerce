package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_subCategoryDetails {
    //variables
    WebDriver driver;
    //locators
    private By pageTitle = By.cssSelector("[class=\"page-title\"]");

    //constructor

    public P06_subCategoryDetails(WebDriver driver) {
        this.driver = driver;
    }

    //action
    public boolean pageTitleIsDisplayed() {
        driver.findElement(pageTitle).getText().contains("Notebooks".toLowerCase().trim());
        return true;
    }
}
