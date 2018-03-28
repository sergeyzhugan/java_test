package ru.st.p.sendbox;

public class MyFirstProg {
  public static void main(String[] args) {
//    System.out.println("Hello world!");

    double l = 5;
    Square s = new Square(l);
    System.out.println("Площадь квадрата со стороной " +
            l +" = " + s.area());

    double a = 7;
    Rectangle r = new Rectangle(a,l);
    System.out.println("Площадь прямоугольника со сторонами " +
            a + " и " + l +" = " + r.area());

  }
}