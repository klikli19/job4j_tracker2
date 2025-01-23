package ru.job4j.tracker.tracker.action;

import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.input.Input;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Завершение программы";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Завершить программу");
        return false;
    }
}
