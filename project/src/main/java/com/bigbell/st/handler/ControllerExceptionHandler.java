package com.bigbell.st.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.bigbell.st.handler.ex.CustomApiException;
import com.bigbell.st.handler.ex.CustomException;
import com.bigbell.st.handler.ex.CustomValidationApiException;
import com.bigbell.st.handler.ex.CustomValidationException;
import com.bigbell.st.util.Script;
import com.bigbell.st.web.dto.CMRespDto;

@RestController
@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler
	public String validationException(CustomValidationException e) {
		
		if (e.getErrorMap() == null) {
			return Script.back(e.getMessage());
		} else {
			return Script.back(e.getErrorMap().toString());
		}
	}
	
	@ExceptionHandler(CustomException.class)
	public String exception(CustomException e) {
		return Script.back(e.getMessage());
	}
	
	@ExceptionHandler(CustomValidationApiException.class)
	public ResponseEntity<?> validationApiException(CustomValidationApiException e) {
		
		return new ResponseEntity<>(new CMRespDto<>(-1, e.getMessage(), e.getErrorMap()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CustomApiException.class)
	public ResponseEntity<?> apiException(CustomApiException e) {
		
		return new ResponseEntity<>(new CMRespDto<>(-1, e.getMessage(), null), HttpStatus.BAD_REQUEST);
	}
}
