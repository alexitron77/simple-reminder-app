package com.example.simpletodo.category.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
}
