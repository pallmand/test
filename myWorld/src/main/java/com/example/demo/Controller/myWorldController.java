package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9092")
@RequestMapping("/first")  
public class myWorldController {
	
	@GetMapping("/next")
	public String Home() {
		return(" welcome to my world");
	}

}
