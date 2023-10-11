package com.oasys.student.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class globalException {
@ExceptionHandler(AgeNotFoundException.class)
		public   ResponseEntity<Object>ageHandle(AgeNotFoundException s1) {
			return new ResponseEntity<>(s1.getMessage(),HttpStatus.NOT_FOUND);
			}
	}

