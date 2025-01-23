package ru.job4j.tracker.tracker.input;

public interface Input {
    String actions(String question);

    int choice(String question);
}
