package ru.job4j.oop;

public class Clinicus extends Doctor {

    private final boolean surge;

    public Clinicus(String name, String surname, String education, String birthday, String practice, boolean surge) {
        super(name, surname, education, birthday, practice);
        this.surge = surge;
    }

    public boolean isSurge() {
        return surge;
    }
}