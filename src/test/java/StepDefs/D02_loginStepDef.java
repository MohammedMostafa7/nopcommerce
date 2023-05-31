package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;

import static StepDefs.Hooks.*;

public class D02_loginStepDef {
    @Given("user go to login page")
    public void user_go_to_login_page() {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
        loginPage.insertEmailLogin("aatest@example.com");
        loginPage.insertPasswordLogin("P@ssw0rd");
    }

    @When("user press on login button")
    public void user_press_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "login isn't working");
        softAssert.assertEquals(loginPage.myAccountTabIsDisplayed(), true);
        softAssert.assertAll();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1) {
        loginPage.insertEmailLogin("wrong@example.com");
        loginPage.insertPasswordLogin("P@ssw0rd");
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        softAssert.assertEquals(loginPage.errorMsgIsDisplayed().contains("Login was unsuccessful"), true);
        softAssert.assertEquals(Color.fromString(loginPage.errorMsgColor()).asHex(), "#e4434b");
        softAssert.assertAll();
    }
}
