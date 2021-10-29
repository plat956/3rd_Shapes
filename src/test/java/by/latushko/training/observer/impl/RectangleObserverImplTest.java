package by.latushko.training.observer.impl;

import by.latushko.training.entity.Point;
import by.latushko.training.entity.Rectangle;
import by.latushko.training.factory.ShapeFactory;
import by.latushko.training.observer.RectangleObserver;
import by.latushko.training.warehouse.RectangleProperties;
import by.latushko.training.warehouse.RectangleWarehouse;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleObserverImplTest {

    @Test
    public void testParameterChange() {
        Rectangle rectangle = new Rectangle(new Point(4, 6), 5, 10);

        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        rectangleWarehouse.putProperties(rectangle.getRectangleId(), 35, 10);

        RectangleObserver observer = new RectangleObserverImpl();
        rectangle.attach(observer);

        rectangle.setHeight(5);
        rectangle.setWidth(20);

        RectangleProperties actual = rectangleWarehouse.getProperties(rectangle.getRectangleId()).orElse(null);
        RectangleProperties expected = new RectangleProperties(100, 50);

        assertEquals(actual, expected);
    }
}