package com.StandardAnnotation.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        EmployeeService service = context.getBean(EmployeeService.class);
        System.out.println(service.getEmployee().getEmpMsg());
        context.close();
    }
}
