package com.finreach.app.testCase;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.CreateUserContext;
import com.finreach.app.document.CreateUserDocument;
import com.finreach.app.document.EditUserDocument;
import org.testng.annotations.Test;

public class TC3_EditUser extends StartDriver {
    @Test
    public void testCase() {
        TC1_Login tc1 = new TC1_Login();
        tc1.testCase();

        CreateUserContext context = new CreateUserContext();

        context.setFname("TestEdit");
        context.setLname("userEdit");
        context.setDate("2019-02-01");
        context.setEmail("testuser222@email.com");

        EditUserDocument editUserDocument= new EditUserDocument(context);
        editUserDocument.edit();
    }
}
