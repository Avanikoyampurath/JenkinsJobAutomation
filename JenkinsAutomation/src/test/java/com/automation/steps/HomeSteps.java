package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage=new HomePage();

    @Then("user is on home page")
    public void user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user click on new item")
    public void userClickOnNewItem() {
        homePage.addNewItem();
    }

}
