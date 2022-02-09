package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Item item = tracker.add(new Item("Replaced item"));
        String idOfItem = String.valueOf(item.getId());
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", idOfItem, replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        String idOfItem = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[]{"0", idOfItem, "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ReplaceAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Изменить заявку" + ln
                        + "1. Выйти из программы" + ln
                        + "=== Изменить заявку ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu." + ln
                        + "0. Изменить заявку" + ln
                        + "1. Выйти из программы" + ln
        ));
    }

    @Test
    public void whenFindAllActionOfTwo() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowAllAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Показать все заявки" + ln
                        + "1. Выйти из программы" + ln
                        + "=== показать все заявки ===" + ln
                        + one + ln
                        + two + ln
                        + "Menu." + ln
                        + "0. Показать все заявки" + ln
                        + "1. Выйти из программы" + ln
        ));
    }

    @Test
    public void whenFindNameActionOfTwo() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", one.getName(), "1"});
        UserAction[] actions = new UserAction[]{
                new FindNameAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Найти заявку по имени" + ln
                        + "1. Выйти из программы" + ln
                        + "=== Найти заявку по имени ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Найти заявку по имени" + ln
                        + "1. Выйти из программы" + ln
        ));
    }

    @Test
    public void whenFindIDActionOfTwo() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"});
        UserAction[] actions = new UserAction[]{
                new FindIDAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Найти заявку по номеру" + ln
                        + "1. Выйти из программы" + ln
                        + "=== Найти заявку по номеру ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Найти заявку по номеру" + ln
                        + "1. Выйти из программы" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"5", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu." + ln
                                + "0. Выйти из программы" + ln
                                + "Некорректный ввод, выберите в диапазоне: 0 .. 0" + ln
                                + "Menu." + ln
                                + "0. Выйти из программы" + ln
                )
        );
    }
}

