package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        this.active = false;
        this.status = 0;
        this.message = "No error";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active " + active);
        System.out.println("Status " + status);
        System.out.println("Message " + message);
        System.out.println();

    }

    public static void main(String[] args) {
        Error defaultError = new Error();

        Error fileNotFound = new Error(true, 404, "File not found");
        Error accessDenied = new Error(true, 403, "Access denied");
        Error success = new Error(false, 200, "Operation completed successfully");
        Error serverError = new Error(true, 500, "Internal server error");

        System.out.println("Default error:");
        defaultError.printInfo();

        System.out.println("File not found error:");
        fileNotFound.printInfo();

        System.out.println("Access denied error:");
        accessDenied.printInfo();

        System.out.println("Success status:");
        success.printInfo();

        System.out.println("Server error:");
        serverError.printInfo();
    }
}

