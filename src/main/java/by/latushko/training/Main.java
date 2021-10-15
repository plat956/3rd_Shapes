package by.latushko.training;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.exception.InputFileReadException;
import by.latushko.training.exception.RectangleParseException;
import by.latushko.training.parser.RectangleParser;
import by.latushko.training.parser.impl.RectangleParserImpl;
import by.latushko.training.reader.impl.DataReaderImpl;
import by.latushko.training.validator.RectangleInputValidator;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InputFileReadException {
        DataReaderImpl dataReader = new DataReaderImpl();
        List<String> lines = dataReader.readLines("data/input.txt");
        for(String s: lines) {
            RectangleParser p = new RectangleParserImpl();
            Rectangle rect = null;
            try {
                rect = p.parseRectangle(s);
            } catch (RectangleParseException e) {
            }

            RectangleInputValidator rectangleInputValidator = new RectangleInputValidator();
            boolean b = rectangleInputValidator.validate(s);
            b = false;
        }

        lines = null;
    }
}
