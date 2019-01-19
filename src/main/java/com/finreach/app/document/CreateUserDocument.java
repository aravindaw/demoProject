package com.finreach.app.document;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.CreateUserContext;
import com.finreach.app.context.LoginContext;
import com.finreach.app.page.CreateUserPage;
import com.finreach.app.page.LoginPage;
import com.finreach.app.page.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateUserDocument extends StartDriver {
    private CreateUserContext context;

    public CreateUserDocument(CreateUserContext context) {
        this.context = context;
    }

    public void create() {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        CreateUserPage createUserPage = PageFactory.initElements(driver, CreateUserPage.class);

        mainPage.clickCreate();
        createUserPage.fname(context.getFname());
        createUserPage.lname(context.getLname());
        createUserPage.date(context.getDate());
        createUserPage.email(context.getEmail());
        createUserPage.clickAdd();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Hello Luke", mainPage.result());


    }
}
