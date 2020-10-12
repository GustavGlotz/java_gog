package ru.gog.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {


    @Test
    public void testContactDeletion() throws Exception {
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Тодд", "Говард",
                    "govard@test.ru", "68445226"));
        }
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deleteSelectedContact();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before - 1);
    }

}
