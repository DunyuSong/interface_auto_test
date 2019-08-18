package com.hdjnb.interfaceautotest.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "const")
@Data
public class AppConfig {
    private String excelFileName;
}
