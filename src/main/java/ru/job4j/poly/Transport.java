package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int quantity);

    default double refuel(double liters) {
        return liters * 52.7;
    }
}