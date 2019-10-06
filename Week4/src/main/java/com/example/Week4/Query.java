package com.example.Week4;

import com.example.Week4.Model.Employee;
import org.hibernate.Session;

import javax.persistence.TypedQuery;
import java.util.List;

public class Query {

    private Session s;

    public List<Employee> threeOrMore(){

        TypedQuery<Employee> q = s.createQuery("SELECT manager FROM Account a WHERE a.holder HAVING COUNT(Customer.accounts) >= 3", Employee.class);

        List<Employee> t = q.getResultList();
        return t;
    }
}

