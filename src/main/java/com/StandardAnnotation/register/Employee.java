package com.StandardAnnotation.register;

import javax.inject.Named;

@Named
public class Employee {
    public String getEmpMsg() {
        return "Software makes world beautiful";
    }
}
