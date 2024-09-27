package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class NewItemPage extends BasePage{

    @FindBy(id = "createItem")
    WebElement formBx;
    @FindBy(id = "name")
    WebElement itemNameInput;
    @FindBy(xpath = "//span[text()='Freestyle project']")
    WebElement freestyleBtn;
    @FindBy(id = "ok-button")
    WebElement okBtn;

    public boolean isNewItemPageDisplayed() {
        return isDisplay(formBx);
    }

    public void addNewProject() {
        Random random = new Random();
        String username = "test" + random.nextInt(1000);
        itemNameInput.sendKeys(username);
        freestyleBtn.click();
        okBtn.click();
    }
}
