package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
      Bus pazik = new Bus();
    }

    @Override
    public void passengers(int quantity) {
        Bus nemecFrancuzRusski = new Bus();
    }

    @Override
    public double refuel(double liters) {
        return Transport.super.refuel(liters);
    }
}