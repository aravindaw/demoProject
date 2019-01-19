package com.finreach.app.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//*[@id='greetings']")
    private WebElement result;

    @FindBy(xpath = "//*[@id='bAdd']")
    private WebElement create;

    @FindBy(xpath = "//*[@id='bEdit']")
    private WebElement edit;

    @FindBy(xpath = "//*[@id='bDelete']")
    private WebElement delete;

    @FindBy(xpath = "//*[@id='employee-list']/li[1]")
    private WebElement user;


    public String result() {
        return result.getText();
    }

    public void clickCreate() {
        create.click();
    }

    public void clickEdit() {
        edit.click();
    }

    public void clickDelete() {
        delete.click();
    }

    public void clickUser() {
        user.click();
    }
}
