package com.example.studentdetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {
	
	@ExceptionHandler(StudentNotFoundAgeException.class)
	public ResponseEntity<Object>  ageNotFound() {
		return new ResponseEntity<>("Your age is not eligible ",HttpStatus.NOT_FOUND);
	}

}
