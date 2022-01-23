package ru.job4j.oop;

public class Pathologist extends Doctor {

    private final boolean clientIsDead;

    public Pathologist(String name, String surname, String education, String birthday,
                       String practice, boolean clientIsDead) {
        super(name, surname, education, birthday, practice);
        this.clientIsDead = clientIsDead;
    }

    public boolean isClientIsDead() {
        return clientIsDead;
    }
}
