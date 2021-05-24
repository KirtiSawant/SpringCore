package com.CoreSpring.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("E.xml");
        context.registerShutdownHook();
        Example example = (Example) context.getBean("example");
        System.out.println(example);
    }
}
