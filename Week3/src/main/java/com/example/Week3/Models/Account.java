package com.example.Week3.Models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account<AccountHolders> {
    @Id
    private Long id;
    private Long IBAN;
    private Double saldo;
    private AccountHolders[] rekeninghouders;
    private boolean Status;

    public Long getId() {
        return id;
    }

    public Long getIBAN() {
        return IBAN;
    }

    public void setIBAN(Long IBAN) {
        this.IBAN = IBAN;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public AccountHolders[] getRekeninghouders() {
        return rekeninghouders;
    }

    public void setRekeninghouders(AccountHolders[] rekeninghouders) {
        this.rekeninghouders = rekeninghouders;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
