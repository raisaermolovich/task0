/*Implementation of 19th point of the task (to remove all vowels in the text).
 */

package by.epam.javawebtraining.yermalovich.task04.model.logic;

import by.epam.javawebtraining.yermalovich.task04.model.entity.Paragraph;
import by.epam.javawebtraining.yermalovich.task04.model.entity.Sentence;
import by.epam.javawebtraining.yermalovich.task04.model.entity.Text;
import by.epam.javawebtraining.yermalovich.task04.model.entity.Word;

public class VowelsRemover {

    private VowelsRemover () {
    }

    public static Text removeVowels(Text source) {
        Text text = new Text(source);

        for (Paragraph paragraph : text.getList()) {
            if (!paragraph.isCodeBlock()) {
                for (Sentence sentence : paragraph.getList()) {
                    for (Word word : sentence.getList()) {
                        word.setText(word.getText().replaceAll("[aeiouyAEIOUY]", ""));
                    }
                }
            }
        }
        return text;
    }
}
