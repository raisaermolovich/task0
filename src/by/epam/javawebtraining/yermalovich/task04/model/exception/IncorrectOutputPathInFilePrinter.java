package by.epam.javawebtraining.yermalovich.task04.model.exception;

public class IncorrectOutputPathInFilePrinter extends TechnicalTextParsersException {

    public IncorrectOutputPathInFilePrinter () {
        super();
    }

    public IncorrectOutputPathInFilePrinter (String message) {
        super(message);
    }

    public IncorrectOutputPathInFilePrinter (Throwable cause) {
        super(cause);
    }

    public IncorrectOutputPathInFilePrinter (String message, Throwable cause) {
        super(message, cause);
    }

}
