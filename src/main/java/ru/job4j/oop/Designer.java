package ru.job4j.oop;

public class Designer extends Engineer {

    private final boolean writeDrawing;

    public Designer(String name, String surname, String education,
                    String birthday, int category, String direction,
                    Boolean writeDrawing) {
        super(name, surname, education, birthday, category, direction);
        this.writeDrawing = writeDrawing;
    }

    public boolean isWriteDrawing() {
        return writeDrawing;
    }
}