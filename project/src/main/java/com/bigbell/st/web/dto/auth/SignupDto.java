package com.bigbell.st.web.dto.auth;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.bigbell.st.domain.user.User;

import lombok.Data;

@Data
public class SignupDto {
	
	@NotBlank
	@Size(min=2, max=20, message="아이디는 4자 이상 20자 이하로 입력해주세요.")
	private String username;
	
	@NotBlank
//	@Size(min=4, max=20, message="패스워드는 4자 이상 20자 이하로 입력해주세요.")
	private String password;
	
	@NotBlank
	@Email(message="올바른 이메일 주소를 입력해주세요.")
	private String email;
	
	public User toEntity() {
		return User.builder()
						.username(username)
						.password(password)
						.email(email)
						.role("ROLE_USER")
						.build();
	}
} 
