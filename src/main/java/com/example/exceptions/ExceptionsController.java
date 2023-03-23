package com.example.exceptions;

public class ExceptionsController {

    public static boolean checkUser(String login, String password, String confirmPassword) {
        try {
            ExceptionService.check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            return false;
        } catch (WrongPasswordException e) {
           return false;
        } finally {
            System.out.println("Проверка завершена");
        }
        return true;
    }



}
