package com.finreach.app.testCase;

import com.finreach.app.baseScript.StartDriver;
import com.finreach.app.context.LoginContext;
import com.finreach.app.document.LoginDocument;
import org.testng.annotations.Test;

public class TC1_Login extends StartDriver {
    @Test
    public void testCase() {
        LoginContext context = new LoginContext();

        context.setUser("Luke");
        context.setPassword("Skywalker");
        context.setResult("Hello Luke");

        LoginDocument loginDocument= new LoginDocument(context);
        loginDocument.login();

    }
}
