package com.weimob.springenhance.configuration;

import com.weimob.springenhance.context.DubboClassContainer;
import com.weimob.springenhance.scanner.DefaultDefinitionScanner;
import com.weimob.springenhance.scanner.IDefinitionScanner;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(AutoProperties.class)
@ConditionalOnProperty(value = "bird.service.rid.base-packages")
public class AutoConfiguration {

    private AutoProperties autoProperties;
    public AutoConfiguration(AutoProperties properties) {
        autoProperties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(IDefinitionScanner.class)
    public  IDefinitionScanner definitionScanner(){
        return new DefaultDefinitionScanner();
    }

    @Bean
    public DubboClassContainer dubboClassContainer(IDefinitionScanner definitionScanner){
        return new DubboClassContainer(autoProperties,definitionScanner);
    }








}
