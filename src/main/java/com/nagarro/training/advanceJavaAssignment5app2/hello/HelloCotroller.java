package com.nagarro.training.advanceJavaAssignment5app2.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}

}
