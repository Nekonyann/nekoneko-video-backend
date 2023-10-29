package top.nekonyako.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: FileUploadProperties
 *
 * @author NEKOnyako
 * Description:
 * Date: 2023/10/27 0027 23:20
 */

@Component
@ConfigurationProperties(prefix = "nekomall.file")
@Data
public class FileUploadProperties {
    /**
     * 上传文件的根路径
     */
    private String uploadPath;
    /**
     * 相对临时文件路径 <be> 请链接文件夹使用而不是存放在根路径
     */
    private String realTempFile;
    /**
     * 相对视频临时文件路径 - 转码前原视频
     */
    private String realVideoFileTemp;
    /**
     * 相对视频路径 - 转码后视频
     */
    private String realVideoFile;
    /**
     * 相对图片路径
     */
    private String realImagesFile;
}
