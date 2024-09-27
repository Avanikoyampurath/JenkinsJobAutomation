package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildPage extends BasePage{

    @FindBy(xpath = "//a[@data-build-success='Build scheduled']")
    WebElement buildNowBtn;
    public boolean isBuildPageDisplayed() {
        return isDisplay(buildNowBtn);
    }
}
