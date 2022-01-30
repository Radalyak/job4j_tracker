package ru.job4j.tracker;

public class FindIDAction implements UserAction {
    private final Output out;

    public FindIDAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Найти заявку по номеру";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Найти заявку по номеру ===");
        int id = input.askInt("Введите номер заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка № " + id + " не найдена");
        }

        return true;
    }
}
