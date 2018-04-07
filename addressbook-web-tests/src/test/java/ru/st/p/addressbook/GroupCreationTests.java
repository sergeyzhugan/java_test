package ru.st.p.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initCreationGroup();
    fillCreationForm(new GroupData("test1", "test2", "test3"));
    submitGroupPage();
    returnToGroupPage();
  }

}
