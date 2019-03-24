package by.epam.javawebtraining.yermalovich.task04.controller;

import by.epam.javawebtraining.yermalovich.task04.model.logic.WordsReplace;
import by.epam.javawebtraining.yermalovich.task04.model.logic.parser.TextParser;
import by.epam.javawebtraining.yermalovich.task04.model.entity.Text;
import by.epam.javawebtraining.yermalovich.task04.model.logic.TextReader;
import by.epam.javawebtraining.yermalovich.task04.view.FilePrinter;

public class Main {
    public static void main(String[] args) {

        try {
            TextReader reader = new TextReader();
            String string =  reader.readText("text.txt");

            TextParser parser = TextParser.getInstance();

            Text text = new Text(parser.parseText(string));
            //System.out.print(text);

            //System.out.println(VowelsRemover.removeVowels(text));
            //System.out.print(text);

            //WordsReplace.replaceWords(text);
            System.out.println(WordsReplace.replaceWords(text));
            //System.out.print(text);

            FilePrinter printer = new FilePrinter("copy.txt");
            printer.print(text);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
