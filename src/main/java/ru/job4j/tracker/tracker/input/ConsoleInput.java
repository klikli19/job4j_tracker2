package ru.job4j.tracker.tracker.input;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String actions(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int choice(String question) {
        return Integer.parseInt(actions(question));
    }

}
