package by.latushko.training.validator;

import by.latushko.training.entity.Rectangle;

public class RectangleValidator {
    //является ли прямоугольник квадратом
    public boolean isQuadrate(Rectangle rectangle) {
        return rectangle.getFirstSide().getLength() == rectangle.getThirdSide().getLength() &&
                rectangle.getSecondSide().getLength() == rectangle.getFourthSide().getLength();
    }
}
