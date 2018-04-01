package ru.st.p.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase{
  private ChromeDriver wd;

  public SessionHelper(ChromeDriver wd) {
    super(wd);
  }

  public void login(String name, String pass) {
    type(By.name("user"), name);
    type(By.name("pass"), pass);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
