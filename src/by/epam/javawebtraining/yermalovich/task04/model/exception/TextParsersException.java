package by.epam.javawebtraining.yermalovich.task04.model.exception;

public class TextParsersException extends Exception {

    public TextParsersException() {
        super();
    }

    public TextParsersException(String message) {
        super(message);
    }

    public TextParsersException(Throwable cause) {
        super(cause);
    }

    public TextParsersException(String message, Throwable cause) {
        super(message, cause);
    }

}
