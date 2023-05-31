package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static StepDefs.Hooks.driver;
import static StepDefs.Hooks.homePage;

public class D03_currenciesStepDef {

    @Given("user go to home page")
    public void userGoToHomePage() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("Select Euro currency from the dropdown list on the top left of home page")
    public void select_euro_currency_from_the_dropdown_list_on_the_top_left_of_home_page() {
        homePage.chooseCurrencies("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("verify Euro Symbol \\(€) is shown on the {int} products displayed in Home page")
    public void verify_euro_symbol_€_is_shown_on_the_products_displayed_in_home_page(Integer int1) {
        Assert.assertEquals(homePage.checkEuroInPc().get(0).getText().contains("€"), true);
        Assert.assertEquals(homePage.checkEuroInMacBook().get(1).getText().contains("€"), true);
        Assert.assertEquals(homePage.checkEuroInHtc().get(2).getText().contains("€"), true);
        Assert.assertEquals(homePage.checkEuroInGiftCard().get(3).getText().contains("€"), true);
    }

}
