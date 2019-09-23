package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordCountControllerTests {

    @Autowired
    WordCountController wordCountController;

    @Test
    public void testWordCount(){
        wordCountController.usedStrings.put("test2", 1);

        String noText = wordCountController.wordCount("");
        String message1 = wordCountController.wordCount("apple banana pear");
        String message2 = wordCountController.wordCount(" testSpace");
        String message3 = wordCountController.wordCount("test2");

        Assert.assertEquals("No input provided.", noText);
        Assert.assertEquals("Input added to list. Word count: 3", message1);
        Assert.assertEquals("Input added to list. Word count: 1", message2);
        Assert.assertEquals("Input was already in the list. Word count: 1", message3);
    }


}
