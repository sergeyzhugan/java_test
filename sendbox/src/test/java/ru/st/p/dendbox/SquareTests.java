package ru.st.p.dendbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.st.p.sendbox.Square;

public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals( s.area(),  25.0);
  }
}
