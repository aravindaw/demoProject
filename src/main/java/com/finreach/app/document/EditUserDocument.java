package com.finreach.app.document;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.CreateUserContext;
import com.finreach.app.page.CreateUserPage;
import com.finreach.app.page.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EditUserDocument extends StartDriver {
    private CreateUserContext context;

    public EditUserDocument(CreateUserContext context) {
        this.context = context;
    }

    public void edit() {

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        CreateUserPage createUserPage = PageFactory.initElements(driver, CreateUserPage.class);

        mainPage.clickUser();
        mainPage.clickEdit();
        createUserPage.getFname().clear();
        createUserPage.fname(context.getFname());
        createUserPage.getLnmae().clear();
        createUserPage.lname(context.getLname());
        createUserPage.getDate().clear();
        createUserPage.date(context.getDate());
        createUserPage.getEmail().clear();
        createUserPage.email(context.getEmail());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        createUserPage.clickAdd();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Hello Luke", mainPage.result());


    }
}
