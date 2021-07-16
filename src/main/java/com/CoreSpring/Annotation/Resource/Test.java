package com.CoreSpring.Annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("res.xml");
        Employee emp = context.getBean("myemployee", Employee.class);
        System.out.println(emp.toString());
    }
}
