package com.bigbell.st.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigbell.st.domain.user.User;
import com.bigbell.st.service.AuthService;
import com.bigbell.st.web.dto.CMRespDto;
import com.bigbell.st.web.dto.auth.SignupDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AuthApiController {

	private final AuthService authService;
	
	@PostMapping("/auth/api/signup")
	public ResponseEntity<?> signup(SignupDto signupDto) {
		User user = signupDto.toEntity();
		authService.회원가입(user);
		
		return new ResponseEntity<>(new CMRespDto<>(1, "회원가입 성공", null), HttpStatus.OK);
	}
	
	@GetMapping("/auth/api/signup/{username}/exists")
	public ResponseEntity<Boolean> checkUsernameDuplicate(@PathVariable String username){
		return ResponseEntity.ok(authService.아이디중복체크(username));
	}
	
	@GetMapping("/auth/api/signup/{email}/exists")
	public ResponseEntity<Boolean> checkEmailDuplicate(@PathVariable String email){
		return ResponseEntity.ok(authService.이메일중복체크(email));
	}
}
