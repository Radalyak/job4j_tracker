package ru.job4j.oop;

import javax.sound.midi.Soundbank;

public class Cat {

//   public String sound() {
//        String voice = "may-may";
//        return voice;
//    }

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
//        System.out.println("There are gav's food.");
//        Cat gav = new Cat();
//        gav.eat("kotleta");
//        gav.show();
//        System.out.println("There are black's food.");
//       Cat black = new Cat();
//        black.eat("fish");
//        black.show();
        Cat mir = new Cat();
        mir.giveNick("Mirik");
        mir.eat("mushroom");
        mir.show();

    }
}
