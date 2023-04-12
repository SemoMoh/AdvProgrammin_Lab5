package Q4;

import javafx.geometry.Point2D;

public class TestQ4 {

  public static void main(String[] args) {
    // Test main Diamond Properties
    Diamond d1 = new Diamond(Point2D.ZERO, 10, 5);
    d1.draw();
    System.out.println("___________________");
    d1.move(1, 1);
    d1.draw();
    System.out.println("___________________");
    Diamond d2 = new Diamond(Point2D.ZERO, 1, 1);
    System.out.println("Compare Output: " + d1.compareTo(d2));
  }
}
