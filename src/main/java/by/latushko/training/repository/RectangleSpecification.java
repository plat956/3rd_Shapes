package by.latushko.training.repository;

import by.latushko.training.entity.Rectangle;

@FunctionalInterface
public interface RectangleSpecification {
    boolean specify(Rectangle rectangle);
}
