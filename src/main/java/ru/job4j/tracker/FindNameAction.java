package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявку по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Найти заявку по имени ===");
        String name = input.askStr("Введите имя заявки: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявка с именем: " + name + " не найдна");
        }
        return true;
    }
}
