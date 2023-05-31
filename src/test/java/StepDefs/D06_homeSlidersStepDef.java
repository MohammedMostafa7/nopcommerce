package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static StepDefs.Hooks.driver;
import static StepDefs.Hooks.homePage;

public class D06_homeSlidersStepDef {
    @Given("go to home page URl")
    public void go_to_home_page_u_rl() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("I click on the first slider")
    public void i_click_on_the_first_slider() {

        homePage.clickIphone14();
    }

    @Then("I should be redirected to iphone {int} pro max page")
    public void i_should_be_redirected_to_iphone_pro_max_page(Integer int1) {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }

    @When("I click on the second slider")
    public void i_click_on_the_second_slider() {
        homePage.clickS22();
    }

    @Then("I should be redirected to s22 ultra page")
    public void i_should_be_redirected_to_s22_ultra_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }
}
