package com.xcafe.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = "application.properties")
public class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        // PropertySourcesPlaceholderConfigurer bean is needed
        // to resolve properties syntax inside @Value
        return new PropertySourcesPlaceholderConfigurer();
    }
}
