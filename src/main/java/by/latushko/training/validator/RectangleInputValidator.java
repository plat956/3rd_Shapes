package by.latushko.training.validator;

public class RectangleInputValidator {
    private static final String RECTANGLE_DOTS_PATTERN = "^[0-9]*\\.?[0-9]*\\s[0-9]*\\.?[0-9]*\\s[0-9]*\\.?[0-9]*\\s[0-9]*\\.?[0-9]*$";

    public boolean validate(String inputString) {
        return inputString != null ? inputString.matches(RECTANGLE_DOTS_PATTERN) : false;
    }
}
