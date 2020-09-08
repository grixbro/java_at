package gbx.at.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testArea1() {
    Point p1 = new Point(2,2);
    Point p2 = new Point(4,4);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
  }

  @Test
  public void testArea2() {
    Point p1 = new Point(1,1);
    Point p2 = new Point(10,10);
    Assert.assertEquals(p1.distance(p2), 12.727922061357855);
  }

  @Test
  public void testArea3() {
    Point p1 = new Point(-100,28);
    Point p2 = new Point(91,-5);
    Assert.assertEquals(p1.distance(p2), 193.82982226685345);
  }
  
}
