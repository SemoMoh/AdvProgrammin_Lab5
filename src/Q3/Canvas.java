package Q3;

import Q2.*;
import java.util.ArrayList;
import javafx.geometry.Point2D;

public class Canvas {

  private ArrayList<Shape> shapes;

  /**
   * constructor to create the Canvas
   */
  public Canvas() {
    shapes = new ArrayList<Shape>();
  }

  /**
   * to add a new shape to the Canvas
   * @param shape shape to add
   */
  public void addShape(Shape shape) {
    this.shapes.add(shape);
  }

  /**
   * to remove a shape from the Canvas
   * @param shape : shape to remove
   * @return true if the shape was found and removed, false otherwise
   */
  public boolean removeShape(Shape shape) {
    for (Shape s : this.shapes) {
      if (s.equals(shape)) {
        this.shapes.remove(shape);
        return true;
      }
    }
    //if not found
    return false;
  }

  /**
   * to get shape that its start is the closest to the specified point
   * @param point : the specified point
   * @return the closest shape
   */
  public Shape getShape(Point2D x) {
    double distance;
    double minDistance = 0;
    Shape closestShape = null;
    boolean c = false;
    for (Shape s : this.shapes) {
      distance = x.distance(s.getStart());
      if (!c) { // for the first shape in the canvas
        minDistance = distance;
        c = true;
        closestShape = s;
      }
      if (distance < minDistance && c) { // to chaeck each other shape in the canvas
        minDistance = distance;
        closestShape = s;
      }
    }
    return closestShape;
  }

  /**
   * to draw all the shapes in the Canvas
   */
  public void drawAll() {
    int counter = 1;
    for (Shape s : shapes) {
      System.out.println("------Shape no.:" + counter++);
      s.draw();
    }
  }
}
