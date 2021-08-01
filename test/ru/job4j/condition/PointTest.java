package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point point = new Point(x1, y1);
        Point pointTwo = new Point(x2, y2);
        double out = point.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to22then0() {
        double expected = 0;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 2;
        Point point = new Point(x1, y1);
        Point pointTwo = new Point(x2, y2);
        double out = point.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to21then282() {
        double expected = 2.82;
        int x1 = 0;
        int y1 = 3;
        int x2 = 2;
        int y2 = 1;
        Point point = new Point(x1, y1);
        Point pointTwo = new Point(x2, y2);
        double out = point.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to48then36() {
        double expected = 3.6;
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 0;
        Point point = new Point(x1, y1);
        Point pointTwo = new Point(x2, y2);
        double out = point.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to28To1216then22() {
        double expected = 2.2;
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 0;
        int z1 = 12;
        int z2 = 16;
        Point point = new Point(x1, y1, z1);
        Point pointTwo = new Point(x2, y2, z2);
        double out = point.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.1);
    }

}
