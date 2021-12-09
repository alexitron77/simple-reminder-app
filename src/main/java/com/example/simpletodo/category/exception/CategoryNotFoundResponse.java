package com.example.simpletodo.category.exception;

import com.example.simpletodo.common.exception.GenericExceptionResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Setter
@Getter
public class CategoryNotFoundResponse extends GenericExceptionResponse {
    public CategoryNotFoundResponse(Integer statusCode, HttpStatus status, Date date, String message) {
        super(statusCode, status, date, message);
    }
}
