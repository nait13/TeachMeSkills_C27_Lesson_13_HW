package com.teachmeskills.lesson13_hw.validator;

import com.teachmeskills.lesson13_hw.consts.Consts;
import com.teachmeskills.lesson13_hw.custom_exception.WrongPasswordException;
import com.teachmeskills.lesson13_hw.util.Util;

/**
 * This class checks the user's password
 */
public class PasswordValidator {
    public static boolean checkPass(String pass, String confirmPass) throws WrongPasswordException {
        if (pass.length() >= Consts.MAX_PASS_LENGTH) {
            throw new WrongPasswordException("Не правильно введёт пароль, максимальное количество символов " + Consts.MAX_PASS_LENGTH, 401);
        }
        if (pass.contains(" ") || confirmPass.contains(" ")) {
            throw new WrongPasswordException("Ошибка, в пароле не должно быть пустых строк", 402);
        }
        if (Util.countDigitsInPassword(pass) < Consts.MIN_PASSWORD_DIGIT_REQUIRED) {
            throw new WrongPasswordException("Пароль должен содержать < " + Consts.MIN_PASSWORD_DIGIT_REQUIRED + " символов ", 403);
        }
        if (!pass.equals(confirmPass)) {
            throw new WrongPasswordException("Пароли не совпадают ", 403);
        }

        return true;
    }
}


