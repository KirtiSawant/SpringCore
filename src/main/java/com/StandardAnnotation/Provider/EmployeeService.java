package com.StandardAnnotation.Provider;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

@Named
public class EmployeeService {
    @Inject
    private Provider employeeProvider;

    public Employee getEmployee() {
        return (Employee) employeeProvider.get();
    }
}
