package com.bigbell.st.web;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bigbell.st.domain.user.User;
import com.bigbell.st.service.AuthService;
import com.bigbell.st.web.dto.CMRespDto;
import com.bigbell.st.web.dto.auth.SignupDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AuthController {
	
	private final AuthService authService;
	
	@GetMapping("/auth/signin")
	public String signin() {
		return "auth/signin";
	}
	
	@GetMapping("/auth/signup")
	public String signup() {
		return "auth/signup";
	}
	
	@PostMapping("/auth/signup")
	public String signup(@Valid SignupDto signupDto, BindingResult bindingResult) {
		User user = signupDto.toEntity();
		authService.회원가입(user);
		
		return "/auth/signin";
	}
}
