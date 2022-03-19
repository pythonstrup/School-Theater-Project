package com.bigbell.st.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
	
	@GetMapping("/auth/signin")
	public String signin() {
		return "auth/signin";
	}
	
	@GetMapping("/auth/signup")
	public String signup() {
		return "auth/signup";
	}
}
