package ru.job4j.poly;

public interface Transport {
    boolean drive();

    int passengers(int quantity);

    default double refuel(double liters) {
        return liters * 52.7;
    }
}

