package by.latushko.training.repository.impl;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.repository.RectangleSpecification;

public class OffsetOverStartOfTheCoordinateAxisSpecification implements RectangleSpecification {
    private int offsetX;
    private int offsetY;

    public OffsetOverStartOfTheCoordinateAxisSpecification(int offsetX, int offsetY) {
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    @Override
    public boolean specify(Rectangle rectangle) {
        double x = rectangle.getStartingPoint().getX() + rectangle.getWidth();
        double y = rectangle.getStartingPoint().getY() + rectangle.getHeight();

        return x <= offsetX && y <= offsetY;
    }
}
