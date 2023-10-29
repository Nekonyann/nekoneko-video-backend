package top.nekonyako.exception;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: FileUploadException
 *
 * @author NEKOnyako
 * Description:
 * Date: 2023/10/27 0027 23:25
 */

/**
 * 文件上传业务异常处理
 */
public class FileUploadException extends RuntimeException{
    public FileUploadException() {
    }

    public FileUploadException(String msg) {
        super(msg);
    }
}
