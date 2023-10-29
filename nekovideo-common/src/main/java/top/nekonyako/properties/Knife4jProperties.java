package top.nekonyako.properties;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: Knife4jProperties
 * @author NEKOnyako
 * Description:
 * Date: 2023/09/21 0021 11:10
 */

@Data
@Component
@ConfigurationProperties(prefix = "nekomall.knife4j")
@ConditionalOnProperty(prefix = "nekomall.knife4j",value = "package-path")
public class Knife4jProperties implements Serializable {
    private String packagePath;

    private String title;

    private String description;

    private String contactName;

    private String contactUrl;

    private String contactEmail;

    private String version;
}
