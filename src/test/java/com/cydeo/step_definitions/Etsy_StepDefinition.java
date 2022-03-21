package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Etsy_StepDefinition {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on Etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com/");

    }

    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));


    }

    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsySearchPage.etsy_searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        etsySearchPage.etsy_searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {

        String WoodenSpoon_actualTitle = Driver.getDriver().getTitle();
        String WoodenSpoon_expectedTitle = "Wooden spoon | Etsy";

        Assert.assertEquals(WoodenSpoon_expectedTitle,WoodenSpoon_actualTitle);
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {
       etsySearchPage.etsy_searchBox.sendKeys(string + Keys.ENTER);
       etsySearchPage.etsy_searchButton.click();
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String string) {

        String expectedTitle = string +" | Etsy";
        String actualTitle1 = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle1);
    }
}
