package com.example.simpletodo.category.exception;

import com.example.simpletodo.common.exception.CommonException;

public class CategoryNotFoundException extends CommonException {
    public CategoryNotFoundException(String message) {
        super(message);
    }
}
