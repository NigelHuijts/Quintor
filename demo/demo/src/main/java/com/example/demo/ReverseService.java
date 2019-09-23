package com.example.demo;

import org.springframework.stereotype.Component;

@Component("reversedString")
public class ReverseService {

    public String reverseString(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return rev;
    }
}
