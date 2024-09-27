package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "j_username")
    WebElement usernameInput;
    @FindBy(id = "j_password")
    WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInBtn;

    public void openWebsite() {
        driver.get("http://localhost:8080/");
    }

    public boolean isLoginPageDisplayed() {
        return isDisplay(usernameInput) && isDisplay(passwordInput) && isDisplay(signInBtn);
    }

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void clickOnSignIn() {
        signInBtn.click();
    }
}
