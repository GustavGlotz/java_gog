package ru.gog.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//comment
public class NavigationHelper extends HelperBase {

    //comment
    public NavigationHelper(WebDriver wd) {
        super(wd);
    }
    //comment
    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }


}
