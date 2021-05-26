package com.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
        Bike bike1 = context.getBean("bike", Bike.class);
        System.out.println(bike1);
        bike1.Gear();
    }
}
