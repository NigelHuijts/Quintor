package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

@Controller
@RequestMapping("counting")
public class CountComponent {

    HashMap<String, Integer> usedStrings = new HashMap<String, Integer>();

    @Autowired
    private CountWordsComponent countWordsComponent;
    public @ResponseBody String wordCount(@PathVariable String input){
        if(input != null){

            String message = "";
            int words = 0;
            if(usedStrings.containsKey(input)){
                message = "Input was already in the list, word count: ";
                words = usedStrings.get(input);
            } else {
                words = countWordsComponent.WordCount(input);
                message = "Input added to the list, word count: ";
            }
            usedStrings.put(input, countWordsComponent.WordCount(input));
            return message + words;
        }
        else{
            return "Please give input";
        }
    }
    public static void main(String[] args){

    }
}
