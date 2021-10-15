package by.latushko.training.service.impl;

import by.latushko.training.entity.ShapeSide;
import by.latushko.training.entity.Rectangle;
import by.latushko.training.service.RectangleCalculationService;

public class RectangleCalculationServiceImpl implements RectangleCalculationService {
    @Override
    public int calculateSquare(Rectangle rectangle) {
        ShapeSide height = rectangle.getFirstSide();
        ShapeSide width = rectangle.getThirdSide();
        return height.getLength() * width.getLength();
    }

    @Override
    public int calculatePerimeter(Rectangle rectangle) {
        ShapeSide height = rectangle.getFirstSide();
        ShapeSide width = rectangle.getThirdSide();
        return 2 * (height.getLength() + width.getLength());
    }
}
