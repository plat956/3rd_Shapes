package by.latushko.training.service.impl;

import by.latushko.training.entity.Point;
import by.latushko.training.entity.Rectangle;
import by.latushko.training.service.RectangleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RectangleServiceImpl implements RectangleService {
    private static final Logger logger = LogManager.getLogger();
    @Override
    public boolean isSquare(Rectangle rectangle) {
        return rectangle.getWidth() == rectangle.getHeight();
    }

    @Override
    public boolean isQuadrangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        return !isPointsAtTheSameLine(firstPoint, secondPoint, thirdPoint) && !isPointsAtTheSameLine(secondPoint, thirdPoint, fourthPoint);
    }

    @Override
    public boolean isRectangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        return (!firstPoint.equals(secondPoint) && (firstPoint.getX() == secondPoint.getX() || firstPoint.getY() == secondPoint.getY())) &&
                (!secondPoint.equals(thirdPoint) && (secondPoint.getX() == thirdPoint.getX() || secondPoint.getY() == thirdPoint.getY())) &&
                (!thirdPoint.equals(fourthPoint) && (thirdPoint.getX() == fourthPoint.getX() || thirdPoint.getY() == fourthPoint.getY()));
    }

    @Override
    public double calculateSquare(Rectangle rectangle) {
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();
        double result = width * height;

        logger.info("Square of the rectangle {} is {}", rectangle.getRectangleId(), result);
        return result;
    }

    @Override
    public double calculatePerimeter(Rectangle rectangle) {
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();
        double result = 2 * (width + height);

        logger.info("Perimeter of the rectangle {} is {}", rectangle.getRectangleId(), result);
        return result;
    }

    private boolean isPointsAtTheSameLine(Point firstPoint, Point secondPoint, Point thirdPoint) {
        return (firstPoint.getX() == secondPoint.getX() && secondPoint.getX() == thirdPoint.getX()) ||
                (firstPoint.getY() == secondPoint.getY() && secondPoint.getY() == thirdPoint.getY());
    }
}
