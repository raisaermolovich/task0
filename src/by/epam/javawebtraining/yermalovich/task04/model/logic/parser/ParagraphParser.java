package by.epam.javawebtraining.yermalovich.task04.model.logic.parser;

import by.epam.javawebtraining.yermalovich.task04.model.entity.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser {
    private static ParagraphParser instance;

    private ParagraphParser () {
    }

    public static ParagraphParser getInstance () {
        if (instance == null) {
            instance = new ParagraphParser();
        }
        return instance;
    }

    public List parseParagraph(String text, Boolean codeBlock) {
        List<Sentence> list = new ArrayList<>();

        List<String> list2 = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^.!?][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)",
                Pattern.MULTILINE | Pattern.COMMENTS);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (!codeBlock) {
                list2.add(matcher.group().trim());
            } else {
                list2.add(matcher.group());
            }
        }

        SentenceParser parser = SentenceParser.getInstance();
        for (String string : list2) {
                list.add(new Sentence(parser.parseSentence(string)));
                //System.out.println("**" + string);
        }
        return list;
    }
}