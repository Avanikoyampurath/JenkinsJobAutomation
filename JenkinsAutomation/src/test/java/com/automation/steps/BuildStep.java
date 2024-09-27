package com.automation.steps;

import com.automation.pages.BuildPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BuildStep {

    BuildPage buildPage=new BuildPage();

    @Then("verify build page is displayed")
    public void verifyBuildPageIsDisplayed() {
        Assert.assertTrue(buildPage.isBuildPageDisplayed());
    }
}
