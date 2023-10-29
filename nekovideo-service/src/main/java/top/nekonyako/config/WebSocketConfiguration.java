package top.nekonyako.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: WebSocketConfiguration
 * @author NEKOnyako
 * Description: WebSocket配置类，用于注册WebSocket的Bean
 * Date: 2023/09/22 0022 11:04
 */

public class WebSocketConfiguration {
    /**
     * 注入一个ServerEndpointExporter,该Bean会自动注册使用@ServerEndpoint注解申明的websocket endpoint
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
