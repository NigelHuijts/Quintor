package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class CountWordsComponent {

    public static int WordCount(String words){
        if(words == null || words.isEmpty()){
            return 0;
        }
        String[] AllWords = words.split("\\w+");
        return AllWords.length;
    }
}
