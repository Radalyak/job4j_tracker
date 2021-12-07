package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Выберите опцию: ");
            if (select == 0) {
                System.out.println("=== Создать новую заявку ===");
                String name = input.askStr("Введите имя заявки: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== показать все заявки ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("=== Изменить заявку ===");
                int id = input.askInt("Введите номер заявки: ");
                String name = input.askStr("Введите новое имя заявки: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            } else if (select == 3) {
                System.out.println("=== Удалить заявку ===");
                int id = input.askInt("Введите номер заявки: ");
                if (tracker.delete(id)) {
                    System.out.println("Заявка успешно удалена. ");
                } else {
                    System.out.println("Заявка не найдена");
                }
            } else if (select == 4) {
                System.out.println("=== Найти заявку по номеру ===");
                int id = input.askInt("Введите номер заявки: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка № " + id + " не найдена");
                }
            } else if (select == 5) {
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
            } else if (select == 6) {
                run = false;
            }
        }
    }


    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Измениить заявку",
                "Удалить заявку", "Найти заявку по номеру", "Найти заявку по имени",
                "Выйти из программы"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}