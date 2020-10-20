package ru.gog.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;

import java.util.Set;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        Set<ContactData> before = app.contact().all();
        app.contact().initContactCreation();
        ContactData contact = new ContactData()
                .withFirstname("Тодд").withLastname("Говард").withEmail("govard@test.ru").withPhone("68445226");
        app.contact().create(contact);
        Set<ContactData> after = app.contact().all();
        Assert.assertEquals(after.size(), before.size() + 1);


        contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt());
        before.add(contact);
        Assert.assertEquals(before, after);
    }
}
