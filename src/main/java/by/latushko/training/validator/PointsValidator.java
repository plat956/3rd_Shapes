package by.latushko.training.validator;

import by.latushko.training.entity.Point;

public class PointsValidator {
    public boolean isRectangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        return (!firstPoint.equals(secondPoint) && (firstPoint.getX() == secondPoint.getX() || firstPoint.getY() == secondPoint.getY())) &&
                (!secondPoint.equals(thirdPoint) && (secondPoint.getX() == thirdPoint.getX() || secondPoint.getY() == thirdPoint.getY())) &&
                (!thirdPoint.equals(fourthPoint) && (thirdPoint.getX() == fourthPoint.getX() || thirdPoint.getY() == fourthPoint.getY()));
    }

    //составляют ли точки четырехугольник
    public boolean isQuadrangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        return !isAtTheSameLine(firstPoint, secondPoint, thirdPoint) && !isAtTheSameLine(secondPoint, thirdPoint, fourthPoint);
    }

    //располагаются ли 3 точки на 1 прямой
    private boolean isAtTheSameLine(Point firstPoint, Point secondPoint, Point thirdPoint) {
        return (firstPoint.getX() == secondPoint.getX() && secondPoint.getX() == thirdPoint.getX()) ||
                (firstPoint.getY() == secondPoint.getY() && secondPoint.getY() == thirdPoint.getY());
    }
}
