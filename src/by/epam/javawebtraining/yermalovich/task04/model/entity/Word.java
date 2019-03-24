package by.epam.javawebtraining.yermalovich.task04.model.entity;

import java.util.Objects;


public class Word {

    private String text;

    public Word(String text) {
        this.text = text;
    }

    public Word(Word another) {
        this.text = another.getText();
    }

    public void setText (String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(text, word.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return text;
    }
}
