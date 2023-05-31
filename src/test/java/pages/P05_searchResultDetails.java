package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_searchResultDetails {
    //locators
    By skuDetails = By.cssSelector("[class=\"sku\"]");

    //variables
    WebDriver driver;

    //constructor

    public P05_searchResultDetails(WebDriver driver) {
        this.driver = driver;
    }

    //action
    public String SkuDetailsText() {

        return driver.findElement(skuDetails).getText();
    }
}
