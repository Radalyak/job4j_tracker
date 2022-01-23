package ru.job4j.oop;

public class Engineer extends Profession {

    private final int category;
    private final String direction;

    public Engineer(String name, String surname, String education,
                    String birthday, int category, String direction) {
        super(name, surname, education, birthday);
        this.category = category;
        this.direction = direction;
    }

    public int getCategory() {
        return category;
    }

    public String getDirection() {
        return direction;
    }
}
