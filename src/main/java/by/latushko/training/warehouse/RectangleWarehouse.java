package by.latushko.training.warehouse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RectangleWarehouse {
    private static final Logger logger = LogManager.getLogger();
    private static RectangleWarehouse instance;
    private final Map<Long, RectangleProperties> storage;

    private RectangleWarehouse() {
        storage = new HashMap<>();
    }

    public static RectangleWarehouse getInstance() {
        if(instance == null) {
            instance = new RectangleWarehouse();
        }
        return instance;
    }

    public void putProperties(Long rectangleId, double square, double perimeter) {
        RectangleProperties properties = new RectangleProperties(square, perimeter);
        putProperties(rectangleId, properties);
    }

    public void putProperties(Long rectangleId, RectangleProperties properties) {
        storage.put(rectangleId, properties);
        logger.info("Properties successfully added for {}", rectangleId);
    }

    public Optional<RectangleProperties> getProperties(Long rectangleId) {
        return Optional.of(storage.get(rectangleId));
    }

    public boolean updateProperties(Long rectangleId, double square, double perimeter) {
        if(storage.containsKey(rectangleId)) {
            RectangleProperties properties = storage.get(rectangleId);
            properties.setSquare(square);
            properties.setPerimeter(perimeter);
            logger.info("Properties successfully updated for {}", rectangleId);
            return true;
        } else {
            logger.error("Rectangle {} doesn't exist in storage", rectangleId);
            return false;
        }
    }
}
