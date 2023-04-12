package Q2;

import javafx.geometry.Point2D;

public class Rectangle extends Shape {

  private double length;
  private double width;

  /**
   * constructor to initialize the Rectangle
   * @param start the start of the rectangle
   * @param length the length of the rectangle
   * @param width the width of the rectangle
   */
  public Rectangle(Point2D start, double length, double width) {
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
   * to draw the rectangle
   */
  @Override
  public void draw() {
    System.out.println("drawing Rectangle");
    System.out.println("Start:" + super.getStart());
    System.out.println("Length: " + this.length);
    System.out.println("Width: " + this.width);
  }
}
