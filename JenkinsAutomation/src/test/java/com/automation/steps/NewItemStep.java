package com.automation.steps;

import com.automation.pages.NewItemPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewItemStep {

    NewItemPage itemPage=new NewItemPage();
    @Then("verify user is on new item page")
    public void verifyUserIsOnNewItemPage() {
        Assert.assertTrue(itemPage.isNewItemPageDisplayed());
    }

    @When("user add new project")
    public void userAddNewProject() {
        itemPage.addNewProject();
    }
}
