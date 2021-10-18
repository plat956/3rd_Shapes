package by.latushko.training.repository.impl;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.repository.RectangleSpecification;

public class SquareSpecification implements RectangleSpecification {
    @Override
    public boolean specify(Rectangle rectangle) {
        return false; //todo
    }
}
