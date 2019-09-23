package com.example.demo;

import org.springframework.stereotype.Component;

@Component("countedWords")
public class CountService {
    public int countWords(String s) {
        if (s.length() == 0){
            return 0;
        }

        String[] words = s.split("\\s+");
        int wordCount = words.length;

        if(s.substring(0,1).equals(" ")){
            wordCount--;
        }

        return wordCount;
    }
}
