package com.example.Week4.Model;

import javax.persistence.*;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "AccountId")
    private Long accountId;

    @Column(name = "Balance")
    private double balance;

    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer holder;

    @ManyToOne
    @JoinColumn(name = "EmployeeId")
    private Employee manager;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
