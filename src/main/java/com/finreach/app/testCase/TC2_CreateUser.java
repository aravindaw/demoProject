package com.finreach.app.testCase;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.CreateUserContext;
import com.finreach.app.document.CreateUserDocument;
import org.testng.annotations.Test;

public class TC2_CreateUser extends StartDriver {
    @Test
    public void testCase() {
        TC1_Login tc1 = new TC1_Login();
        tc1.testCase();

        CreateUserContext context = new CreateUserContext();

        context.setFname("Test");
        context.setLname("user222");
        context.setDate("2019-02-01");
        context.setEmail("testuser222@email.com");

        CreateUserDocument createUserDocument = new CreateUserDocument(context);
        createUserDocument.create();
    }
}
