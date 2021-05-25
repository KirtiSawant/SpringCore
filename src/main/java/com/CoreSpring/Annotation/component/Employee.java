package com.CoreSpring.Annotation.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
    @Value("Kirti")
    private String employeeName;
    @Value("Baramati")
    private String city;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Employee[employeeName=" + employeeName + ",city=" + city + "]";

    }
}
