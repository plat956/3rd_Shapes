package by.latushko.training.factory;

import by.latushko.training.entity.Point;
import by.latushko.training.entity.Rectangle;
import by.latushko.training.parser.ParameterPair;

public class ShapeFactory {
    private static final short STARTING_POINT_START_INDEX = 0;
    private static final short STARTING_POINT_END_INDEX = 1;
    private static final short WIDTH_INDEX = 0;
    private static final short HEIGHT_INDEX = 1;

    private ShapeFactory() {
    }

    public static Rectangle createRectangle(ParameterPair parameters) {
        Integer[] startingPointData = parameters.getKey();
        Double[] additionalParametersData = parameters.getValue();

        Point startingPoint = new Point(startingPointData[STARTING_POINT_START_INDEX], startingPointData[STARTING_POINT_END_INDEX]);
        Double width = additionalParametersData[WIDTH_INDEX];
        Double height = additionalParametersData[HEIGHT_INDEX];

        return new Rectangle(startingPoint, width, height);
    }
}
