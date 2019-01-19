package com.finreach.app.document;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.LoginContext;
import com.finreach.app.page.LoginPage;
import com.finreach.app.page.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginDocument extends StartDriver {
    private LoginContext context;

    public LoginDocument(LoginContext context) {
        this.context = context;
    }

    public void login() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

        loginPage.putUserName(context.getUser());
        loginPage.putPassword(context.getPassword());
        loginPage.clickLogin();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(context.getResult(), mainPage.result());


    }
}
