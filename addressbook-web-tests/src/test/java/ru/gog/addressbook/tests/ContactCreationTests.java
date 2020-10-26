package ru.gog.addressbook.tests;

import org.testng.annotations.Test;
import ru.gog.addressbook.model.ContactData;
import ru.gog.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        Contacts before = app.contact().all();
        app.contact().initContactCreation();
        ContactData contact = new ContactData()
                .withFirstname("Тодд").withLastname("Говард").withEmail("govard@test.ru")
                .withEmail2("govard2@test.ru").withEmail3("govard3@test.ru")
                .withHomePhone("68445226").withMobilePhone("891712345678").withWorkPhone("3334477");
        app.contact().create(contact);
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size() + 1));
        assertThat(after, equalTo(
                before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
    }
}
