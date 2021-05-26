package com.StandardAnnotation.JSR;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class EmployeeService {
    @Inject
    EmployeeDao employee;

    public void save() {
        System.out.println("EmployeeService save method");
        employee.save();
    }
}
