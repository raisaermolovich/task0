package by.epam.javawebtraining.yermalovich.task04.model.logic.parser;

import by.epam.javawebtraining.yermalovich.task04.model.entity.Word;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser {

    private static SentenceParser instance;

    private SentenceParser () {
    }

    public static SentenceParser getInstance () {
        if (instance == null) {
            instance = new SentenceParser();
        }
        return instance;
    }

    public List parseSentence(String text) {
        List<Word> list = new ArrayList<>();

        String[] strings = text.split("\\s");

        for (String string : strings) {
            list.add(new Word(string));
            //System.out.println("**" + string);
        }

        return list;
    }
}
