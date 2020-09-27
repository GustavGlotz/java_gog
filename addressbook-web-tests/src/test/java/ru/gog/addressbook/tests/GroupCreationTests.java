package ru.gog.addressbook.tests;

import org.testng.annotations.Test;
import ru.gog.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
