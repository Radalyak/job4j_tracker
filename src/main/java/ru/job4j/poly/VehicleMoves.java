package ru.job4j.poly;

public class VehicleMoves {
    public static void main(String[] args) {
        Vehicle pazik = new Bus();
        Vehicle kukuruznik = new Plane();
        Vehicle parovozik = new Train();

        Vehicle[] vehicles = new Vehicle[]{pazik,  kukuruznik, parovozik};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
