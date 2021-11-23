package ru.job4j.poly;

public class Train implements Vehicle {

    public void move() {
        System.out.println(getClass().getSimpleName()
                + " катится по рельсам");
    }
}
