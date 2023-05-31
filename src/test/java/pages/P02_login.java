package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login {
    //variable
    WebDriver driver;
    //locators
    private By emailLoginField = By.cssSelector("input[id=\"Email\"]");
    private By passwordLoginField = By.cssSelector("input[id=\"Password\"]");
    private By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
    private By myAccountTab = By.cssSelector("a[class=\"ico-account\"]");
    private By errorMessage = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");

    //constructor

    public P02_login(WebDriver driver) {
        this.driver = driver;
    }

    //action
    public void insertEmailLogin(String emailLogin) {
        driver.findElement(emailLoginField).sendKeys(emailLogin);
    }

    public void insertPasswordLogin(String passwordLogin) {
        driver.findElement(passwordLoginField).sendKeys(passwordLogin);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean myAccountTabIsDisplayed() {
        return driver.findElement(myAccountTab).isDisplayed();
    }

    public String errorMsgIsDisplayed() {
        return driver.findElement(errorMessage).getText();
    }

    public String errorMsgColor() {
        return driver.findElement(errorMessage).getCssValue("color");
    }
}
