package com.example.simpletodo.category.exception;

import com.example.simpletodo.common.exception.CommonExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class CategoryNotFoundHandler extends CommonExceptionHandler {
    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<CategoryNotFoundResponse> categoryNotFound(CategoryNotFoundException categoryNotFoundException, HttpServletRequest req) {
        CategoryNotFoundResponse exception = new CategoryNotFoundResponse(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, new Date(), categoryNotFoundException.getLocalizedMessage());
        return new ResponseEntity<>(exception, exception.getStatus());
    }
}
