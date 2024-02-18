package com.teachmeskills.lesson13_hw.service;

import com.teachmeskills.lesson13_hw.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13_hw.custom_exception.WrongPasswordException;
import com.teachmeskills.lesson13_hw.validator.LoginValidator;
import com.teachmeskills.lesson13_hw.validator.PasswordValidator;

/**
 * This class validates the data and registers the user
 */
public class UserRegistrationService {
    public static void registerUser(String login, String password, String confirmPassword) {
        try {
            LoginValidator.checkLogin(login);
            PasswordValidator.checkPass(password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Какая-та другая ошибка");
        }
    }
}
