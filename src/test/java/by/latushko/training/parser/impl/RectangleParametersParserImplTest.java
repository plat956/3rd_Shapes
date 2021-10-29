package by.latushko.training.parser.impl;

import by.latushko.training.exception.RectangleParseException;
import by.latushko.training.parser.RectangleParametersParser;
import by.latushko.training.parser.ParameterPair;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleParametersParserImplTest {
    private RectangleParametersParser rectangleParametersParser;

    @BeforeClass
    public void setUp() {
        rectangleParametersParser = new RectangleParametersParserImpl();
    }

    @Test
    public void testParseParameters() {
        ParameterPair expected = new ParameterPair(
                new Integer[]{1, 1},
                new Double[]{2.1d, 4.3d}
        );

        ParameterPair actual = null;
        try {
            actual = rectangleParametersParser.parseParameters("1:1 2.1 4.3");
        } catch (RectangleParseException ex) {
            fail("Something went wrong during parsing data", ex);
        }

        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = RectangleParseException.class)
    public void testParseParametersException() throws RectangleParseException {
        rectangleParametersParser.parseParameters("1:1 2.1f 4.3");
    }
}