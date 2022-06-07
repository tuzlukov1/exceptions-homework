package ru.skypro;

import ru.skypro.exceptions.WrongLoginException;
import ru.skypro.exceptions.WrongPasswordException;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkLoginValid("Yan_1994", "password_1", "password_1") + "\n");
        System.out.println(checkLoginValid("Yan_19944444444444444444444444444444444444444444444",
                "password_1", "password_1") + "\n");
        System.out.println(checkLoginValid("Yan_1994", "password_11111111111111111111111111111111111111" +
                "11111111111111111", "password_1") + "\n");
        System.out.println(checkLoginValid("Yan_1994", "password_1", "password") + "\n");
        System.out.println(checkLoginValid("Yan_1994", "password", "password_1") + "\n");
        System.out.println(checkLoginValid("Yan*1994", "password*1", "password_1") + "\n");
        System.out.println(checkLoginValid("Yan_1994", "password*1", "password*1") + "\n");
    }

    private static boolean checkLoginValid(String login, String password, String confirmPassword) {
        boolean state = true;
        try {
            if (login.length() > 20) throw new WrongLoginException("Длина логина должна быть <= 20 символов");
            if (password.length() > 20) throw new WrongPasswordException("Длина пароля должна быть <= 20 символов");

            if (!login.matches("[a-zA-Z0-9_]*")) {
                throw new WrongLoginException("Логин должен состоять из латинских символов,цифр и знака _");
            }

            if (!password.matches("[a-zA-Z0-9_]*")) {
                throw new WrongPasswordException("Пароль должен состоять из латинских символов,цифр и знака _");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Подтверждение пароля и пароль не совпадают");

            }
        } catch (WrongLoginException | WrongPasswordException exception) {
            state = false;
        } finally {
            return state;
        }
    }
}
