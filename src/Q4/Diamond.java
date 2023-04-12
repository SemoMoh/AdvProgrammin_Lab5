package Q4;

import Q2.Shape;
import javafx.geometry.Point2D;

public class Diamond extends Shape implements Movable, Comparable<Diamond> {

  private double length;
  private double width;

  /**
   * constructor to initialize the Diamond
   * @param start the start of the Diamond
   * @param length the length of the Diamond
   * @param width the width of the Diamond
   */
  public Diamond(Point2D start, double length, double width) {
    super(start);
    this.length = length;
    this.width = width;
  }

  /**
   * @return double return the length
   */
  public double getLength() {
    return length;
  }

  /**
   * @param length the length to set
   */
  public void setLength(double length) {
    this.length = length;
  }

  /**
   * @return double return the width
   */
  public double getWidth() {
    return width;
  }

  /**
   * @param width the width to set
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * to draw the Diamond
   */
  @Override
  public void draw() {
    System.out.println("drawing Rectangle");
    System.out.println("Start:" + super.getStart());
    System.out.println("Length: " + this.length);
    System.out.println("Width: " + this.width);
  }

  /**
   * to move the start point of the Diamond to the specified new position
   *@param x : the new x coordinate
   *@param y : the new y coordinate
   */
  @Override
  public void move(double x, double y) {
    super.setStart(new Point2D(x, y));
  }

  /**
   * a method t ocompare between 2 diamonds,
   * it compares the lengths then the widths
   * @param d : the diamond to compare with
   * @return 1 if the diamond is larger than diamond d, 0 if equall, -1 otherwise
   */
  @Override
  public int compareTo(Diamond d) {
    if (this.length < d.length) {
      return 1;
    } else if (this.length == d.length) {
      if (this.width < d.width) {
        return 1;
      } else if (this.width == d.length) {
        return 0;
      } else {
        return -1;
      }
    } else {
      return -1;
    }
  }
}
