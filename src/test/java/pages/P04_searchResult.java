package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_searchResult {
    //variables
    WebDriver driver;
    //locators
    private By result = By.cssSelector("[class=\"item-box\"]");

    //constructor

    public P04_searchResult(WebDriver driver) {
        this.driver = driver;
    }

    //action
    public int CountSearchResult() {
        return driver.findElements(result).size();
    }

    public void clickSearchResult() {

        driver.findElement(result).click();
    }
}
