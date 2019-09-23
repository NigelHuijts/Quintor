package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class DemoComponent {
    @RequestMapping
    public static String reverse(String original) {
        return new StringBuilder(original).reverse().toString();
    }
}