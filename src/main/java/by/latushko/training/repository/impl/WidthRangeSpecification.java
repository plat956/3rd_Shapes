package by.latushko.training.repository.impl;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.repository.RectangleSpecification;

public class WidthRangeSpecification implements RectangleSpecification {
    private double widthFrom;
    private double widthTo;

    public WidthRangeSpecification(double widthFrom, double widthTo) {
        this.widthFrom = widthFrom;
        this.widthTo = widthTo;
    }

    @Override
    public boolean specify(Rectangle rectangle) {
        return rectangle.getWidth() >= widthFrom && rectangle.getWidth() <= widthTo;
    }
}
