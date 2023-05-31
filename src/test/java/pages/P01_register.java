package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    //Variables
    WebDriver driver;
    //Locators
    private By maleRadioBtn = By.id("gender-male");
    private By femaleRadioBtn = By.id("gender-female");
    private By firstNameField = By.id("FirstName");
    private By lastNameField = By.id("LastName");
    private By dayDropDown = By.cssSelector("select[name=\"DateOfBirthDay\"]");
    private By monthDropDown = By.cssSelector("select[name=\"DateOfBirthMonth\"]");
    private By yearDropDown = By.cssSelector("select[name=\"DateOfBirthYear\"]");
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By confirmPasswordField = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By successMessage = By.cssSelector("div[class=\"result\"]");

//constructor

    public P01_register(WebDriver driver) {
        this.driver = driver;
    }

    //action
    public void chooseGander(String gender) {
        if (gender == "male") {
            driver.findElement(maleRadioBtn).click();
        } else if (gender == "female") {
            driver.findElement(femaleRadioBtn).click();
        } else {
            System.out.println("Invalid Gender");
        }
    }

    public boolean isMaleSelected() {
        return driver.findElement(maleRadioBtn).isSelected();
    }

    public boolean isFemaleSelected() {
        return driver.findElement(femaleRadioBtn).isSelected();
    }

    public void insertFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void insertLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void chooseDate(String day, String month, String year) {
        Select selectDay = new Select(driver.findElement(dayDropDown));
        selectDay.selectByValue(day);

        Select selectMonth = new Select(driver.findElement(monthDropDown));
        selectMonth.selectByValue(month);

        Select selectYear = new Select(driver.findElement(yearDropDown));
        selectYear.selectByValue(year);
    }

    public void insertEmail(String email) {

        driver.findElement(emailField).sendKeys(email);
    }

    public void insertPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);
    }

    public void insertConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clicksRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public String successMsgIsDisplayed() {
        return driver.findElement(successMessage).getText();
    }

    public String successMsgColor() {
        return driver.findElement(successMessage).getCssValue("color");
    }
}
