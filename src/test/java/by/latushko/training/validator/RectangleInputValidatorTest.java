package by.latushko.training.validator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleInputValidatorTest {
    private RectangleInputValidator rectangleInputValidator;

    @BeforeClass
    public void setUp() {
        rectangleInputValidator = new RectangleInputValidator();
    }

    @Test
    public void testValidateTrue() {
        boolean actual = rectangleInputValidator.validate("4:4 3.0 5.3");
        assertTrue(actual);
    }

    @Test
    public void testValidateFalse() {
        boolean actual = rectangleInputValidator.validate("5:4334d 3d -10");
        assertFalse(actual);
    }
}