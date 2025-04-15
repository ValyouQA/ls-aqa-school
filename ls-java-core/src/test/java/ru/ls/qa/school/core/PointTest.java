package ru.ls.qa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    public void testDistance() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 6);

        double expectedDistance = 5.0;
        assertEquals(expectedDistance, p1.distance(p2), 0.001);
    }

    @Test
    public void testDistanceSamePoint() {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(3, 3);

        assertEquals(0, p1.distance(p2), 0.001);
    }
}