package com.example.simpletodo.common.exception;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<GenericExceptionResponse> genericHandler(Exception ex, HttpRequest req) {
        GenericExceptionResponse genericResponse = new GenericExceptionResponse(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, new Date(), "Something went wrong");
        return new ResponseEntity<>(genericResponse, genericResponse.getStatus());
    }
}
