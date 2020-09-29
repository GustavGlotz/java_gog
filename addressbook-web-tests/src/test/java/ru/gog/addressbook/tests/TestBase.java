package ru.gog.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.gog.addressbook.appmanager.ApplicationManager;
//comment
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    //comment
    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }
    //comment
    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }
    //comment
    public ApplicationManager getApp() {
        return app;
    }

}
