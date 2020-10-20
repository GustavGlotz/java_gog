package ru.gog.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.gog.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertTrue;


public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {

        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }


    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("email"), contactData.getEmail());
        type(By.name("home"), contactData.getPhone());
    }


    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }


    public void initContactModification(int index) {
        wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
    }

    public void submitContactModification() {
        click(By.xpath("//input[@name='update'][2]"));
    }

    public void create(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> list() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> line = wd.findElements(By.xpath("//tr[@name='entry']"));
        for (WebElement element : line) {
            List<WebElement> cell = element.findElements(By.tagName("td"));
            String firstname = cell.get(2).getText();
            String lastname = cell.get(1).getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            contacts.add(new ContactData().withId(id).withFirstname(firstname).withLastname(lastname));
        }
        return contacts;
    }

    public Set<ContactData> all() {
        Set<ContactData> contacts = new HashSet<ContactData>();
        List<WebElement> line = wd.findElements(By.xpath("//tr[@name='entry']"));
        for (WebElement element : line) {
            List<WebElement> cell = element.findElements(By.tagName("td"));
            String firstname = cell.get(2).getText();
            String lastname = cell.get(1).getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            contacts.add(new ContactData().withId(id).withFirstname(firstname).withLastname(lastname));
        }
        return contacts;
    }

    public void modify(int index, ContactData contact) {
        initContactModification(index);
        fillContactForm(contact);
        submitContactModification();
        returnToHomePage();
    }

    public void delete(int index) {
        selectContact(index);
        deleteSelectedContact();
    }
}
