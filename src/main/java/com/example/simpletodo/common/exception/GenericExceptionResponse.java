package com.example.simpletodo.common.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
public class GenericExceptionResponse {
    private Integer statusCode;
    private HttpStatus status;
    private Date date;
    private String message;

    public GenericExceptionResponse(Integer statusCode, HttpStatus status, Date date, String message) {
        this.statusCode = statusCode;
        this.status = status;
        this.date = date;
        this.message = message;
    }
}
