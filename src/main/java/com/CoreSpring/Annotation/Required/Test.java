package com.CoreSpring.Annotation.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Company.xml");
        //  context.registerShutdownHook();
        Company company = (Company) context.getBean("company");
        System.out.println(company);
    }
}
