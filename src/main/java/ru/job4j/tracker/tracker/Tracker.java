package ru.job4j.tracker.tracker;

import java.util.List;

public interface Tracker {

    Item add(Item item);

    List<Item> findByName(String name);

    List<Item> findAll();

    boolean replace(int id, Item item);

    void delete(int id);

    Item findById(int id);

}
