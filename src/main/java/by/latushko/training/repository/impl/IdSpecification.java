package by.latushko.training.repository.impl;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.repository.RectangleSpecification;

public class IdSpecification implements RectangleSpecification {
    private Long id;

    public IdSpecification(Long id) {
        this.id = id;
    }

    @Override
    public boolean specify(Rectangle rectangle) {
        return rectangle.getRectangleId() == id;
    }
}
