package Q2;

import javafx.geometry.Point2D;

public class Line extends Shape {

  private Point2D end;

  /**
   * costructor to initialize the start and the end of the line
   * @param start the start to initialize
   * @param end the end to initialize
   */
  public Line(Point2D start, Point2D end) {
    super(start);
    this.end = end;
  }

  /**
   * @return Point2D return the end
   */
  public Point2D getEnd() {
    return end;
  }

  /**
   * @param end the end to set
   */
  public void setEnd(Point2D end) {
    this.end = end;
  }

  /**
   * To draw the line
   */
  @Override
  public void draw() {
    System.out.println("Drawing Line");
    System.out.println("Start:" + super.getStart());
    System.out.println("End:" + this.end);
  }
}
