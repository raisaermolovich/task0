package by.epam.javawebtraining.yermalovich.task04.model.logic.parser;

import by.epam.javawebtraining.yermalovich.task04.model.entity.Paragraph;

import java.util.ArrayList;
import java.util.List;


public class TextParser {

    private static TextParser instance;

    private TextParser () {
    }

    public static TextParser getInstance () {
        if (instance == null) {
            instance = new TextParser();
        }
        return instance;
    }

    public List parseText(String text) {
        List<Paragraph> list = new ArrayList<>();

        String[] strings = text.split("\n");

        ParagraphParser parser = ParagraphParser.getInstance();
        for (String string : strings) {
            Boolean codeBlock = this.recognizeCode(string);
                list.add(new Paragraph(parser.parseParagraph(string, codeBlock), codeBlock));
            //System.out.println("**" + string);
        }

        return list;
    }


    private boolean recognizeCode (String paragraph) {
        boolean codeBlock = false;

        paragraph = paragraph.trim();
        if (paragraph.matches(".*[;{}]\\s*$|\n")) {
            codeBlock = true;
        }
        if (paragraph.matches("^\t*(for|do|while|return|if|//).*")) {
            codeBlock = true;
        }

        if (paragraph.matches(".*[;][\\s]*/{2}.*")) {
            codeBlock = true;
        }
        return codeBlock;
    }
}
