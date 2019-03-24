/*Implementation of 6th point of the task (In each sentence to replace the first and the last words without
 *sentence length changing).
 */

package by.epam.javawebtraining.yermalovich.task04.model.logic;

import by.epam.javawebtraining.yermalovich.task04.model.entity.Paragraph;
import by.epam.javawebtraining.yermalovich.task04.model.entity.Sentence;
import by.epam.javawebtraining.yermalovich.task04.model.entity.Text;
import by.epam.javawebtraining.yermalovich.task04.model.entity.Word;

import java.util.List;

public class WordsReplace {

    private WordsReplace() {
    }

    public static Text replaceWords(Text source) {
        Text text = new Text(source);

        for (Paragraph paragraph : text.getList()) {
            if (!paragraph.isCodeBlock()) {
                for (Sentence sentence : paragraph.getList()) {
                    List<Word> words = sentence.getList();

                    int size = words.size();
                    if (size > 1) {

                        String firstWord = words.get(0).getText();
                        String lastWord = words.get(size - 1).getText();
                        String lastChar1 = "";
                        String lastChar2 = "";

                        if (firstWord.matches(".*[,:;]$|\n")) {
                            //System.out.println("TRUE Start");

                            lastChar1 = firstWord.charAt(firstWord.length() - 1) + "";
                            firstWord = firstWord.replaceAll("[,:;]", "");

                        }
                        if (lastWord.matches(".*[.!?:;]$|\n")) {
                            //System.out.println("TRUE End");

                            lastChar2 = lastWord.charAt(lastWord.length() - 1) + " ";
                            lastWord = lastWord.replaceAll("[.!?:;]", "");
                        }

                        StringBuilder builder = new StringBuilder();
                        firstWord = builder.append(firstWord).append(lastChar2) + "";

                        builder = new StringBuilder();
                        lastWord = builder.append(lastWord).append(lastChar1) + "";

                        Word first = new Word(firstWord);
                        Word last = new Word(lastWord);

                        words.add(first);
                        words.add(0, last);
                        words.remove(1);
                        words.remove(size - 1);
                    }
                }
            }
        }
        //System.out.println(text);
        return text;
    }
}
