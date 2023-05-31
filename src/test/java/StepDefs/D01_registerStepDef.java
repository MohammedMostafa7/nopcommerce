package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;

import static StepDefs.Hooks.*;

public class D01_registerStepDef {
    @Given("user go to register page")
    public void user_go_to_register_page() {
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("user select gender type")
    public void user_select_gender_type() {
        registerPage.chooseGander("male");
        softAssert.assertEquals(registerPage.isMaleSelected(), true);
        softAssert.assertAll();
    }

    @When("user enter first name {string} and last name {string}")
    public void user_enter_first_name_and_last_name(String string, String string2) {
        registerPage.insertFirstName("automation");
        registerPage.insertLastName("tester");
    }

    @When("user enter date of birth")
    public void user_enter_date_of_birth() {

        registerPage.chooseDate("25", "1", "1997");
    }

    @When("user enter email {string} field")
    public void user_enter_email_field(String string) {

        registerPage.insertEmail("test@example.com");
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        registerPage.insertPassword("P@ssw0rd");
        registerPage.insertConfirmPassword("P@ssw0rd");
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        registerPage.clicksRegisterButton();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        softAssert.assertEquals(registerPage.successMsgIsDisplayed(), "Your registration completed");
        softAssert.assertEquals(Color.fromString(registerPage.successMsgColor()).asHex(), "#4cb17c");
        softAssert.assertAll();
    }


}
