package by.latushko.training.parser;

import by.latushko.training.exception.RectangleParseException;
import by.latushko.training.util.Pair;

public interface RectangleParametersParser {
    Pair<Integer[], Double[]> parseParameters(String unCasted) throws RectangleParseException;
}
