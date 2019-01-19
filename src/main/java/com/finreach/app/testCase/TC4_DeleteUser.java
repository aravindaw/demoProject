package com.finreach.app.testCase;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.CreateUserContext;
import com.finreach.app.document.DeleteUserDocument;
import com.finreach.app.document.EditUserDocument;
import org.testng.annotations.Test;

public class TC4_DeleteUser extends StartDriver {
    @Test
    public void testCase() {
        TC1_Login tc1 = new TC1_Login();
        tc1.testCase();
        DeleteUserDocument deleteUserDocument= new DeleteUserDocument();
        deleteUserDocument.delete();
    }
}
