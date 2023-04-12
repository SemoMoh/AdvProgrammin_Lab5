package Q2;

import javafx.geometry.Point2D;

public abstract class Shape {

  private Point2D start;

  /**
   * Constructor to initallize the start point
   * @param start : Point2D
   */
  public Shape(Point2D start) {
    this.start = start;
  }

  /**
   * @return Point2D return the start
   */
  public Point2D getStart() {
    return start;
  }

  /**
   * @param start the start to set
   */
  public void setStart(Point2D start) {
    this.start = start;
  }

  public abstract void draw();
}
