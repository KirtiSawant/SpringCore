package com.StandardAnnotation.JSR;

import javax.inject.Named;

@Named
public class EmployeeDao {
    public void save() {
        System.out.println("Employee save method");
    }
}
