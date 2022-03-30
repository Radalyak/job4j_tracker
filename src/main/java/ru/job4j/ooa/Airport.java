package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus AIRBUS = new Airbus("A320");
        AIRBUS.printModel();
        AIRBUS.printCountEngine();

        AIRBUS.setName("A380");
        AIRBUS.printModel();
        AIRBUS.printCountEngine();
    }
}
