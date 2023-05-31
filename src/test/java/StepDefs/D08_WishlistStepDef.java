package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static StepDefs.Hooks.*;

public class D08_WishlistStepDef {
    @Given("open the home page URl")
    public void open_the_home_page_u_rl() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("I click on the wishlist button for HTC One M8 Android L5 Lollipop")
    public void i_click_on_the_wishlist_button_for_htc_one_m8_android_l5_lollipop() {
        homePage.addHtcToWishList();
    }

    @Then("I should see the success message {string} with green background color")
    public void i_should_see_the_success_message_with_green_background_color(String msg) {
        softAssert.assertEquals(homePage.wishListSuccessMsg().getText().contains(msg), true);
        String actualColor = Color.fromString(homePage.wishListSuccessMsg().getCssValue("background-color")).asHex();
        softAssert.assertEquals(actualColor, "#4bb07a");
        softAssert.assertAll();
    }

    @When("I click on the wishlist button for HTC One M8 Android L5 Lollipop and wait for success message to disappear")
    public void i_click_on_the_wishlist_button_for_htc_one_m8_android_l5_lollipop_and_wait_for_success_message_to_disappear() {
        homePage.addHtcToWishList();
    }

    @When("I click on the Wishlist tab")
    public void i_click_on_the_wishlist_tab() {
        ExpectedConditions.invisibilityOf(homePage.wishListSuccessMsg());
        homePage.clickWishListBtn();
    }

    @Then("I should see the quantity value greater than {int}")
    public void i_should_see_the_quantity_value_greater_than(Integer int1) {
        softAssert.assertTrue(homePage.countProducts() > 0);
        softAssert.assertAll();
    }
}
