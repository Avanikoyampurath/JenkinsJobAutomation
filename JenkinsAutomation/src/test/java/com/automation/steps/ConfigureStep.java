package com.automation.steps;

import com.automation.pages.ConfigurePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ConfigureStep {

    ConfigurePage configurePage=new ConfigurePage();

    @Then("verify user is on configure page")
    public void verifyUserIsOnConfigurePage() {
        Assert.assertTrue(configurePage.isConfigurePageDisplayed());
    }

    @When("user configure the project")
    public void userConfigureTheProject() {
        configurePage.addConfigureDetails();
    }

    @And("click on save")
    public void clickOnSave() {

    }

}
