package com.Spring.Callback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("draw.xml");
        context.registerShutdownHook();
        Triangle1 tri = (Triangle1) context.getBean("tri");
        tri.draw();
    }
}
