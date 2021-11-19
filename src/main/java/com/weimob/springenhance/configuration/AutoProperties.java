package com.weimob.springenhance.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dubbo.service")
public class AutoProperties {

    /**
     * 扫描的包路径
     */
    private String[] basePackages;


    public String[] getBasePackages() {
        return basePackages;
    }

    public void setBasePackages(String[] basePackages) {
        this.basePackages = basePackages;
    }
}
