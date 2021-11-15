package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public boolean drive() {
        return true;
    }

    @Override
    public int passengers(int quantity) {
        return 13;
    }

    @Override
    public double refuel(double liters) {
        return Transport.super.refuel(liters);
    }
}