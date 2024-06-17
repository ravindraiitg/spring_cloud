package com.ravindra.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${spring.cloud.config.server.git.uri}")
    private String uri;

    @GetMapping("/uri")
    public String getUri() {
        return "Config Server URI : " + this.uri;
    }
}
