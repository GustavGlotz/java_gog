package ru.gog.addressbook.tests;

import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Тодд", "Говард",
                "govard@test.ru", "68445226"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
