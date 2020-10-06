package ru.gog.addressbook.tests;

import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {


    @Test
    public void testContactDeletion() throws Exception {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Тодд", "Говард",
                    "govard@test.ru", "68445226"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
    }

}
