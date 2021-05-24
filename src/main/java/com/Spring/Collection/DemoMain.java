package com.Spring.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("colle.xml");
        Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp.getName());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourses());
    }
}
