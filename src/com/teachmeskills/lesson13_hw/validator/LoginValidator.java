package com.teachmeskills.lesson13_hw.validator;

import com.teachmeskills.lesson13_hw.consts.Consts;
import com.teachmeskills.lesson13_hw.custom_exception.WrongLoginException;

/**
 * In this class, the "checkLogin" method will check the user's login
 */
public class LoginValidator {

    public static boolean checkLogin(String login) throws WrongLoginException {
        if (login.contains(" ")) {
            throw new WrongLoginException("Ошибка, логин содерит пустые строки", 301);
        }

        if (login.length() >= Consts.MAX_LOGIN_LENGTH) {
            throw new WrongLoginException("Ошибка, маскимальная длинна строки <" + Consts.MAX_LOGIN_LENGTH, 302);
        }
        return true;
    }
}
