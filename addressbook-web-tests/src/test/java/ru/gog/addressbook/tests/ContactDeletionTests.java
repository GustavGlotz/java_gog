package ru.gog.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {


    @Test
    public void testContactDeletion() throws Exception {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
    }

}
