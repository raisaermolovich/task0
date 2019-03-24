package by.epam.javawebtraining.yermalovich.task04.model.exception;

public class TechnicalTextParsersException extends TextParsersException {

    public TechnicalTextParsersException() {
        super();
    }

    public TechnicalTextParsersException(String message) {
        super(message);
    }

    public TechnicalTextParsersException(Throwable cause) {
        super(cause);
    }

    public TechnicalTextParsersException(String message, Throwable cause) {
        super(message, cause);
    }
}
