package com.CoreSpring.Annotation.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddConfig {
    @Bean("add")
    public Address getstudAddress() {
        return new Address();
    }
}
