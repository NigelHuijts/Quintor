package com.example.demo.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

public class Account {
    @Id
    @GeneratedValue
    private long Id;
    private String IBAN;
    private String accountNumber;
}