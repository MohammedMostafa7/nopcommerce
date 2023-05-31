package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static StepDefs.Hooks.*;

public class D05_hoverCategoriesStepDef {

    @Given("open home page URl")
    public void open_home_page_u_rl() {

        driver.get("https://demo.nopcommerce.com/");
    }

    @When("the user selects a random main category and hover on it")
    public void the_user_selects_a_random_main_category_and_hover_on_it() {
        actions.moveToElement(homePage.hoverOnComputers()).perform();
    }

    @When("selects a random sub-category")
    public void selects_a_random_sub_category() {
        homePage.clickOnNoteBooks();
    }

    @Then("the sub-category page title should contain the selected sub-category")
    public void the_sub_category_page_title_should_contain_the_selected_sub_category() {
        Assert.assertEquals(subCategoryDetails.pageTitleIsDisplayed(), true);
    }
}
