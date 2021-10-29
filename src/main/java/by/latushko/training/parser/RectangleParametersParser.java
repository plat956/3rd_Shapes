package by.latushko.training.parser;

import by.latushko.training.exception.RectangleParseException;

public interface RectangleParametersParser {
    ParameterPair parseParameters(String unCasted) throws RectangleParseException;
}
