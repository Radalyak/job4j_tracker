package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Внимание едет автобус!");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("В автобусе едет " + quantity + " пассажиров и водитель с черепахой");
    }

    @Override
    public double refuel(double liters) {
        return liters * 52.7;
    }
}