package com.CoreSpring.Annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({StudConfig.class, AddConfig.class})
public class AppConfig {

}
