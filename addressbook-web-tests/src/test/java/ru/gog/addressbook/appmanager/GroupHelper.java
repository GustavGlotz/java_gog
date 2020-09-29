package ru.gog.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.gog.addressbook.model.GroupData;
//comment
public class GroupHelper extends BaseHelper {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }
    //comment
    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }
    //comment
    public void submitGroupCreation() {
        click(By.name("submit"));
    }
    //comment
    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }
    //comment
    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }
    //comment
    public void selectGroup() {
        click(By.name("selected[]"));
    }
}
