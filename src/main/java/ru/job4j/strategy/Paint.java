package ru.job4j.strategy;

import java.sql.SQLOutput;

public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}
