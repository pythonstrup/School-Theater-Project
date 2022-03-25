package com.bigbell.st.web.api;

import org.springframework.web.bind.annotation.RestController;

import com.bigbell.st.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserApiController {

	private final UserService userService;
	
	// 예약기능
}
