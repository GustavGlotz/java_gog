package ru.gog.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance() {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(6, 2);
        Assert.assertEquals(p1.distance(p2), 5.0990195135927845);
    }
    @Test
    public void testDistance2() {
        Point p1 = new Point(7, 8);
        Point p2 = new Point(0.4, 4);
        Assert.assertEquals(p1.distance(p2),7.717512552629895);
    }
}
