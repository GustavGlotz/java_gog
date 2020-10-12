package ru.gog.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Тодд", "Говард",
                    "govard@test.ru", "68445226"));
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification(before - 1);
        app.getContactHelper().fillContactForm(new ContactData("Тодд", "Говард",
                "govard@test.ru", "68445226"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before );
    }
}
