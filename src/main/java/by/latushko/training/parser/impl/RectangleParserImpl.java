package by.latushko.training.parser.impl;

import by.latushko.training.entity.Point;
import by.latushko.training.entity.Rectangle;
import by.latushko.training.exception.RectangleParseException;
import by.latushko.training.factory.ShapeFactory;
import by.latushko.training.parser.RectangleParser;
import by.latushko.training.validator.RectangleInputValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class RectangleParserImpl implements RectangleParser {
    private static final Logger logger = LogManager.getLogger();
    private static final String SPACE_DELIMITER = "\\s+";
    private static final String DOT_DELIMITER = "\\.";

    @Override
    public Rectangle parseRectangle(String unCasted) throws RectangleParseException {
        RectangleInputValidator rectangleInputValidator = new RectangleInputValidator();
        if(!rectangleInputValidator.validate(unCasted)) {
            logger.error("Line \"{}\" contains invalid characters for Rectangle casting", unCasted);
            throw new RectangleParseException("That's impossible to cast " + unCasted + " to Rectangle class");
        }
        String[] tempPoints = unCasted.split(SPACE_DELIMITER);
        Point[] points = new Point[4];
        for (int i = 0; i < tempPoints.length; i++) {
            Integer[] parsedValues = Arrays.stream(tempPoints[i].split(DOT_DELIMITER)).map(Integer::parseInt).toArray(Integer[]::new);
            points[i] = new Point(parsedValues[0], parsedValues[1]);
        }

        return ShapeFactory.createRectangle(points);
    }
}
