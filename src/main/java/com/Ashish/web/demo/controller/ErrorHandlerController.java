package com.Ashish.web.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.Ashish.web.demo.exception.ApplicationError;
import com.Ashish.web.demo.exception.GameNotFoundException;

@ControllerAdvice
@RestController
public class ErrorHandlerController extends ResponseEntityExceptionHandler {
	
	@Value("${api_doc_uri}")
	private String details;
	
	@ExceptionHandler(GameNotFoundException.class)
	public ResponseEntity<ApplicationError> handleGameNotFoundException(GameNotFoundException exception,WebRequest webRequest){
		ApplicationError error = new ApplicationError();
		error.setCode(101);
		error.setMessage(exception.getMessage());
		error.setDetails(details);
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
