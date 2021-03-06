package by.latushko.training.observer.impl;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.observer.RectangleEvent;
import by.latushko.training.observer.RectangleObserver;
import by.latushko.training.service.RectangleService;
import by.latushko.training.service.impl.RectangleServiceImpl;
import by.latushko.training.warehouse.RectangleWarehouse;

public class RectangleObserverImpl implements RectangleObserver {
    @Override
    public void parameterChange(RectangleEvent event) {
        RectangleService rectangleService = new RectangleServiceImpl();
        Rectangle rectangle = event.getSource();

        Long rectangleId = rectangle.getRectangleId();
        double square = rectangleService.calculateSquare(rectangle);
        double perimeter = rectangleService.calculatePerimeter(rectangle);

        RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
        rectangleWarehouse.updateProperties(rectangleId, square, perimeter);
    }
}
