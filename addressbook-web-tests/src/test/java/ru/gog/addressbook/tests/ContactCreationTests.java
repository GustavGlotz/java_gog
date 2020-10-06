package ru.gog.addressbook.tests;

import org.testng.annotations.*;
import ru.gog.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().createContact(new ContactData("Тодд", "Говард",
                "govard@test.ru", "68445226"));
    }

}
