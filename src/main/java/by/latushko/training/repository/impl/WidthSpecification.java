package by.latushko.training.repository.impl;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.repository.RectangleSpecification;

public class WidthSpecification implements RectangleSpecification {
    private double width;

    public WidthSpecification(double width) {
        this.width = width;
    }

    @Override
    public boolean specify(Rectangle rectangle) {
        return rectangle.getWidth() == width;
    }
}
