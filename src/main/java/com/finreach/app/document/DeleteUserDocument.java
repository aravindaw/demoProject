package com.finreach.app.document;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.CreateUserContext;
import com.finreach.app.page.CreateUserPage;
import com.finreach.app.page.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeleteUserDocument extends StartDriver {
    private CreateUserContext context;

    public void delete() {

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

        mainPage.clickUser();
        mainPage.clickDelete();
        driver.switchTo().alert().accept();
        Assert.assertEquals("Hello Luke", mainPage.result());
    }
}
