package ru.job4j.oop;

public class Doctor extends Profession {

    private final String practice;

    public Doctor(String name, String surname, String education, String birthday, String practice) {
        super(name, surname, education, birthday);
        this.practice = practice;
    }

    public String isPractice() {
        return practice;
    }
}
