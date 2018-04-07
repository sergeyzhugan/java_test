package ru.st.p.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void testGroupDeletion() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroup();
        returnToGroupPage();
    }

    private void deleteSelectedGroup() {
        wd.findElement(By.name("delete")).click();
    }

    private void selectGroup() {
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
    }
}
