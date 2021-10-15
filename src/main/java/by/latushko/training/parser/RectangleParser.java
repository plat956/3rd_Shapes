package by.latushko.training.parser;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.exception.RectangleParseException;

public interface RectangleParser {
    Rectangle parseRectangle(String unCasted) throws RectangleParseException;
}
