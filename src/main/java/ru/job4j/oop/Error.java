package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        System.out.println("Trouble: " + active);
        System.out.println("Status: " + status);
        System.out.println("Comment message: "  + message);
        }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Page not found");
        Error explicit = new Error();
        explicit.status = 0;
        explicit.active = false;
        explicit.message = "Everything Ok";
        System.out.println("Trouble: " + explicit.active + "; status: "
                + explicit.status + "; Message: " + explicit.message);
    }
}
