package by.epam.javawebtraining.yermalovich.task04.view;

public class ConsolePrinter implements Printable {

    @Override
    public void print(Object message) {
        System.out.println(message);
    }
}
