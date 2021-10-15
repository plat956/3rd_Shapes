package by.latushko.training.exception;

public class RectangleParseException extends Exception{
    public RectangleParseException() {
        super();
    }

    public RectangleParseException(String message) {
        super(message);
    }

    public RectangleParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public RectangleParseException(Throwable cause) {
        super(cause);
    }
}
