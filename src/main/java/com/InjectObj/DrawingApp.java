package com.InjectObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("d.xml");
        Triangle tri = (Triangle) context.getBean("tri");
        tri.draw();
    }
}
