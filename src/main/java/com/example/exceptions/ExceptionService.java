package com.example.exceptions;

import java.util.Objects;

public class ExceptionService {




    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        char[] symbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_',
                'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',
                'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        if (Objects.isNull(login) || login.length() > 20) {
            throw new WrongLoginException();
        }
        for (int i = 0; i < login.length(); i++) {
            for (int j = 0; j < symbols.length; j++) {
                if (login.charAt(i) == symbols[j]) {
                    break;
                }
                if (j == symbols.length - 1) {
                        throw new WrongLoginException();
                }
            }
        }
        if (Objects.isNull(password) || password.length() > 19) {
            throw new WrongPasswordException();
        }
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < symbols.length; j++) {
                if (password.charAt(i) == symbols[j]) {
                    break;
                }
                if (j == symbols.length - 1) {
                        throw new WrongPasswordException();
                }
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}

