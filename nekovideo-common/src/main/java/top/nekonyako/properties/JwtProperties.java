package top.nekonyako.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: JwtProperties
 *
 * @author NEKOnyako
 * Description:
 * Date: 2023/09/19 0019 11:29
 */

@Component
@ConfigurationProperties(prefix = "nekomall.jwt")
@Data
public class JwtProperties {
    /**
     * 商家管理端jwt生成配置
     */
    private String adminSecretKey;

    /**
     * 超时时间
     */
    private long adminExpTtl;

    /**
     * token头
     */
    private String adminTokenName;

    /**
     * 用户APP端jwt生成配置
     */
    private String userSecretKey;
    private long userExpTtl;
    private String userTokenName;
}
