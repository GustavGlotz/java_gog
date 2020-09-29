package ru.gog.addressbook.tests;

import org.testng.annotations.Test;
//comment
public class ContactDeletionTests extends TestBase {

    //comment
    @Test
    public void testContactDeletion() throws Exception {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
    }//comment

}
