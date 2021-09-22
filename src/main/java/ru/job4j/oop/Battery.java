package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int percent) {
        this.load = percent;
    }

    public void exchange(Battery another) {
        this.load += another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(34);
        Battery second = new Battery(50);
        System.out.println("first was(percent) " + first.load
            + " second was(percent) " + second.load);
        first.exchange(second);
        System.out.println("first become(percent) " + first.load
                + " second become(percent) " + second.load);
    }
}
