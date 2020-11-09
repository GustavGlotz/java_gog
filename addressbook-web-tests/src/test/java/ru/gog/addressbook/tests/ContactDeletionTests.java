package ru.gog.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;
import ru.gog.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (app.db().contacts().size() == 0) {
            app.contact().create(new ContactData()
                    .withFirstname("Тодд").withLastname("Говард").withEmail("govard@test.ru")
                    .withEmail2("govard2@test.ru").withEmail3("govard3@test.ru")
                    .withHomePhone("68445226").withMobilePhone("891712345678")
                    .withWorkPhone("3334477").withAddress("Пенсильвания"));
        }
    }

    @Test
    public void testContactDeletion() throws Exception {
        Contacts before = app.db().contacts();
        ContactData deletedContact = before.iterator().next();
        app.contact().delete(deletedContact);
        app.contact().openHomepage();
        Contacts after = app.db().contacts();
        assertEquals(after.size(), before.size() - 1);
        assertThat(after, equalTo(before.without(deletedContact)));
    }
}
