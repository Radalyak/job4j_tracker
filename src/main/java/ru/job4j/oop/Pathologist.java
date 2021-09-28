package ru.job4j.oop;

public class Pathologist extends Doctor {

    private final boolean clentIsDead;

    public Pathologist(String name, String surname, String education, String birthday, String practice, boolean clentIsDead) {
        super(name, surname, education, birthday, practice);
        this.clentIsDead = clentIsDead;
    }

    public boolean isClentIsDead() {
        return clentIsDead;
    }
}
