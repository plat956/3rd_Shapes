package by.latushko.training.repository.impl;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.repository.RectangleSpecification;
import by.latushko.training.warehouse.RectangleProperties;
import by.latushko.training.warehouse.RectangleWarehouse;

public class PerimeterSpecification implements RectangleSpecification {
    private double perimeterFrom;
    private double perimeterTo;

    public PerimeterSpecification(double perimeterFrom, double perimeterTo) {
        this.perimeterFrom = perimeterFrom;
        this.perimeterTo = perimeterTo;
    }

    @Override
    public boolean specify(Rectangle rectangle) {
        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        RectangleProperties properties = rectangleWarehouse.getProperties(rectangle.getRectangleId()).orElseThrow();
        return properties.getPerimeter() >= perimeterFrom && properties.getPerimeter() <= perimeterTo;
    }
}
