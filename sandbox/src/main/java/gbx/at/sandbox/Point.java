package gbx.at.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x1, double y1) {
    this.x = x1;
    this.y = y1;
  }

  public double distance(Point p1) {
    return Math.sqrt((p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y));
  }

  @Override
  public String toString() {
    return  "x=" + x +
            ", y=" + y;
  }

}
