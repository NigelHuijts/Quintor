package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("wordcount")
public class WordCountController {


    public HashMap<String, Integer> usedStrings = new HashMap<>();

    @Autowired
    private CountService countService;

    @GetMapping(value = "/{input}", produces = "application/json")
    public @ResponseBody String wordCount(@PathVariable String input){
        String message = "";
        if (input.length() > 0) {

            int words = 0;
            if (usedStrings.containsKey(input)) {
                message = "Input was already in the list. Word count: " + usedStrings.get(input);
            } else {
                message = "Input added to list. Word count: " + countService.countWords(input);
            }
            usedStrings.put(input, countService.countWords(input));
            return message;
        }
        else {
            message = "No input provided.";
            return message;
        }
    }
}
