package by.latushko.training.factory;

import by.latushko.training.entity.Point;
import by.latushko.training.entity.Rectangle;

public class ShapeFactory {
    public static Rectangle createRectangle(Point[] points) {
        return new Rectangle(points[0], points[1], points[2], points[3]);
    }
}
