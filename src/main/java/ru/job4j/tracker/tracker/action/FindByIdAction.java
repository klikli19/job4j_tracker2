package ru.job4j.tracker.tracker.action;

import ru.job4j.tracker.tracker.Item;
import ru.job4j.tracker.tracker.Tracker;
import ru.job4j.tracker.tracker.input.Input;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Найти задачу по Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Получение задачи по id");
        int id = input.choice("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Задача с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
