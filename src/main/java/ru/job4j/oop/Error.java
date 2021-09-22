package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.message = message;
        this.status = status;
        this.active = active;
        }

    public void printInfo() {
        System.out.println("Trouble: " + active);
        System.out.println("Status: " + status);
        System.out.println("Comment message: "  + message);
        }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Page not found");
        error.printInfo();
        Error explicit = new Error();
        explicit.status = 0;
        explicit.active = false;
        explicit.message = "Everything Ok";
        explicit.printInfo();
    }
}
