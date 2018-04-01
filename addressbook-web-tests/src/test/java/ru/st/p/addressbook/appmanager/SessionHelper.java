package ru.st.p.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper {
  private ChromeDriver wd;

  public SessionHelper(ChromeDriver wd) {
    this.wd = wd;
  }

  public void login(String name, String pass) {
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(pass);
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(name);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }
}
