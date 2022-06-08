package ru.skypro.exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
        System.out.println(message);
    }
}
