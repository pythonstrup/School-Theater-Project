package com.bigbell.st.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bigbell.st.domain.user.User;
import com.bigbell.st.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthService {
	
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void 회원가입(User user) {
		
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		userRepository.save(user);
	}

	public boolean 아이디중복체크(String username) {
		
		return userRepository.existsByUsername(username);
	}

	public boolean 이메일중복체크(String email) {
		
		return userRepository.existsByEmail(email);
	}

}
