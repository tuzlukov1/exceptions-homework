package ru.skypro.exceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
        System.out.println(message);
    }
}
