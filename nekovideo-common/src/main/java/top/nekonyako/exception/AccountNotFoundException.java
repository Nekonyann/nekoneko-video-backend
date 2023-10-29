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
 * 账号不存在异常
 */
public class AccountNotFoundException extends BaseException{

    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }
}
