package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

import static StepDefs.Hooks.driver;
import static StepDefs.Hooks.homePage;

public class D07_followUsStepDef {
    @Given("go home page URl")
    public void go_home_page_u_rl() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user clicks on the Facebook link")
    public void user_clicks_on_the_facebook_link() {
        homePage.clickOnFacebook();
    }

    @Then("the Facebook page is opened in a new tab")
    public void the_facebook_page_is_opened_in_a_new_tab() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> taps = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(taps.get(1));
    }

    @Then("the current facebook URL should be {string}")
    public void the_current_facebook_url_should_be(String facebook) {
        Assert.assertEquals(driver.getCurrentUrl(), facebook);
    }

    @When("user clicks on the Twitter link")
    public void user_clicks_on_the_twitter_link() {
        homePage.clickOnTwitter();
    }

    @Then("the Twitter page is opened in a new tab")
    public void the_twitter_page_is_opened_in_a_new_tab() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> taps = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(taps.get(1));
    }

    @Then("the current twitter URL should be {string}")
    public void the_current_twitter_url_should_be(String twitter) {
        Assert.assertEquals(driver.getCurrentUrl(), twitter);
    }

    @When("user clicks on the RSS link")
    public void user_clicks_on_the_rss_link() {
        homePage.clickOnRss();
    }

    @Then("the current rss URL should be {string}")
    public void the_current_rss_url_should_be(String Rss) {
        Assert.assertEquals(driver.getCurrentUrl(), Rss);
    }

    @When("user clicks on the YouTube link")
    public void user_clicks_on_the_you_tube_link() {
        homePage.clickOnYoutube();
    }

    @Then("the YouTube page is opened in a new tab")
    public void the_you_tube_page_is_opened_in_a_new_tab() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> taps = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(taps.get(1));
    }

    @Then("the current youtube URL should be {string}")
    public void the_current_youtube_url_should_be(String youtube) {
        Assert.assertEquals(driver.getCurrentUrl(), youtube);
    }
}
