package by.latushko.training.validator;

public class RectangleInputValidator {
    private static final String RECTANGLE_DOTS_PATTERN = "^\\d*\\:\\d*\\s\\d*\\.?\\d*\\s\\d*\\.?\\d*$";

    public boolean validate(String inputString) {
        return inputString != null ? inputString.matches(RECTANGLE_DOTS_PATTERN) : false;
    }
}
