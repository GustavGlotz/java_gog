package ru.gog.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//comment
public class SessionHelper extends BaseHelper {
    //comment
    public SessionHelper(WebDriver wd) {

        super(wd);
    }
    //comment
    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }//comment
}
