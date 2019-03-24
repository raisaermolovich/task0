package by.epam.javawebtraining.yermalovich.task04.model.entity;

import by.epam.javawebtraining.yermalovich.task04.model.exception.IncorrectListIndexException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private List<Paragraph> list;

    public Text() {
        list = new ArrayList<>();
    }

    public Text(List<Paragraph> list) {
        this.list = list;
    }

    public Text(Text another) {
        list = new ArrayList<>();
        for (Paragraph paragraph : another.getList()) {
            list.add(new Paragraph(paragraph));
        }
    }

    public List<Paragraph> getList() {
        return list;
    }

    public void setList(List<Paragraph> list) {
        if (list != null) {
            this.list = list;
        }
    }

    public void add(Paragraph p) {
        if (p != null) {
            list.add(p);
        }
    }

    public Paragraph get(int index) throws Exception {
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
        Text text1 = (Text) o;
        return Objects.equals(list, text1.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(list);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Paragraph p : list) {
            builder.append(p).append("\r\n");
        }
        return builder + "";
    }
}
