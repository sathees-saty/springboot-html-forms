package com.example.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {
	
	/* http://localhost:8080/evenForm */
	@GetMapping("/evenForm")
	public String evenForm() {
		return "eventest";
	}
	
	/* http://localhost:8080/processEven */
	@GetMapping("/processEven")
	@ResponseBody
	public boolean processEven(@RequestParam("number") int number ) {
		
		return (number % 2 ==0);
		
	}
	
	/* http://localhost:8080/viewParagraph */
	@GetMapping("/viewParagraph")
	public String viewParagraph() {
		return "paragraph";
	}
}
