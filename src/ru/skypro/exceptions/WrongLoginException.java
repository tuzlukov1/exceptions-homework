package ru.skypro.exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
        System.out.println(message);
    }
}
