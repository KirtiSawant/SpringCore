package com.StandardAnnotation.Provider;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.StandardAnnotation.Provider")
public class AppConfig {
}
