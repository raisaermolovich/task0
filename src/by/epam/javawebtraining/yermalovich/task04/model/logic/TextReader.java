package by.epam.javawebtraining.yermalovich.task04.model.logic;

import by.epam.javawebtraining.yermalovich.task04.model.exception.FileReaderException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TextReader {

    public String readText(String fileName) throws FileReaderException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            StringBuilder builder = new StringBuilder();
            String tmp;

            while ((tmp = reader.readLine()) != null) {
                builder.append(tmp).append("\n");
            }

            String result = builder.toString();

            //System.out.println(result);

            return result;
        } catch (IOException e) {
            throw new FileReaderException(e);
        }
    }
}

