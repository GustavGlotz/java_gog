package ru.gog.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
//comment
public class ApplicationManager {
    public WebDriver wd;

    //comment
    private ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    //comment
    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        //comment
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        //comment
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    //comment
    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
    //comment
    public ContactHelper getContactHelper() {
        return contactHelper;
    }
    //comment
    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }



}
