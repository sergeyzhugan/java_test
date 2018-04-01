package ru.st.p.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.st.p.addressbook.model.GroupData;

public class GroupHelper {
  private ChromeDriver wd;

  public GroupHelper(ChromeDriver wd) {
    this.wd = wd;
  }

  public void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void submitGroupPage() {
    wd.findElement(By.name("submit")).click();
  }

  public void initCreation() {
    wd.findElement(By.name("new")).click();
  }

  public void fillGroupCreation(GroupData groupData) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void deleteSelectedGroup() {
      wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
      if (!wd.findElement(By.name("selected[]")).isSelected()) {
          wd.findElement(By.name("selected[]")).click();
      }
  }
}
