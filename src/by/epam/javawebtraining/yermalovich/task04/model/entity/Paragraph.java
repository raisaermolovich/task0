package by.epam.javawebtraining.yermalovich.task04.model.entity;

import by.epam.javawebtraining.yermalovich.task04.model.exception.IncorrectListIndexException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paragraph {
    private List<Sentence> list;
    private boolean codeBlock;

    public Paragraph() {
        list = new ArrayList<>();
        codeBlock = false;
    }

    public Paragraph(List<Sentence> list, boolean codeBlock) {
        this.list = list;
        this.codeBlock = codeBlock;
    }

    public Paragraph(Paragraph another) {
        list = new ArrayList<>();
        for (Sentence sentence : another.getList()) {
            list.add(new Sentence(sentence));
        }
        this.codeBlock = another.isCodeBlock();
    }

    public List<Sentence> getList() {
        return list;
    }

    public void setList(List<Sentence> list) {
        if (list != null) {
            this.list = list;
        }
    }

    public boolean isCodeBlock() {
        return codeBlock;
    }

    public void add(Sentence s) {
        if (s != null) {
            list.add(s);
        }
    }

    public Sentence get(int index) throws Exception {
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
        Paragraph paragraph = (Paragraph) o;
        return codeBlock == paragraph.codeBlock &&
                Objects.equals(list, paragraph.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(list, codeBlock);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Sentence s : list) {
            builder.append(s);
            if (s.toString().matches("\\w")) {
            }
        }
        return builder + "";
    }
}
