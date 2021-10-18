package by.latushko.training.service;

import by.latushko.training.entity.Point;
import by.latushko.training.entity.Rectangle;

public interface RectangleService {
    boolean isSquare(Rectangle rectangle);

    boolean isQuadrangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint);

    boolean isRectangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint);

    double calculateSquare(Rectangle rectangle);

    double calculatePerimeter(Rectangle rectangle);
}
