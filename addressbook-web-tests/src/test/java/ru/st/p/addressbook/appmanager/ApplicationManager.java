package ru.st.p.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.st.p.addressbook.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  ChromeDriver wd;

  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;

  public void init() {
   wd = new ChromeDriver();
   wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   wd.get("http://localhost/addressbook/");
   groupHelper = new GroupHelper(wd);
   navigationHelper = new NavigationHelper(wd);
   sessionHelper = new SessionHelper(wd);
   sessionHelper.login("admin", "secret");
  }

  public void initCreation(GroupData groupData) {
    wd.findElement(By.name("new")).click();
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

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}