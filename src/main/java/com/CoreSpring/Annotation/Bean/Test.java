package com.CoreSpring.Annotation.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (Student) context.getBean("std");
        student.studName();
        Address address = (Address) context.getBean("add");
        address.studAddress();
    }
}
