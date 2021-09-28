package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Cat's name " + this.name);
        System.out.println("And his food is " + this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public static void main(String[] args) {
        Cat mir = new Cat();
        mir.giveNick("Mirik");
        mir.eat("mushroom");
        mir.show();

    }
}
