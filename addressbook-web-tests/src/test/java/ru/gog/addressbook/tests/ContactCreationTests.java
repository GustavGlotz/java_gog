package ru.gog.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.gog.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().createContact(new ContactData("Тодд", "Говард",
                "govard@test.ru", "68445226"));
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size() + 1);
    }

}
