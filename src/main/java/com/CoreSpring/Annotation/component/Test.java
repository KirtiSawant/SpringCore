package com.CoreSpring.Annotation.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee);
    }

}
