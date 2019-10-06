package com.example.Week4.Model;

import com.example.Week4.Common;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


public class Person extends Common {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public String Username;
    public String Password;
    public Long id;
    public enum Gender{
        MALE,
        FEMALE
    }
    @CreatedDate
    private Date CreatedDate;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
