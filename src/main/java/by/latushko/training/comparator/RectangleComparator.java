package by.latushko.training.comparator;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.warehouse.Warehouse;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;
import java.util.function.ToLongFunction;

public enum RectangleComparator {
    ID,
    STARTING_POINT,
    WIDTH,
    HEIGHT,
    PERIMETER,
    SQUARE;

    public Comparator<Rectangle> getComparator() {
        return switch (this) {
            case ID -> Comparator.comparingLong(Rectangle::getRectangleId);

            case STARTING_POINT -> Comparator.comparingDouble((ToDoubleFunction<Rectangle>) r -> r.getStartingPoint().getX())
                    .thenComparing(r -> r.getStartingPoint().getY());

            case WIDTH -> Comparator.comparingDouble(Rectangle::getWidth);

            case HEIGHT -> Comparator.comparingDouble(Rectangle::getHeight);

            case PERIMETER -> Comparator.comparingDouble((ToDoubleFunction<Rectangle>) r -> Warehouse.getInstance().getProperties(r.getRectangleId())
                    .orElseThrow().getPerimeter());

            case SQUARE -> Comparator.comparingDouble((ToDoubleFunction<Rectangle>) r -> Warehouse.getInstance().getProperties(r.getRectangleId())
                    .orElseThrow().getSquare());

            default -> Comparator.comparingLong(Rectangle::getRectangleId);
        };
    }
}
