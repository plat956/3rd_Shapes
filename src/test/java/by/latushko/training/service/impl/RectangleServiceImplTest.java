package by.latushko.training.service.impl;

import by.latushko.training.entity.Point;
import by.latushko.training.entity.Rectangle;
import by.latushko.training.service.RectangleService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleServiceImplTest {
    private RectangleService rectangleService;

    @BeforeClass
    public void setUp() {
        rectangleService = new RectangleServiceImpl();
    }

    @Test
    public void testIsSquare() {
        Rectangle rectangle = new Rectangle(new Point(4, 6), 10.4d, 10.4d);
        boolean actual = rectangleService.isSquare(rectangle);
        assertTrue(actual);
    }

    @Test
    public void testIsQuadrangle() {
        Point firstPoint = new Point(2, 2);
        Point secondPoint = new Point(2, 3);
        Point thirdPoint = new Point(6, 5);
        Point fourthPoint = new Point(6, 1);

        boolean actual = rectangleService.isQuadrangle(firstPoint, secondPoint, thirdPoint, fourthPoint);
        assertTrue(actual);
    }

    @Test
    public void testIsRectangle() {
        Point firstPoint = new Point(2, 2);
        Point secondPoint = new Point(2, 3);
        Point thirdPoint = new Point(5, 3);
        Point fourthPoint = new Point(5, 2);

        boolean actual = rectangleService.isRectangle(firstPoint, secondPoint, thirdPoint, fourthPoint);
        assertTrue(actual);
    }

    @Test
    public void testCalculateSquare() {
        Rectangle rectangle = new Rectangle(new Point(1, 1), 5.0d, 10.0d);
        double expected = 50.0d;
        double actual = rectangleService.calculateSquare(rectangle);
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(new Point(6, 12), 9.5d, 3.0d);
        double expected = 25.0d;
        double actual = rectangleService.calculatePerimeter(rectangle);
        assertEquals(actual, expected);
    }
}