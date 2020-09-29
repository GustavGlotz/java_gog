package ru.gog.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.gog.addressbook.model.ContactData;

import static org.testng.Assert.assertTrue;
//comment
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {

        super(wd);
    }
    //comment
    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    //comment
    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("email"), contactData.getEmail());
        type(By.name("home"), contactData.getPhone());
    }//comment

    //comment
    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }//comment

    public void selectContact() {
        click(By.name("selected[]"));
    }
    //comment
    public void returnToHomePage() {
        click(By.linkText("home page"));
    }


}
