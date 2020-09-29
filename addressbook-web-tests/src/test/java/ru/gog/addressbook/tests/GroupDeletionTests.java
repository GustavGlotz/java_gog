package ru.gog.addressbook.tests;

import org.testng.annotations.Test;
//comment
public class GroupDeletionTests extends TestBase {

    //comment
    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }//comment

}
