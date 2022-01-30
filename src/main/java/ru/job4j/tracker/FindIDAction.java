package ru.job4j.tracker;

public class FindIDAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявку по номеру";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Найти заявку по номеру ===");
        int id = input.askInt("Введите номер заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка № " + id + " не найдена");
        }

        return true;
    }
}
