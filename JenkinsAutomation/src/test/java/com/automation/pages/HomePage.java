package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//span[text()='log out']")
    WebElement logoutBtn;
    @FindBy(xpath = "//li[contains(@class,'jenkins-breadcrumbs')]")
    WebElement dashBoardIcon;
    @FindBy(xpath = "//a[@class='task-link task-link-no-confirm ']")
    WebElement newItemBtn;
    public boolean isHomePageDisplayed() {
        return isDisplay(logoutBtn) && isDisplay(dashBoardIcon);
    }

    public void addNewItem() {
        newItemBtn.click();
    }
}
