package by.latushko.training.parser.impl;

import by.latushko.training.exception.RectangleParseException;
import by.latushko.training.parser.RectangleParametersParser;
import by.latushko.training.util.Pair;
import by.latushko.training.validator.RectangleInputValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


public class RectangleParametersParserImpl implements RectangleParametersParser {
    private static final Logger logger = LogManager.getLogger();
    private static final String SPACE_DELIMITER = "\\s+";
    private static final String POINT_DELIMITER = "\\:";
    private static final short STARTING_POINT_INDEX = 0;
    private static final short WIDTH_INDEX = 1;
    private static final short HEIGHT_INDEX = 2;

    @Override
    public Pair<Integer[], Double[]> parseParameters(String unCasted) throws RectangleParseException {
        RectangleInputValidator rectangleInputValidator = new RectangleInputValidator();
        if(!rectangleInputValidator.validate(unCasted)) {
            logger.error("Line \"{}\" contains invalid characters for Rectangle casting", unCasted);
            throw new RectangleParseException("That's impossible to cast " + unCasted + " to Rectangle class");
        }

        String[] tempData = unCasted.split(SPACE_DELIMITER);

        Integer[] startingPointData = Arrays.stream(tempData[STARTING_POINT_INDEX].split(POINT_DELIMITER)).map(Integer::parseInt).toArray(Integer[]::new);

        Double width = Double.valueOf(tempData[WIDTH_INDEX]);
        Double height = Double.valueOf(tempData[HEIGHT_INDEX]);
        Double[] additionalData = new Double[]{width, height};

        return new Pair<>(startingPointData, additionalData);
    }
}
