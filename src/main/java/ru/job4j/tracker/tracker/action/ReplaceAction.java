package ru.job4j.tracker.tracker.action;

import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.input.Input;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Изменить задачу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.choice("Введите id задачи: ");
        String name = input.actions("Введите новое имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Задача изменена успешно.");
        } else {
            System.out.println("Ошибка при изменении.");
        }
        return true;
    }
}
