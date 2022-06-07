package ru.skypro.exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
        System.out.println(message);
    }
}
