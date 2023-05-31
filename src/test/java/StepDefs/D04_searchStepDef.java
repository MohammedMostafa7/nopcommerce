package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static StepDefs.Hooks.*;

public class D04_searchStepDef {

    @Given("home page URl")
    public void homePageURl() {

        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user enters {string} Name in the search box")
    public void user_enters_name_in_the_search_box(String product) {
        homePage.insertProduct(product);
        homePage.clickSearchBtn();
    }

    @Then("user should see relevant results for product")
    public void user_should_see_relevant_results_for_product() {
        softAssert.assertEquals(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="), true);
        softAssert.assertTrue(searchResult.CountSearchResult() > 0);
        softAssert.assertAll();
    }

    @When("user enters product {string} in the search box")
    public void user_enters_product_in_the_search_box(String sku) {
        homePage.insertSku(sku);
        homePage.clickSearchBtn();
    }

    @Then("user should see the product with matching {string}")
    public void user_should_see_the_product_with_matching(String sku) {
        searchResult.clickSearchResult();
        Assert.assertEquals(searchResultDetails.SkuDetailsText().contains(sku), true);
    }

}
