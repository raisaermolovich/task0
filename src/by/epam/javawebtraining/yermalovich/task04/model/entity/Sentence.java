package by.epam.javawebtraining.yermalovich.task04.model.entity;

import by.epam.javawebtraining.yermalovich.task04.model.exception.IncorrectListIndexException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    private List<Word> list;

    public Sentence() {
        list = new ArrayList<>();
    }

    public Sentence(List<Word> list) {
        this.list = list;
    }

    public Sentence(Sentence another) {
        list = new ArrayList<>();
        for (Word word : another.getList()) {
            list.add(new Word(word));
        }
    }

    public List<Word> getList() {
        return list;
    }

    public void setList(List<Word> text) {
        if (text != null) {
            this.list = text;
        }
    }

    public void add(Word s) {
        if (s != null) {
            list.add(s);
        }
    }

    public Word get(int index) throws Exception {
        if (index > -1 && index < list.size()) {
            return list.get(index);
        } else {
            throw new IncorrectListIndexException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(list, sentence.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(list);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
        builder.append(list.get(i));
            if (i != list.size() - 1) {
                builder.append(" ");
            }
        }
        return builder + "";

    }
}
