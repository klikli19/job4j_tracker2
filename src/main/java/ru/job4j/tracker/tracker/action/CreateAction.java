package ru.job4j.tracker.tracker.action;

import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.input.Input;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "Добавить новую задачу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Создать задачу");
        String name = input.actions("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная задача: " + item);
        return true;
    }
}
