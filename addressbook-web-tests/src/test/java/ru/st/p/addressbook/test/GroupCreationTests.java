package ru.st.p.addressbook.test;

import org.testng.annotations.Test;
import ru.st.p.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage();
    app.initCreation(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupPage();
    app.getGroupHelper().returnToGroupPage();
  }

}
