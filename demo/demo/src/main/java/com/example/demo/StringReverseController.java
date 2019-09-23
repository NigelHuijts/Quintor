package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("reverse")
public class StringReverseController {

	@Autowired
	private ReverseService reverseService;

	@GetMapping(value = "/{input}", produces = "application/json")
	public @ResponseBody String stringReverse(@PathVariable String input){
		return reverseService.reverseString(input);
	}
}