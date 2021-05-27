package com.CoreSpring.Annotation.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudConfig {
    @Bean("std")
    public Student getstudName() {
        return new Student();
    }

}
