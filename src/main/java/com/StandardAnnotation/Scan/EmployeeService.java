package com.StandardAnnotation.Scan;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class EmployeeService {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @Inject
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
