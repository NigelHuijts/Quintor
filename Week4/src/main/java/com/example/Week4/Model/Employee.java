package com.example.Week4.Model;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

    public String EmployeeFunction;


    public String getEmployeeFunction() {
        return EmployeeFunction;
    }

    public void setEmployeeFunction(String employeeFunction) {
        EmployeeFunction = employeeFunction;
    }

}
