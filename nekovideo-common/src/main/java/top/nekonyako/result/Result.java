package top.nekonyako.result;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: Result
 * @author NEKOnyako
 * Description:
 * Date: 2023/09/18 0018 20:04
 */

@Data
public class Result<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.code = 1;
        return result;
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 1;
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }

}
