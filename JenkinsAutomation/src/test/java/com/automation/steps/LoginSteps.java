package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage=new LoginPage();

    @Given("user open website")
    public void user_open_website() {
       loginPage.openWebsite();
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("user enter login credentials")
    public void user_enter_login_credentials() {
        loginPage.doLogin(ConfigReader.getConfigValue("login.name"),
                ConfigReader.getConfigValue("login.password"));
    }

    @When("click on sign in")
    public void click_on_sign_in() {
        loginPage.clickOnSignIn();
    }

}
