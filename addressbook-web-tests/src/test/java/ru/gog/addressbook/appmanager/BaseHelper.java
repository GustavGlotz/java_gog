package ru.gog.addressbook.appmanager;

import org.openqa.selenium.*;
//comment
public class BaseHelper {
    protected WebDriver wd;

    public BaseHelper(WebDriver wd) {
        this.wd = wd;
    }
    //comment
    protected void click(By locator) {
        wd.findElement(locator).click();
    }
    //comment
    protected void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    //comment
    public boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            //comment
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }//comment

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
            //comment
        } catch (NoAlertPresentException e) {
            return false;
        }
    }//comment

    public boolean acceptNextAlert = true;
    //comment
    public String closeAlertAndGetItsText() {
        try {
            Alert alert = wd.switchTo().alert();
            String alertText = alert.getText();
            //comment
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
                //comment
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }//comment
    }


}
