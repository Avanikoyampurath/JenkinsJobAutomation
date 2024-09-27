package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigurePage extends BasePage{

    @FindBy(xpath = "//form[@class='jenkins-form']")
    WebElement configFormBx;
    @FindBy(xpath = "//label[text()='Git']")
    WebElement gitBtn;
    @FindBy(xpath = "//input[@checkdependson='credentialsId']")
    WebElement repositoryUrlInput;
    @FindBy(xpath = "//div[@id='build-steps']/following-sibling::div//button")
    WebElement addBuildStepBtn;
    @FindBy(xpath = "(//button[@class='jenkins-dropdown__item '])[5]")
    WebElement invokeMavenTargetBtn;
    @FindBy(id = "textarea._.targets")
    WebElement goalInput;
    @FindBy(xpath = "//div[@id='post-build-actions']/following-sibling::div//button")
    WebElement addPostBuildBtn;
    @FindBy(xpath = "(//button[@class='jenkins-dropdown__item '])[4]")
    WebElement cucumberReportBtn;
    @FindBy(xpath = "//button[@formnovalidate]")
    WebElement saveBtn;

    public boolean isConfigurePageDisplayed() {
        return isDisplay(configFormBx);
    }

    public void addConfigureDetails() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", gitBtn);
        repositoryUrlInput.sendKeys("https://github.com/Avanikoyampurath/CucumberClassFramework.git");
        executor.executeScript("arguments[0].click();", addBuildStepBtn);
        executor.executeScript("arguments[0].click();", invokeMavenTargetBtn);
        goalInput.sendKeys("clean install");
        executor.executeScript("arguments[0].click();", addPostBuildBtn);
        executor.executeScript("arguments[0].click();", cucumberReportBtn);
        executor.executeScript("arguments[0].click();", saveBtn);
    }

}
