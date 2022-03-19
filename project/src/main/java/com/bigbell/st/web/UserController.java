package com.bigbell.st.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bigbell.st.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {

	private final UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "basic/home";
	}
	
	@GetMapping("/theater") 
	public String theater() {
		return "basic/theater";
	}
	
	@GetMapping("/user/reservation")
	public String reservation() {
		return "user/reservation";
	}
}
