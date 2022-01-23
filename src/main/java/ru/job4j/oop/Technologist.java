package ru.job4j.oop;

public class Technologist extends Engineer {

    private final boolean writeTecnology;

    public Technologist(String name, String surname, String education, String birthday,
                        int category, String direction, Boolean writeTecnology) {
        super(name, surname, education, birthday, category, direction);
        this.writeTecnology = writeTecnology;
    }

    public boolean isWriteTecnology() {
        return writeTecnology;
    }
}
