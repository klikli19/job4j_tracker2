package ru.job4j.tracker.tracker.action;

import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.input.Input;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Найти задачу по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Получение задач по имени");
        String name = input.actions("Введите имя: ");
        List<Item> items = tracker.findByName(name);
        if (!items.isEmpty()) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Задача с именем: " + name + " не найдены.");
        }
        return true;
    }
}
