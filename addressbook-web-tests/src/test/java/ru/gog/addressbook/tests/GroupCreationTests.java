package ru.gog.addressbook.tests;

import org.testng.annotations.Test;
import ru.gog.addressbook.model.GroupData;
//comment
public class GroupCreationTests extends TestBase {

    //comment
    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        //comment
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }//comment

}
