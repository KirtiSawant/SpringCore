package com.springCore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student stud = (Student) context.getBean("stud");

        System.out.println(stud.getStudentId());
        System.out.println(stud.getStudentName());
        System.out.println(stud.getStudentAddress());
    }
}
