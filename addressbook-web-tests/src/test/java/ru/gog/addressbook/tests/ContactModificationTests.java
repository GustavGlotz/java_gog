package ru.gog.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;
import ru.gog.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (app.contact().all().size() == 0) {
            app.contact().create(new ContactData()
                    .withFirstname("Тодд").withLastname("Говард").withEmail("govard@test.ru")
                    .withEmail2("govard2@test.ru").withEmail3("govard3@test.ru")
                    .withHomePhone("68445226").withMobilePhone("891712345678")
                    .withWorkPhone("3334477").withAddress("Пенсильвания"));
        }
    }

    @Test
    public void testContactModification() {
        Contacts before = app.contact().all();
        ContactData modifiedContact = before.iterator().next();
        ContactData contact = new ContactData()
                .withId(modifiedContact.getId()).withFirstname("Тодд").withLastname("Говард")
                .withEmail("govard@test.ru").withEmail2("govard2@test.ru").withEmail3("govard3@test.ru")
                .withHomePhone("68445226").withMobilePhone("891712345678")
                .withWorkPhone("3334477").withAddress("Пенсильвания");
        app.contact().modify(modifiedContact);
        Contacts after = app.contact().all();
        assertEquals(after.size(), before.size());
        assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));
    }
}
