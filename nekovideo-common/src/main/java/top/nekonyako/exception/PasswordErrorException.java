package top.nekonyako.exception;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: AccountNotFoundException
 *
 * @author NEKOnyako
 * Description:
 * Date: 2023/10/08 0008 14:40
 */

/**
 * 密码错误异常
 */
public class PasswordErrorException extends BaseException{

    public PasswordErrorException() {
    }

    public PasswordErrorException(String msg) {
        super(msg);
    }
}
