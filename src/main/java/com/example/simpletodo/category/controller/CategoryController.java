package com.example.simpletodo.category.controller;

import com.example.simpletodo.category.model.Category;
import com.example.simpletodo.category.service.CategoryService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryController {
    private final @NonNull CategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getCategories());
    }
}
