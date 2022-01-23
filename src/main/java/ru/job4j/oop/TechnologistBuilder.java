package ru.job4j.oop;

public class TechnologistBuilder {
    private String name;
    private String surname;
    private String education;
    private String birthday;
    private int category;
    private String direction;
    private Boolean writeTecnology;

    public TechnologistBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TechnologistBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public TechnologistBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    public TechnologistBuilder setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public TechnologistBuilder setCategory(int category) {
        this.category = category;
        return this;
    }

    public TechnologistBuilder setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public TechnologistBuilder setWriteTecnology(Boolean writeTecnology) {
        this.writeTecnology = writeTecnology;
        return this;
    }

    public Technologist createTechnologist() {
        return new Technologist(name, surname, education, birthday, category,
                direction, writeTecnology);
    }
}