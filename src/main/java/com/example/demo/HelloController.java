package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("api/hello")
	public String hello() {
		return "안녕하세요"
				+ "또 뵙네용~~ㅎㅎ";
	}
}
