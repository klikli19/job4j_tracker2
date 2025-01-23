package ru.job4j.tracker.tracker;

import ru.job4j.tracker.tracker.action.*;
import ru.job4j.tracker.tracker.input.ConsoleInput;
import ru.job4j.tracker.tracker.input.Input;

import java.util.List;

public class StartUI {

    public void startMenu(Input input, MemTracker tracker, List<UserAction> actions) {
        boolean start = true;
        while (start) {
            showMenu(actions);
            int select = input.choice("Выбрать: ");
            if (select < 0 || select >= actions.size()) {
                System.out.println("Неверный ввод " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            start = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Меню:");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = List.of(
                new CreateAction(),
                new DeleteAction(),
                new ReplaceAction(),
                new FindAllAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        );
        new StartUI().startMenu(input, memTracker, actions);
    }
}
