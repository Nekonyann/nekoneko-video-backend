package top.nekonyako.exception;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: BaseException
 *
 * @author NEKOnyako
 * Description:
 * Date: 2023/09/22 0022 10:48
 */

/**
 * 自定义业务异常
 */
public class BaseException extends RuntimeException {
    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }

}
