package ru.gog.addressbook.tests;

import org.testng.annotations.*;
import ru.gog.addressbook.model.ContactData;
//comment
public class ContactCreationTests extends TestBase {

    //comment
    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().initContactCreation();
        //comment
        app.getContactHelper().fillContactForm(new ContactData("Тодд", "Говард",
                "govard@test.ru", "68445226"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }//comment

}
