package by.epam.javawebtraining.yermalovich.task04.view;

import org.apache.log4j.Logger;

public class LogPrinter implements Printable{

    public static final Logger LOGGER = Logger.getRootLogger();

    @Override
    public void print(Object message) {
        LOGGER.info(message);
    }
}
