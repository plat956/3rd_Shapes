package by.latushko.training.warehouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Warehouse {
    private static Warehouse instance;
    private final Map<Long, RectangleProperties> storage;

    private Warehouse() {
        storage = new HashMap<>();
    }

    public static Warehouse getInstance() {
        if(instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public void putProperties(Long rectangleId, double square, double perimeter) {
        RectangleProperties properties = new RectangleProperties(square, perimeter);
        putProperties(rectangleId, properties);
    }

    public void putProperties(Long rectangleId, RectangleProperties properties) {
        storage.put(rectangleId, properties);
    }

    public Optional<RectangleProperties> getProperties(Long rectangleId) {
        return Optional.of(storage.get(rectangleId));
    }

    public boolean updateProperties(Long rectangleId, double square, double perimeter) {
        if(storage.containsKey(rectangleId)) {
            RectangleProperties properties = storage.get(rectangleId);
            properties.setSquare(square);
            properties.setPerimeter(perimeter);
            return true;
        } else {
            return false;
        }
    }
}
