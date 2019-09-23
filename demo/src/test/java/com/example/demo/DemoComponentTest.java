package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class DemoComponentTest {

    @Autowired
    DemoComponent demoComponent;
    @Autowired
    CountWordsComponent countWordsComponent;
    @Test
    public void Testreverse() {
        String message = demoComponent.reverse("Klas 3E");
        Assert.assertEquals("E3 salK", message);
    }
    @Test
    public void TestWordCount(){
        int message = countWordsComponent.WordCount("1 2 3 4 5");
        Assert.assertEquals(5, message);
    }
}